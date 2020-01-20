package com.example.androiddaggerexample.data;

import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

import dagger.android.DaggerService;

public class ServiceMain extends DaggerService {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
