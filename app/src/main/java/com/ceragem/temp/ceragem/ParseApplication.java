package com.ceragem.temp.ceragem;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by sheko on 21/01/16.
 */
public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();



        Parse.enableLocalDatastore(this);
        Parse.initialize(this);

    }
}
