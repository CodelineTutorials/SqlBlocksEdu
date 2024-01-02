package de.luca.ui.parts;

public class SelectButton extends Button {

    private String value = "";

    /**
     * Constructor base for every child of UiPart
     *
     * @param x x position of UiPart object
     * @param y y position of UiPart object
     * @since 1.0
     */
    public SelectButton(String text, int x, int y, int width, int height, String value) {
        super(text, x, y, width, height);
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
