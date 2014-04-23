package com.badlogic.drop;
import java.util.Iterator;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.TimeUtils;

public class Drop implements ApplicationListener {
	   Texture dropImage;
	   Texture bucketImage;
	   Sound dropSound;
	   Music rainMusic;
	   OrthographicCamera camera;
	   SpriteBatch batch;
	   Rectangle bucket;
	   Array<Rectangle> raindrops;
	   long lastDropTime;
	   
	   
	   @Override
	   public void create() {
		   // cargar las imágenes de la gota y el cubo, 64x64 píxeles
	      // load the images for the droplet and the bucket, 64x64 pixels each
	      dropImage = new Texture(Gdx.files.internal("droplet.png"));
	      bucketImage = new Texture(Gdx.files.internal("bucket.png"));
	      
	      // create the camera and the SpriteBatch(lotes o montones)
	      camera = new OrthographicCamera();
	      camera.setToOrtho(false, 800, 480);
	      batch = new SpriteBatch();
	      
	      // Cargar el efecto de sonido de la gota y el Fondo de la lluvia
	      // load the drop sound effect and the rain background "music"
	      dropSound = Gdx.audio.newSound(Gdx.files.internal("drop.wav"));
	      rainMusic = Gdx.audio.newMusic(Gdx.files.internal("rain.mp3"));
	      
	      // Iniciar la reproducción de la música de fondo de inmediato 
	      // start the playback of the background music immediately
	      rainMusic.setLooping(true);
	      rainMusic.play();
	      
	      
	     
	      // create a Rectangle to logically represent the bucket-
	      //Crear un rectángulo para representar lógicamente el cubo
	      bucket=new Rectangle();
	      bucket.x = 800 / 2 - 64 / 2;
	      bucket.y = 20;
	      bucket.width = 64;
	      bucket.height = 64;
	      
	   // create the raindrops array and spawn the first raindrop
	      raindrops = new Array<Rectangle>();
	      spawnRaindrop();
	 }
	   
	   private void spawnRaindrop() {
		    Rectangle raindrop = new Rectangle();
		    raindrop.x = MathUtils.random(0, 800-64);
		    raindrop.y = 480;
		    raindrop.width = 64;
		    raindrop.height = 64;
		    raindrops.add(raindrop);
		    lastDropTime = TimeUtils.nanoTime();
		 }
	    
	   

	@Override
	public void render() {
		 //limpiar la pantalla con un color azul oscuro. Los 
	      //argumentos glClearColor son el, verde rojo 
	      //componente azul y alfa en el rango [0,1] 
	      //del color que se utilizará para limpiar la pantalla.
	      Gdx.gl.glClearColor(0, 0, 0.2f, 1);
	      Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
	     
	      // tell the camera to update its matrices.
	      // actualizar la camara cada frame
	      camera.update();
	      
	      // tell the SpriteBatch to render in the
	      // coordinate system specified by the camera.
	      batch.setProjectionMatrix(camera.combined);
	      
	      // begin a new batch and draw the bucket and all drops
	      batch.begin();
	      batch.draw(bucketImage, bucket.x, bucket.y);
	      for(Rectangle raindrop: raindrops) {
	         batch.draw(dropImage, raindrop.x, raindrop.y);
	      }
	      batch.end();
	      
	      // process user input
	      // Movimiento
	      // Con este if moveremos el cubo donde estén tocando la pantalla,
	      //como esto es del tutorial sólo lo movemos en X
	      
	      if(Gdx.input.isTouched()) {
	    	    Vector3 touchPos = new Vector3();
	    	    touchPos.set(Gdx.input.getX(), Gdx.input.getY(), 0);
	    	    camera.unproject(touchPos);
	    	    bucket.x = touchPos.x - 64 / 2;
	    	    }
	      // Con estos if, movemos el cubo si alguien toca las teclas izquierda o 
	      //derecha.
	       if(Gdx.input.isKeyPressed(Keys.LEFT)) bucket.x -= 200 * Gdx.graphics.getDeltaTime();
	       if(Gdx.input.isKeyPressed(Keys.RIGHT)) bucket.x += 200 * Gdx.graphics.getDeltaTime();
	       
	       // make sure the bucket stays within the screen bounds
	       //asegúrese de que la cubeta se mantiene dentro de los límites de la pantalla
	       if(bucket.x < 0) bucket.x = 0;
	       if(bucket.x > 800 - 64) bucket.x = 800 - 64; 
	       
	       // check if we need to create a new raindrop  
	       if(TimeUtils.nanoTime() - lastDropTime > 1000000000) spawnRaindrop();
	      
	       // move the raindrops, remove any that are beneath(debajo) the bottom edge(borde) of
	       // the screen or that hit the bucket(cubo). In the later case we play back
	       // a sound effect as well.
	       // Mover las gotas de agua por la pantalla y quitar las que entran en el cubo o bien
	       // se salen de la pantalla. Reproducir sonido
	      Iterator <Rectangle> iter = raindrops.iterator();
	       while(iter.hasNext()) {
	          Rectangle raindrop = iter.next();
	          raindrop.y -= 200 * Gdx.graphics.getDeltaTime();
	          if(raindrop.y + 64 < 0) iter.remove();
	          if(raindrop.overlaps(bucket)) {
	             dropSound.play();
	             iter.remove();
	          }
	       }
	    }

	
	 @Override
	 public void dispose() {
		// dispose of all the native resource
	    dropImage.dispose();
	    bucketImage.dispose();
	    dropSound.dispose();
	    rainMusic.dispose();
	    batch.dispose();
	 }
	 
	 
	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	} 
	
}
