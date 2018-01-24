package cba.night;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import static cba.night.R.*;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);



            Intent i = new Intent(MainActivity.this, ExtendedBanner.class);

            startActivity(i);

    }
}
