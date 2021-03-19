package com.mindorks.bootcamp.learndagger;

import android.app.Application;

import com.mindorks.bootcamp.learndagger.data.local.DatabaseService;
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService;
import com.mindorks.bootcamp.learndagger.di.component.ApplicationComponent;
import com.mindorks.bootcamp.learndagger.di.component.DaggerApplicationComponent;
import com.mindorks.bootcamp.learndagger.di.module.TestApplicationModule;

import javax.inject.Inject;

public class MyApplication extends Application {

    public ApplicationComponent applicationComponent;

    @Inject
    NetworkService networkService;

    @Inject
    DatabaseService databaseService;

    @Override
    public void onCreate() {
        super.onCreate();
        getDependencies();
    }

    public void getDependencies() {
        applicationComponent = DaggerApplicationComponent
                .builder()

                .testApplicationModule(new TestApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }
}