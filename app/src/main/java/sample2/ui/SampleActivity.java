package sample2.ui;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.mindorks.bootcamp.learndagger.R;

public class SampleActivity extends AppCompatActivity {

    private static final String TAG = "SampleActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // check FragmentManager
//                FragmentManager fm = getSupportFragmentManager().getFragmentManager();
//        FragmentTransaction fragmentTransaction = fm.beginTransaction();
//        SecondFragment fm2 = new SecondFragment();
//        fragmentTransaction.add(R.id.container, fm2, "HELLO");
//        fragmentTransaction.commit();

        if (getSupportFragmentManager().findFragmentByTag(TAG) == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container, new HomeFragment1(), TAG)
                    .commit();

        }
    }
}