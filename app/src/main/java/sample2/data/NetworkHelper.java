package sample2.data;

import android.content.Context;

public class NetworkHelper {

    private Context context;

    public NetworkHelper(Context context) {
        this.context = context;
    }

    public boolean isNetworkConnected() {
// will check for network connectivity
        return false;
    }
}
