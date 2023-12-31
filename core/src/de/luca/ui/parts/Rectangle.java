package de.luca.ui.parts;

import de.luca.ui.StaticObjects;
import de.luca.ui.UiPart;

public class Rectangle extends UiPart {

    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        StaticObjects.renderer.rect(getX(), getY(), width, height);
    }

}
