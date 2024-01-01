package de.luca.ui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

/**
 * Abstract class used as base for every displayable UiPart object
 * @since 1.0
 */
public abstract class UiPart {

    /**
     * x position of UiPart object
     * @since 1.0
     */
    private int x;

    /**
     * y position of UiPart object
     * @since 1.0
     */
    private int y;

    /**
     * Width of UiPart object - 0 by default
     * @since 1.0
     */
    private int width = 0; // Value should be changed in the constructor of the subclasses

    /**
     * Height of UiPart object - 0 by default
     * @since 1.0
     */
    private int height = 0; // Value should be changed in the constructor of the subclasses

    /**
     * Listener object which is used to set events for each UiObject individually
     * @since 1.0
     */
    Listener listener = new Listener() {

        /**
         * Method which is being executed when mouse hovers over UiPart object
         * @since 1.0
         */
        @Override
        public void onHover() {

        }

        /**
         * Method which is being executed when mouse is being clicked while hovering over UiPart object
         * @since 1.0
         */
        @Override
        public void onClick() {

        }
    };

    /**
     * Constructor base for every child of UiPart
     * @since 1.0
     * @param x x position of UiPart object
     * @param y y position of UiPart object
     */
    public UiPart(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Setter being used to set events ({@link Listener} for specific UiPart objects
     * @since 1.0
     * @param listener Listener which is set for a specific UiPart objects
     */
    public void setListener(Listener listener) {
        this.listener = listener;
    }

    /**
     * Getter returning listener applied to a specific UiObject
     * @since 1.0
     * @return Listener which handles events of different UiPart objects
     */
    public Listener getListener() {
        return this.listener;
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
