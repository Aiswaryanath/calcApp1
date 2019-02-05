package com.student.admin.applicationcalculator1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MulActivity extends AppCompatActivity {
    String s1, s2, s3;
    EditText ed1, ed2,ed3;
    int a1, a2, a3;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mul);
        ed1 = (EditText) findViewById(R.id.number1);
        ed2 = (EditText) findViewById(R.id.number2);
        ed3=(EditText)findViewById(R.id.result);
        ed3.setVisibility(View.VISIBLE);
        b1 = (Button) findViewById(R.id.mul);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1 = ed1.getText().toString();
                s2 = ed2.getText().toString();
                a1 = Integer.parseInt(s1);
                a2 = Integer.parseInt(s2);
                a3 = a2 * a1;
                s3 = String.valueOf(a3);
                ed3.setText(s3);
//                Toast.makeText(getApplicationContext(), s3, Toast.LENGTH_LONG).show();
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
