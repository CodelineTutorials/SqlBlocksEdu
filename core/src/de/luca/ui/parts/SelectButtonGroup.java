package de.luca.ui.parts;

import com.badlogic.gdx.graphics.Color;
import de.luca.ui.UiPart;

public class SelectButtonGroup extends UiPart {

    private Color unselectedButtonColor = Color.RED;
    private Color selectedButtonColor = Color.GREEN;
    private SelectButton selectedButton = null;
    private final SelectButton[] buttons;
    private String value = "";

    /**
     * Constructor base for every child of UiPart
     *
     * @param x x position of UiPart object
     * @param y y position of UiPart object
     * @since 1.0
     */
    public SelectButtonGroup(int x, int y, SelectButton... buttons) {
        super(x, y);
        this.buttons = buttons;
        for(SelectButton button: this.buttons) {
            button.setColor(unselectedButtonColor);
        }
    }

    @Override
    public void draw() {
        for(SelectButton button: buttons) {
            if(button != selectedButton && button.getColor() != unselectedButtonColor) {
                button.setColor(unselectedButtonColor);
            }
            if(button.isClicked()) {
                this.selectedButton = button;
                button.setColor(selectedButtonColor);
                value = button.getValue();
            }
        }
    }

    public void update() {

    }

    public void setUnselectedButtonColor(Color color) {
        this.unselectedButtonColor = color;
    }

    public Color getUnselectedButtonColor() {
        return this.unselectedButtonColor;
    }

    public void setSelectedButtonColor(Color color) {
        this.selectedButtonColor = color;
    }

    public Color getSelectedButtonColor() {
        return this.selectedButtonColor;
    }

    public SelectButton[] getButtons() {
        return buttons;
    }

    public void setSelectedButton(SelectButton selectedButton) {
        this.selectedButton = selectedButton;
        this.value = selectedButton.getValue();
    }

    public SelectButton getSelectedButton() {
        return this.selectedButton;
    }

    public String getValue() {
        return this.value;
    }

}
