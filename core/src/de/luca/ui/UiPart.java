package de.luca.ui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public abstract class UiPart {

    private int x;
    private int y;
    private int width;
    private int height;

    Listener listener = new Listener() {

        @Override
        public void onHover() {

        }

        @Override
        public void onClick() {

        }
    };

    public UiPart(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    public abstract void draw();

    public boolean isHovered() {
        if(UiManager.getMousePos().x > x && UiManager.getMousePos().x < x + width) {
            return UiManager.getMousePos().y > y && UiManager.getMousePos().y < y + height;
        }
        return false;
    }

    public boolean isClicked() {
        return isHovered() && Gdx.input.isButtonJustPressed(Input.Buttons.LEFT);
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


}
