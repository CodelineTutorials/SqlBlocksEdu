package de.luca.ui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;

public class UiManager {

    private static int windowWidth = Gdx.graphics.getWidth();
    private static int windowHeight = Gdx.graphics.getHeight();
    private static Vector2 mousePos = new Vector2(Gdx.input.getX(), windowHeight - Gdx.input.getY());

    // Handles everything that has to be refreshed constantly
    public static void refresh() {
        mousePos = new Vector2(Gdx.input.getX(), windowHeight - Gdx.input.getY());
    }

    public static void draw(UiPart... parts) {
        for(UiPart part: parts) {
            if(part.isClicked()) part.listener.onClick();
            else if(part.isHovered()) part.listener.onHover();
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
}
