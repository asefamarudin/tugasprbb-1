package com.example.hitungluasdankeliling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText s1;
    EditText s2;
    TextView hsl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void countpp(View view) {
        s1 = findViewById(R.id.sisi1);
        s2 = findViewById(R.id.sisi2);

        int ss1 = Integer.parseInt(s1.getText().toString());
        int ss2 = Integer.parseInt(s2.getText().toString());
        String lpp = Integer.toString(ss1 * ss2) ;
        String kpp = Integer.toString((ss1+ss2)*2);


        hsl = findViewById(R.id.hasil);
        hsl.setText("Luas = "+lpp+"  , Keliling = "+kpp);
    }

    public void countseg(View view) {
        s1 = findViewById(R.id.sisi1);
        s2 = findViewById(R.id.sisi2);

        Double ss1 = Double.parseDouble(s1.getText().toString());
        Double ss2 = Double.parseDouble(s2.getText().toString());
        Double ss3 = Math.sqrt(((ss1*ss1)+(ss2*ss2)));
        String lseg = Double.toString(ss1 * ss2 / 2) ;
        String kseg = Double.toString(ss1 + ss2 + ss3);


        hsl = findViewById(R.id.hasil);
        hsl.setText("Luas = "+lseg+"  , Keliling = "+kseg);
    }

    public void countlin(View view) {
        EditText sling = findViewById(R.id.sisi1);

        Double ssling = Double.parseDouble(sling.getText().toString());
        String lling = Double.toString(3.14 * (ssling * ssling)) ;
        String kling = Double.toString(2 * 3.14 * ssling);


        hsl = findViewById(R.id.hasil);
        hsl.setText("Luas = "+lling+"  , Keliling = "+kling);
    }
}
