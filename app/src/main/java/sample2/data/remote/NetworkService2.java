package sample2.data.remote;

import android.content.Context;

/**
 * Dummy class to simulate the actual NetworkService using Retrofit or OkHttp etc
 */
public class NetworkService2 {

    private Context context;
    private String apiKey;

    public NetworkService2(Context context, String apiKey) {
        // do the initialisation here
        this.context = context;
        this.apiKey = apiKey;
    }

    public String getDummyData() {
        return "NETWORK_DUMMY_DATA";
    }
}
