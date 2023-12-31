package de.luca.ui.parts;

import com.badlogic.gdx.graphics.Texture;
import de.luca.ui.StaticObjects;
import de.luca.ui.UiPart;

public class ImageButton extends UiPart {

    private Texture texture;

    public ImageButton(int x, int y, Texture texture) {
        super(x, y);
        this.texture = texture;
        setWidth(texture.getWidth());
        setHeight(texture.getHeight());
    }

    @Override
    public void draw() {
        StaticObjects.batch.begin();
        StaticObjects.batch.draw(texture, getX(), getY());
        StaticObjects.batch.end();
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    public Texture getTexturePath() {
        return this.texture;
    }


}
