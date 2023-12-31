package de.luca.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;
import de.luca.debug.Logger;
import de.luca.ui.Listener;
import de.luca.ui.UiManager;
import de.luca.ui.parts.Button;
import de.luca.ui.parts.ImageButton;

public class MainScreen implements Screen {

    Button button;
    Button button2;

    public MainScreen() {
        button = new Button("Hallo Welt", 20, 50, 500, 100);
        button2 = new Button("", 80, 80, 200, 400);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0.4f, 0.4f, 0.3f, 1);
        UiManager.refresh();
        UiManager.draw(button);
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
