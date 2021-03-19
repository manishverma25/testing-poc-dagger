package sample2.viewmodel;


import sample2.data.DatabaseService2;
import sample2.data.NetworkHelper;
import sample2.data.remote.NetworkService2;

public class HomeViewModel2 {

    private DatabaseService2 databaseService;
    private NetworkService2 networkService;
    private NetworkHelper networkHelper;

   public HomeViewModel2(DatabaseService2 databaseService, NetworkService2 networkService, NetworkHelper networkHelper){
        this.databaseService = databaseService;
        this.networkService = networkService;
        this.networkHelper = networkHelper;
    }

    public  String getData(){
        return databaseService.getDummyData()+ networkHelper.isNetworkConnected() + networkService.getDummyData();
    }
}
