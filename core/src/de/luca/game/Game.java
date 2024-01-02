package de.luca.game;

import de.luca.debug.Logger;
import de.luca.ui.UiManager;

import java.util.Locale;

public class Game extends com.badlogic.gdx.Game {
	
	@Override
	public void create () {

		Locale.setDefault(Locale.GERMANY);
		this.setScreen(new MainScreen());
		UiManager.initialize();

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
