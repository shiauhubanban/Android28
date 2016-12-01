package com.org.iii.shine28;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fmgr;
    private FragmentTransaction tran;
    private F1 f1;
    private F2 f2;
    private boolean isF2;
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = (TextView)findViewById(R.id.title);

        f1 = F1.newInstance();
        f2 = new F2();

        fmgr = getFragmentManager();
        tran =  fmgr.beginTransaction();
        tran.add(R.id.container, f1);
        tran.commit();

    }

    public void change(View v){
        isF2 = !isF2;

        tran =  fmgr.beginTransaction();
        tran.replace(R.id.container, isF2?f2:f1);
        //堆疊 所以返回有用
        tran.addToBackStack(null);
        tran.commit();

    }
    public void changeTitle(){
        title.setText("III");
    }

    public F1 getF1(){return f1;}
    public F2 getF2(){return f2;}

}