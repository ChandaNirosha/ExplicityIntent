package com.example.sys9.marolix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView r;
    TextView s;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String name = getIntent().getStringExtra("NAME");
        String name1=getIntent().getStringExtra("NAME1");
        String name2=getIntent().getStringExtra("NAME2");
        r=(TextView)findViewById(R.id.text2);
        s=(TextView)findViewById(R.id.text5);
        t=(TextView)findViewById(R.id.text6);
        r.setText(name);
        s.setText(name1);
        t.setText(name2);
    }
}
