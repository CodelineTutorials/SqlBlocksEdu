package de.luca.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;
import de.luca.debug.Logger;
import de.luca.ui.Listener;
import de.luca.ui.UiManager;
import de.luca.ui.input.KeyboardInputHandler;
import de.luca.ui.input.KeyboardInputType;
import de.luca.ui.parts.Button;
import de.luca.ui.parts.SelectButton;
import de.luca.ui.parts.SelectButtonGroup;
import de.luca.ui.parts.TextField;

public class MainScreen implements Screen {

    SelectButton button;
    SelectButton button2;
    SelectButton button3;
    SelectButton button4;
    SelectButtonGroup buttonGroup;
    Button testButton;
    TextField tf;

    public MainScreen() {
        UiManager.setBackground(new Texture("winter_pixabay.jpg"));
        button = new SelectButton("", 80, 50, 300, 100, "Obstesser");
        button2 = new SelectButton("Tomate", 80, 200, 300, 100, "GemueseTyp");
        button3 = new SelectButton("Kirsche", 600, 50, 300, 100, "Kirschenvieh");
        button4 = new SelectButton("DasIstEinSchoenLangerTestUmDasMalZuPruefen!!!", 600, 200, 300, 100, "LangerText");
        buttonGroup = new SelectButtonGroup(1, 1, button, button2, button3, button4);
        testButton = new Button("finish", 500, 500, 50, 50);
        tf = new TextField(800, 800, 200, 60, KeyboardInputType.NUMBERS);
        tf.setBorderEnabled(true);
        tf.setMaxTextLength(0);
        tf.setWrappingEnabled(true);

        testButton.setListener(new Listener() {
            @Override
            public void onHover() {

            }

            @Override
            public void onClick() {
                tf.setSelected(!tf.isSelected());
            }
        });

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0.4f, 0.4f, 0.3f, 1);
        UiManager.refresh();
        UiManager.draw(button, button2, button3, button4, buttonGroup, testButton, tf);
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
