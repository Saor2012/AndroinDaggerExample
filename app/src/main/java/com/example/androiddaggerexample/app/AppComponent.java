package com.example.androiddaggerexample.app;

import com.example.androiddaggerexample.app.singleton_module.ModuleApi;
import com.example.androiddaggerexample.app.singleton_module.ModuleApp;
import com.example.androiddaggerexample.app.sub_component.BuildersModuleActivity;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;


@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        ModuleApi.class,
        ModuleApp.class,
        BuildersModuleActivity.class
})
public interface AppComponent extends AndroidInjector<App> {
    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<App> {
    }
}