package com.example.dell.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MyFragmentA myFragmentA = new MyFragmentA();
    MyFragmentB myFragmentB = new MyFragmentB();

    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentTransaction.add(R.id.fragment_a,myFragmentA,"myfragmentatag");
        fragmentTransaction.add(R.id.fragment_b,myFragmentB,"myfragmentbtag");
        fragmentTransaction.commit();
    }

    public void sendInfo(String s) {

        myFragmentB.change_text(s);

    }
}
