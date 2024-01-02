package de.luca.ui.parts;

import com.badlogic.gdx.graphics.Texture;
import de.luca.ui.StaticObjects;
import de.luca.ui.UiPart;

public class ImageButton extends UiPart {

    private Texture texture;
    private Texture hoverTexture = null;
    private Texture clickedTexture = null;

    /**
     * Constructor base for every child of UiPart
     *
     * @param x x position of UiPart object
     * @param y y position of UiPart object
     * @since 1.0
     */
    public ImageButton(int x, int y, Texture texture, Texture hoverTexture, Texture clickedTexture) {
        super(x, y);
        this.texture = texture;
        this.hoverTexture = hoverTexture;
        this.clickedTexture = clickedTexture;
        setWidth(texture.getWidth());
        setHeight(texture.getHeight());
    }

    @Override
    public void draw() {
        StaticObjects.batch.begin();
        if(isClicked()) StaticObjects.batch.draw(clickedTexture, getX(), getY());
        else if(isHovered()) StaticObjects.batch.draw(hoverTexture, getX(), getY());
        else StaticObjects.batch.draw(texture, getX(), getY());
        StaticObjects.batch.end();
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    public Texture getTexture() {
        return this.texture;
    }

    public void setHoverTexture(Texture texture) {
        this.hoverTexture = texture;
    }

    public Texture getHoverTexture() {
        return this.hoverTexture;
    }

    public void setClickedTexture(Texture texture) {
        this.clickedTexture = texture;
    }

    public Texture getClickedTexture() {
        return this.clickedTexture;
    }


}
