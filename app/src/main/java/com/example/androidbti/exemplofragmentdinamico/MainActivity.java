package com.example.androidbti.exemplofragmentdinamico;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LeftFragment lf = new LeftFragment();
        RightFragment rf = new RightFragment();

        FragmentManager fm = getFragmentManager();

        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.layout_left, lf, "lf");
        ft.add(R.id.layout_right, rf, "rf");
        ft.commit();
    }
}
