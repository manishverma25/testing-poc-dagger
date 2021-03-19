package sample2.di;


import com.mindorks.bootcamp.learndagger.di.scope.ActivityScope;

import dagger.Module;
import sample2.data.DatabaseService2;
import sample2.data.NetworkHelper;
import sample2.data.remote.NetworkService2;
import sample2.viewmodel.HomeViewModel2;

@Module
public class TempActivityModule {

    @ActivityScope
    HomeViewModel2 providesHomeViewModel2(DatabaseService2 databaseService,
                                          NetworkService2 networkService, NetworkHelper networkHelper) {
        return new HomeViewModel2(databaseService,networkService,networkHelper);

    }
}
