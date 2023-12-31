package de.luca.game;

import de.luca.debug.Logger;
import de.luca.ui.UiManager;

public class Game extends com.badlogic.gdx.Game {
	
	@Override
	public void create () {

		this.setScreen(new MainScreen());

	}

	@Override
	public void render () {
		UiManager.refresh();
		super.render();
	}
	
	@Override
	public void dispose () {
		System.out.println("\n\n");
		System.err.println("Total warnings encountered: " + Logger.getWarningCount());
		System.err.println("Total errors encountered: " + Logger.getErrorCount());
	}
}
