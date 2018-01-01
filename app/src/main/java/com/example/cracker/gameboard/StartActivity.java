package com.example.cracker.gameboard;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {

//    private FrameLayout frameLayout;
    private FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        manager = getFragmentManager();

        manager.beginTransaction().replace(R.id.frame, new SignIn()).commit();
    }
}
