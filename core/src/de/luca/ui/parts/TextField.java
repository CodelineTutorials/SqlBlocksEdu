package de.luca.ui.parts;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import de.luca.ui.StaticObjects;
import de.luca.ui.UiPart;
import de.luca.ui.input.KeyboardInputHandler;
import de.luca.ui.input.KeyboardInputType;
import de.luca.ui.interfaces.SelectableInput;

public class TextField extends UiPart implements SelectableInput {

    private boolean isSelected = false;
    private String text = "";
    private int maxTextLength = 0; // 0 = endless
    private Color color = Color.WHITE;
    private Color selectedColor = Color.LIGHT_GRAY;
    private Color borderColor = Color.BLACK;
    private Color selectedBorderColor = Color.DARK_GRAY;
    private Color textColor = Color.BLACK;
    boolean isTransparent;
    boolean isBorderEnabled;
    boolean isWrappingEnabled = false;
    KeyboardInputType inputType;

    /**
     * Constructor base for every child of UiPart
     *
     * @param x x position of UiPart object
     * @param y y position of UiPart object
     * @since 1.0
     */
    public TextField(int x, int y, int width, int height, KeyboardInputType inputType) {
        super(x, y);
        setWidth(width);
        setHeight(height);
        this.inputType = inputType;
    }

    @Override
    public void draw() {

        if(isSelected) {
            if(maxTextLength == 0 || text.length() < maxTextLength) {
                text += KeyboardInputHandler.getInput(this.inputType);
            }
            if(!text.isEmpty()) {
                if(Gdx.input.isKeyJustPressed(Input.Keys.BACKSPACE)) text = text.substring(0, text.length()-1);
            }
        }

        if(!isTransparent) {
            StaticObjects.renderer.begin(ShapeRenderer.ShapeType.Filled);
            if(!isSelected) StaticObjects.renderer.setColor(color);
            else StaticObjects.renderer.setColor(selectedColor);
            StaticObjects.renderer.rect(getX(), getY(), getWidth(), getHeight());
            StaticObjects.renderer.end();
        }
        if(isBorderEnabled) {
            StaticObjects.renderer.begin(ShapeRenderer.ShapeType.Line);
            if(!isSelected) StaticObjects.renderer.setColor(borderColor);
            else StaticObjects.renderer.setColor(selectedBorderColor);
            StaticObjects.renderer.rect(getX(), getY(), getWidth(), getHeight());
            StaticObjects.renderer.end();
        }
        StaticObjects.batch.begin();
        StaticObjects.font.setColor(textColor);
        StaticObjects.font.draw(StaticObjects.batch, this.text, getX(), getY() + getHeight() - 5, getWidth() - 1, 1, this.isWrappingEnabled);
        StaticObjects.batch.end();
    }

    @Override
    public void setSelected(boolean value) {
        this.isSelected = value;
    }

    @Override
    public boolean isSelected() {
        return this.isSelected;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public void setMaxTextLength(int maxTextLength) {
        this.maxTextLength = maxTextLength;
    }

    public int getMaxTextLength() {
        return this.maxTextLength;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public void setSelectedColor(Color color) {
        this.selectedColor = color;
    }

    public Color getSelectedColor() {
        return this.selectedColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public Color getBorderColor() {
        return this.borderColor;
    }

    public void setSelectedBorderColor(Color color) {
        this.selectedBorderColor = color;
    }

    public Color getSelectedBorderColor() {
        return this.selectedBorderColor;
    }

    public void setTextColor(Color color) {
        this.textColor = color;
    }

    public Color getTextColor() {
        return this.textColor;
    }

    public void setTransparent(boolean value) {
        this.isTransparent = value;
    }

    public boolean isTransparent() {
        return this.isTransparent;
    }

    public void setBorderEnabled(boolean value) {
        this.isBorderEnabled = value;
    }

    public boolean isBorderEnabled() {
        return this.isBorderEnabled;
    }

    public void setWrappingEnabled(boolean value) {
        this.isWrappingEnabled = value;
    }

    public boolean isWrappingEnabled() {
        return this.isWrappingEnabled;
    }

    public void setInputType(KeyboardInputType inputType) {
        this.inputType = inputType;
    }

    public KeyboardInputType getInputType() {
        return this.inputType;
    }

}
