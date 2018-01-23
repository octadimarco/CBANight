package cba.night;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.awt.Button;

import static cba.night.R.*;
import static cba.night.R.id.*;

public class MainActivity extends AppCompatActivity {

  TextView fede = (TextView)findViewById(id.textView);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        fede.setText("OCTA PERRO");
    }
}
