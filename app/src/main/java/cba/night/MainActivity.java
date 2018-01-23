package cba.night;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import static cba.night.R.*;


public class MainActivity extends AppCompatActivity {

    TextView fede = (TextView)findViewById(id.textView);
    Button btn = (Button)findViewById(id.btn1);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        fede.setText("OCTA PERRO");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fede.setText("PUTO EL QUE LEE");
            }
        });




    }
}
