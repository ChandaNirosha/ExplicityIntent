package com.example.sys9.marolix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText e1;
    EditText e2;
    EditText e3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button);
        e1 = (EditText) findViewById(R.id.edittext1);
        e2=(EditText) findViewById(R.id.edittext2);
        e3=(EditText)findViewById(R.id.edittext3) ;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = e1.getText().toString();
                if (str.length() == 0) {
                    e1.setError("invalid name");
                    String str1 = e2.getText().toString();
                    if (str.length() == 0) {
                        e1.setError("invalid name");
                        String str2 = e3.getText().toString();
                        if (str.length() == 0) {
                            e1.setError("invalid name");

                        }
                    }
                }
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("NAME", e1.getText().toString());
                intent.putExtra("NAME1",e2.getText().toString());
                intent.putExtra("NAME2",e3.getText().toString());
                startActivity(intent);

            }
        });
            }
        }















