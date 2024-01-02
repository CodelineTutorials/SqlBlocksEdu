package de.luca.ui.parts;

import de.luca.ui.StaticObjects;
import de.luca.ui.UiPart;

public class Rectangle extends UiPart {

    /**
     * Constructor base for every child of UiPart
     *
     * @param x x position of UiPart object
     * @param y y position of UiPart object
     * @since 1.0
     */
    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        setWidth(width);
        setHeight(height);
    }

    @Override
    public void draw() {
        StaticObjects.renderer.rect(getX(), getY(), getWidth(), getHeight());
    }

}
