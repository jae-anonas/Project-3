package com.ga.roosevelt.project_3.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.ga.roosevelt.project_3.MainActivity;
import com.ga.roosevelt.project_3.R;

/**
 * Created by Qube on 8/15/16.
 */
public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        Thread timerThread = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}