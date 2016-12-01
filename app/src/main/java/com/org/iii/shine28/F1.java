package com.org.iii.shine28;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class F1 extends Fragment {
    private TextView mesg;
    private String strLottery = null;
    private MainActivity main;


    public static F1 newInstance() {
        F1 fragment = new F1();
        return fragment;
    }

    public F1(){
        Log.v("brad", "F1()");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("brad", "onCreate");

        main = (MainActivity) getActivity();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.v("brad", "onCreateView");
        View view = inflater.inflate(R.layout.fragment_f1, container, false);
        mesg = (TextView)view.findViewById(R.id.f1mesg);
        if (strLottery != null){
            mesg.setText(strLottery);
        }


        View btn = view.findViewById(R.id.f1btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doBtn();
            }
        });

        View btn2 = view.findViewById(R.id.f1btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doBtn2();
            }
        });


        return view;
    }
    private void doBtn(){
        strLottery = "Lottery: " + (int)(Math.random()*49+1);
        mesg.setText(strLottery);
    }

    private void doBtn2(){
        //main.changeTitle();
        //main.change(null);
        main.getF2().chanegF2Mesg(strLottery);
    }

}