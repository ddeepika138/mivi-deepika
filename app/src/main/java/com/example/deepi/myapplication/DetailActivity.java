package com.example.deepi.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button b1;
        TextView t1,t2,t3,t4,t5;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        t1=(TextView)findViewById(R.id.plan);
        t1.setText("1234");
        t2=(TextView)findViewById(R.id.subs);
        t2.setText("55 days");

        t3= (TextView)findViewById(R.id.balance);
        t3.setText("$250");
        t4=(TextView)findViewById(R.id.product);
        t4.setText("Tata Sky");
        t5=(TextView)findViewById(R.id.price);
        t5.setText("$400");

    }
}
