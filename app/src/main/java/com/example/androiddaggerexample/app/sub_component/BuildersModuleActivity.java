package com.example.androiddaggerexample.app.sub_component;

import com.example.androiddaggerexample.app.sub_module.MainModule;
import com.example.androiddaggerexample.presentation.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class BuildersModuleActivity {

    @ContributesAndroidInjector(modules = {MainModule.class,BuildersModuleFragment.class})
    abstract MainActivity bindMainActivity();
}
