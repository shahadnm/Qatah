package com.example.snalmutawa.qatah.StartPage;

import android.os.Handler;
import android.text.TextUtils;

public class Contractor {
    interface OnLoginFinishedListener {
        void onUsernameError();
    }

    public void login(final String username, final String password, final OnLoginFinishedListener listener) {
        // Mock login. I'm creating a handler to delay the answer a couple of seconds
        new Handler().postDelayed(() -> {

                listener.onUsernameError();
                return;

        }, 2000);
    }


    }

