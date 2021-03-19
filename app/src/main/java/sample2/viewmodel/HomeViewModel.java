package sample2.viewmodel;

import com.mindorks.bootcamp.learndagger.data.local.DatabaseService;
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService;

import sample2.data.NetworkHelper;

public class HomeViewModel {

    private DatabaseService databaseService;
    private NetworkService networkService;
    private NetworkHelper networkHelper;

    HomeViewModel(DatabaseService databaseService, NetworkService networkService,NetworkHelper networkHelper){
        this.databaseService = databaseService;
        this.networkService = networkService;
        this.networkHelper = networkHelper;
    }
}
