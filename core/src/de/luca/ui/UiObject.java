package de.luca.ui;

import de.luca.ui.parts.Clickable;

public abstract class UiObject implements Clickable {

    private int x;
    private int y;
    private int width;
    private int height;
    public Clickable onClick;

    public UiObject(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return this.width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public void setOnClick(Clickable onClick) {
        this.onClick = onClick;
    }

}
