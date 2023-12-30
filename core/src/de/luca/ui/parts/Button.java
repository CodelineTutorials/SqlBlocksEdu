package de.luca.ui.parts;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import de.luca.ui.StaticObjects;
import de.luca.ui.UiPart;

public class Button extends UiPart {

    private Color color = new Color(Color.WHITE);
    private Color hoverColor = new Color(Color.GRAY);
    private Color clickedColor = new Color(Color.DARK_GRAY);

    public Button(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void draw() {
        StaticObjects.renderer.begin(ShapeRenderer.ShapeType.Filled);
        if(isClicked()) StaticObjects.renderer.setColor(clickedColor);
        else if(isHovered()) StaticObjects.renderer.setColor(hoverColor);
        else StaticObjects.renderer.setColor(color);
        StaticObjects.renderer.rect(getX(), getY(), getWidth(), getHeight());
        StaticObjects.renderer.end();
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public void setHoverColor(Color color) {
        this.hoverColor = color;
    }

    public Color getHoverColor() {
        return this.hoverColor;
    }

    public void setClickedColor(Color color) {
        this.clickedColor = color;
    }

    public Color getClickedColor() {
        return this.clickedColor;
    }

}
