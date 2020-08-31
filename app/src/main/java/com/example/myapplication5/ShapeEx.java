package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ShapeEx extends AppCompatActivity implements View.OnClickListener {
    EditText eD1,eD2;
    Button b1 ,b2;
    String pass="12345",name="shaimaa";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape_ex);
        eD1=findViewById(R.id.eD1);
        eD2=findViewById(R.id.eD2);
        b1=findViewById(R.id.btn3);
        b2=findViewById(R.id.btn4);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn4:
              if(pass.equalsIgnoreCase(eD2.getText().toString())&&name.equalsIgnoreCase(eD1.getText().toString()))
              {
                  Toast.makeText(this,"hello",Toast.LENGTH_SHORT).show();

              }
              else {
                  Toast.makeText(this,"password or user name is faield",Toast.LENGTH_SHORT).show();

              }
                break;
            case R.id.btn3:
                eD1.setText("");
                eD2.setText("");
                break;
        }
    }
}
