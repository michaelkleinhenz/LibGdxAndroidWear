package com.goquestor.brainschallenge.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.goquestor.brainschallenge.core.BrainsChallengeGame;

public class DesktopLauncher {
    public static void main (String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.width = 280;
        config.height = 280;
        new LwjglApplication(new BrainsChallengeGame(), config);
    }
}