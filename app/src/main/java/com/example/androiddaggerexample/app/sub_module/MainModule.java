package com.example.androiddaggerexample.app.sub_module;

import com.example.androiddaggerexample.presentation.MainActivity;
import com.example.androiddaggerexample.presentation.MainPresenter;
import com.example.androiddaggerexample.presentation.MainPresenterContr;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class MainModule {

    @Binds
    abstract MainPresenterContr.Presenter bindMainPresenter(MainPresenter presenter);

    @Binds
    abstract MainPresenterContr.View bindMainView(MainActivity view);


}
