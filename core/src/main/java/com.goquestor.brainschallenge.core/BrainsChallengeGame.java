package com.goquestor.brainschallenge.core;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class BrainsChallengeGame extends Game {

    private AssetManager mAssetManager = new AssetManager();

    public static final String LOGTAG = "BrainsChallenge";

    public BrainsChallengeGame() {
    }

    @Override
    public void create() {
        Gdx.app.setLogLevel(Application.LOG_DEBUG);
        Gdx.app.log(LOGTAG, "Setting main screen");

        Viewport viewport = new ExtendViewport(280, 280, 280, 280);
        MainStage mainStage = new MainStage(viewport);
        setScreen(mainStage);
    }

    @Override
    public void dispose() {
        mAssetManager.dispose();
        super.dispose();
    }

    public AssetManager getAssetManager() {
        return mAssetManager;
    }
}