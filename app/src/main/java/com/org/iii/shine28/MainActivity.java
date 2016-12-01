package com.org.iii.shine28;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fmgr;
    private FragmentTransaction tran;
    private F1 f1;
    private F2 f2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        f1 = F1.newInstance();
        f2 = new F2();

        fmgr = getFragmentManager();
        tran =  fmgr.beginTransaction();
        tran.add(R.id.container, f1);
        tran.commit();

    }
}