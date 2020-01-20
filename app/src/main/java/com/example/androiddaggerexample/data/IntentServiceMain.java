package com.example.androiddaggerexample.data;

import android.content.Intent;

import androidx.annotation.Nullable;

import dagger.android.DaggerIntentService;

public class IntentServiceMain extends DaggerIntentService {
    public IntentServiceMain(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

    }
}
