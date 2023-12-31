package de.luca.ui.parts;

public class SelectButton extends Button {

    private String value = "";

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
