package com.me.tablero;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;

public class TableroZ implements ApplicationListener {
	//Creo todo lo que necesito en la pantalla de juego
	 OrthographicCamera camera;
     SpriteBatch batch;
	 Texture zombie;
	 Sprite sprite;
	 Music ambiente;
	 Rectangle personaje;
	
	@Override
	public void create() {		
		//creo un zombie
		zombie = new Texture(Gdx.files.internal("zombie.png"));
		
		//Music
		ambiente= Gdx.audio.newMusic(Gdx.files.internal("zmusic.mp3"));
		
		//start the playback of the background music inmediately
		ambiente.setLooping(true);
		ambiente.play();
		
		//Create the camera and the SpriteBatch
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800, 400);
		batch = new SpriteBatch();
		
		//Create a Rectangle to logically represent the bucket
		personaje=new Rectangle();
		personaje.x=800/2-64/2;//center the bucke horizontally
		personaje.y=20;//bottom left corner of the bucket is 20 pixels above the bottom screen edge
		personaje.width=64;
		personaje.height=64;
		
	/*	Texture Texture = new Texture(Gdx.files.internal("data/casa.jpg"));
		Texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		
		TextureRegion region = new TextureRegion(Texture, 0, 0, 512, 275);
		
		sprite = new Sprite(region);
		sprite.setSize(0.9f, 0.9f * sprite.getHeight() / sprite.getWidth());
		sprite.setOrigin(sprite.getWidth()/2, sprite.getHeight()/2);
		sprite.setPosition(-sprite.getWidth()/2, -sprite.getHeight()/2);*/
	}

	@Override
	public void dispose() {
	
		 
	}

	@Override
	public void render() {	
		//clear the screen with a dark blue color. The arguments to glClearColor are the red,green,blue and alpha 
		//component in the range [0,1] of the color to be used to clear the screen
		Gdx.gl.glClearColor(0, 0, 0.2f, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
	
		//tell camera to update its matrices
		camera.update();
		
		//tell the spritebatch to render in the coordinate system specified by the camera.
		batch.setProjectionMatrix(camera.combined);
		
		//Begin a new batch and draw the buckets and all drops
		batch.begin();
		batch.draw(zombie,personaje.x,personaje.y);
		batch.end();
		
		//process user input
		if(Gdx.input.isTouched()){
			Vector3 touchPos=new Vector3();
			touchPos.set(Gdx.input.getX(), Gdx.input.getY(), 0);
			camera.unproject(touchPos);
			personaje.x=touchPos.x - 64 / 2;
			personaje.y=touchPos.y - 64 / 2;
		}
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
