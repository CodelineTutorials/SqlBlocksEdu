package de.luca.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;
import de.luca.debug.Logger;
import de.luca.ui.Listener;
import de.luca.ui.StaticObjects;
import de.luca.ui.UiManager;
import de.luca.ui.input.KeyboardInputHandler;
import de.luca.ui.input.KeyboardInputType;
import de.luca.ui.parts.*;
import de.luca.ui.parts.Button;
import de.luca.ui.parts.TextField;

import java.awt.*;

public class MainScreen implements Screen {

    MenuButton settingsButton;
    Button languageSelectButton;
    Button colorschemeSelectButton;

    public MainScreen() {
        UiManager.setBackground(new Texture("Main01Template.png"));
        languageSelectButton = new Button(Constants.BUNDLE.getString("language"),
                0, 0, 200, 40);
        languageSelectButton.setColor(Color.valueOf("cb9c9c"));
        languageSelectButton.setTextColor(Color.WHITE);

        colorschemeSelectButton = new Button(Constants.BUNDLE.getString("colorscheme"),
                0, 0, 200, 40);
        colorschemeSelectButton.setColor(Color.valueOf("cb9c9c"));
        colorschemeSelectButton.setTextColor(Color.WHITE);

        settingsButton = new MenuButton(Constants.BUNDLE.getString("settings"),
                0, UiManager.getWindowHeight() - 61, 200, 61,
                languageSelectButton, colorschemeSelectButton);
        settingsButton.setColor(Color.valueOf("cb9c9c"));
        settingsButton.setTextColor(Color.WHITE);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0.4f, 0.4f, 0.3f, 1);
        UiManager.refresh();
        UiManager.draw(settingsButton);
    }

    @Override
    public void resize(int width, int height) {
        UiManager.setWindowWidth(width);
        UiManager.setWindowHeight(height);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
