package com.student.admin.applicationcalculator1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LargeActivity extends AppCompatActivity {
    String s1,s2,s3,s4;
    EditText ed1,ed2,ed3,ed4;
    int a1,a2,a3,a4;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_large);
        ed1=(EditText)findViewById(R.id.number1);
        ed2=(EditText)findViewById(R.id.number2);
        ed3=(EditText)findViewById(R.id.number3);
        ed4=(EditText)findViewById(R.id.result);
        b1=(Button)findViewById(R.id.findlarge);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=ed1.toString().toString();
                s2=ed2.toString().toString();
                s3=ed3.toString().toString();
                a1=Integer.parseInt(s1);
                a2=Integer.parseInt(s2);
                a3=Integer.parseInt(s3);
                a4=Integer.parseInt(s4);
                if ((a1>a2)&&(a1>a3)){
                    s4=String.valueOf(ed1);
                    ed4.setVisibility(view.VISIBLE);
                    ed4.setText(s4);
                }
                else if (a2>a3)
                {
                    s4=String.valueOf(ed2);
                    ed4.setVisibility(view.VISIBLE);
                    ed4.setText(s4);
                }


            }
        });

        b2=(Button)findViewById(R.id.back);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(i);
                
            }
        });

    }
}
