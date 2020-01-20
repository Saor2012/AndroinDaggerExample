package com.example.androiddaggerexample.app.sub_component;

import com.example.androiddaggerexample.presentation.fragments.ExampleFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class BuildersModuleFragment {

    @ContributesAndroidInjector()
    abstract ExampleFragment bindExampleFragment();
}
