package com.example.androiddaggerexample.presentation;

import com.example.androiddaggerexample.presentation.base.IBasePresenter;

public interface MainPresenterContr {
    interface View{

    }

    interface Presenter extends IBasePresenter<View> {
        void init();
    }
}
