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
import de.luca.ui.parts.SelectButton;
import de.luca.ui.parts.SelectButtonGroup;

public class MainScreen implements Screen {

    SelectButton button;
    SelectButton button2;
    SelectButtonGroup buttonGroup;
    Button testButton;

    public MainScreen() {
        UiManager.setBackground(new Texture("winter_pixabay.jpg"));
        button = new SelectButton("Apfel", 80, 50, 300, 100, "Obstesser");
        button2 = new SelectButton("Tomate", 80, 200, 300, 100, "GemueseTyp");
        buttonGroup = new SelectButtonGroup(1, 1, button, button2);
        testButton = new Button("finish", 500, 500, 50, 50);

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0.4f, 0.4f, 0.3f, 1);
        UiManager.refresh();
        UiManager.draw(button, button2, buttonGroup, testButton);
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
