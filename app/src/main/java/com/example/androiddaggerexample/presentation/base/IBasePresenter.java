package com.example.androiddaggerexample.presentation.base;

public interface IBasePresenter<V> {
    void startView(V view);
    void stopView();
}
