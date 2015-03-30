package com.goquestor.brainschallenge.core;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.viewport.Viewport;

public class MainStage extends Stage implements Screen {

    public MainStage(Viewport viewport) {
        super(viewport);
        setDebugAll(true);
        addImage();
    }

    public void addImage() {
        Texture texture = new Texture(Gdx.files.internal("image.jpg"));
        Image actor = new Image(texture);
        actor.setWidth(150);
        actor.setHeight(150);
        actor.setPosition((getViewport().getScreenWidth()-actor.getWidth())/2, (getViewport().getScreenHeight()-actor.getHeight())/2);
        addActor(actor);
    }

    @Override
    public void show() {
        getRoot().setVisible(true);
    }

    @Override
    public void render(float delta) {
        getViewport().apply(true);
        act(delta);
        draw();
    }

    @Override
    public void resize(int width, int height) {
        getViewport().update(width, height, false);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {
        getRoot().setVisible(false);
    }
}
