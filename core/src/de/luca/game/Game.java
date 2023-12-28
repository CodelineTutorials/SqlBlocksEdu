package de.luca.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import de.luca.debug.Logger;
import de.luca.ui.parts.Button;
import de.luca.ui.parts.Clickable;

public class Game extends com.badlogic.gdx.Game {
	
	@Override
	public void create () {

		this.setScreen(new MainScreen());
		System.out.println("hallo");
		Button button = new Button(10, 10, 10, 10);
		button.setOnClick(new Clickable() {
			@Override
			public void onClick() {
				System.out.println("Hallo Welt");
			}
		});
		button.onClick();

	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		System.out.println("\n\n");
		System.err.println("Total warnings encountered: " + Logger.getWarningCount());
		System.err.println("Total errors encountered: " + Logger.getErrorCount());
	}
}
