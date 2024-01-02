package de.luca.ui.parts;

import de.luca.ui.UiPart;

public class MenuButton extends Button {

    Button[] buttons;
    boolean isSelected = false;

    /**
     * Constructor base for every child of UiPart
     *
     * @param x x position of UiPart object
     * @param y y position of UiPart object
     * @since 1.0
     */
    public MenuButton(String text, int x, int y, int width, int height, Button... buttons) {
        super(text, x, y, width, height);
        this.buttons = buttons;
    }

    @Override
    public void draw() {

        if(this.isClicked()) isSelected = !isSelected;

        super.draw();
        if(isSelected) {
            int i = 0;
            for (Button button : buttons) {
                i += button.getHeight();
                button.setX(this.getX());
                button.setY(getY() - i);
                button.draw();
            }

        }
    }

    public void setButtons(Button... buttons) {
        this.buttons = buttons;
    }

    public Button[] getButtons() {
        return this.buttons;
    }

    public void setSelected(boolean value) {
        this.isSelected = value;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

}
