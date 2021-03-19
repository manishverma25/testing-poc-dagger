package sample2.di;

import com.mindorks.bootcamp.learndagger.MyApplication;

import javax.inject.Singleton;

import dagger.Component;
import sample2.data.DatabaseService2;
import sample2.data.remote.NetworkService2;
import sample2.data.scope.FragScope;


@FragScope
@Component(modules = TempApplicationModule.class)
public interface TempApplicationComponent {
    void inject(MyApplication application);

    NetworkService2 getNetworkService2();

    DatabaseService2 getDatabaseService2();
}
