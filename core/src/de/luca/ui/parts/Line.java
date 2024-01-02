package de.luca.ui.parts;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import de.luca.ui.StaticObjects;
import de.luca.ui.UiPart;

public class Line extends UiPart {

    private int x1;
    private int y1;

    /**
     * Constructor base for every child of UiPart
     *
     * @param x x position of UiPart object
     * @param y y position of UiPart object
     * @since 1.0
     */
    public Line(int x, int y, int x1, int y1) {
        super(x, y);
        this.x1 = x1;
        this.y1 = y1;
    }

    @Override
    public void draw() {
        StaticObjects.renderer.begin(ShapeRenderer.ShapeType.Line);
        StaticObjects.renderer.line(getX(), getY(), x1, y1);
        StaticObjects.renderer.end();
    }

    public void setX1(int x) {
        this.x1 = x;
    }

    public int getX1() {
        return this.x1;
    }

    public void setY1(int y) {
        this.y1 = y;
    }

    public int getY1() {
        return this.y1;
    }

}
