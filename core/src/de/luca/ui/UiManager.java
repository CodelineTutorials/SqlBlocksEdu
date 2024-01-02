package de.luca.ui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import de.luca.debug.Logger;
import de.luca.ui.parts.Button;
import de.luca.ui.parts.SelectButtonGroup;
import de.luca.ui.themes.ThemeManager;

public class UiManager {

    private static int windowWidth = Gdx.graphics.getWidth();
    private static int windowHeight = Gdx.graphics.getHeight();
    private static Vector2 mousePos = new Vector2(Gdx.input.getX(), windowHeight - Gdx.input.getY());
    private static Texture background = null;

    public static void initialize() {
        ThemeManager.setSelectedTheme();
    }

    // Handles everything that has to be refreshed constantly
    public static void refresh() {
        mousePos = new Vector2(Gdx.input.getX(), windowHeight - Gdx.input.getY());
    }

    public static void draw(UiPart... parts) {

        if(background != null) {
            StaticObjects.batch.begin();
            StaticObjects.batch.draw(background, 0, 0);
            StaticObjects.batch.end();
        }
        for(UiPart part: parts) {
            if (part.isClicked()) part.listener.onClick();
            else if (part.isHovered()) part.listener.onHover();
            part.draw();
        }

    }

    public static Vector2 getMousePos() {
        return mousePos;
    }

    public static void setWindowWidth(int width) {
        windowWidth = width;
    }

    public static int getWindowWidth() {
        return windowWidth;
    }

    public static void setWindowHeight(int height) {
        windowHeight = height;
    }

    public static int getWindowHeight() {
        return windowHeight;
    }

    public static void setBackground(Texture texture) {
        background = texture;
    }

    public static Texture getBackground() {
        return background;
    }
}
