package com.goquestor.brainschallenge;

import android.os.Bundle;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.goquestor.brainschallenge.core.BrainsChallengeGame;

public class BrainsWearActivity extends AndroidApplication {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initialize(new BrainsChallengeGame());
    }
}
