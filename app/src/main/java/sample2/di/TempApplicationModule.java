package sample2.di;

import com.mindorks.bootcamp.learndagger.MyApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import sample2.data.DatabaseService2;
import sample2.data.remote.NetworkService2;
import sample2.data.scope.FragScope;

@Module
public class TempApplicationModule {

    private MyApplication application;

    TempApplicationModule(MyApplication application){
        this.application =application;
    }


    @FragScope
    @Provides
    DatabaseService2 provideDatabaseService2() {
        return new DatabaseService2(application, "dummy_db", 1);
    }

    @FragScope
    @Provides
    NetworkService2 provideNetworkService2() {
        return new NetworkService2(application, "SOME_API_KEY");
    }
}
