package com.mindorks.bootcamp.learndagger.di.component;

import com.mindorks.bootcamp.learndagger.MyApplication;
import com.mindorks.bootcamp.learndagger.data.local.DatabaseService;
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService;
import com.mindorks.bootcamp.learndagger.di.module.TestApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {TestApplicationModule.class})
public interface ApplicationComponent {

    void inject(MyApplication application);

    NetworkService getNetworkService();

    DatabaseService getDatabaseService();

}
