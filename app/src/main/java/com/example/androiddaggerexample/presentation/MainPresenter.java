package com.example.androiddaggerexample.presentation;

import android.util.Log;

import javax.inject.Inject;

public class MainPresenter implements MainPresenterContr.Presenter {
    @Inject MainPresenterContr.View view;


    @Inject
    public MainPresenter() {
    }

    @Override
    public void init() {
        Log.e("Main","view isNull " + (view == null));
    }

    @Override
    public void startView(MainPresenterContr.View view) {
        if (this.view == null) this.view = view;
    }

    @Override
    public void stopView() {
        if (view != null) view = null;
    }
}
