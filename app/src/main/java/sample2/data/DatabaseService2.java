package sample2.data;

import android.content.Context;

/**
 * Dummy class to simulate the actual Database using Room or Realm etc
 */
public class DatabaseService2 {

    private Context context;
    private String databaseName;
    private int version;

    public DatabaseService2(Context context, String databaseName, int version) {
        // do the initialisation here
        this.context = context;
        this.databaseName = databaseName;
        this.version = version;
    }

    public String getDummyData() {
        return "DATABASE_D__";
    }
}
