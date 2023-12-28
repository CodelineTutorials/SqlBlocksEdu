package de.luca.game;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import de.luca.debug.Debug;
import de.luca.game.Game;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setTitle("SqlBlocksEdu");

		// TODO.java: Make windows responsible so that no limitation is necessary
		// This part of the code shouldn't be in the product at the end!!
		config.setWindowSizeLimits(1920, 1080, 1920, 1080);
		config.setMaximized(true);
		config.setResizable(false);

		if(Debug.DEBUG_ENABLED) {
			config.setWindowSizeLimits(600, 400, 2560, 1440);
			config.setMaximized(false);
			config.setResizable(true);
		}

		new Lwjgl3Application(new Game(), config);
	}
}
