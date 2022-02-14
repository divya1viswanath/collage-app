package com.androapp.collageapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText ed1,ed2,ed3,ed4,ed5;
    AppCompatButton b1,b2;
    String getName,getMob,getMail,getPass,getCpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1=(EditText) findViewById(R.id.name);
        ed2=(EditText) findViewById(R.id.mob);
        ed3=(EditText) findViewById(R.id.mail);
        ed4=(EditText) findViewById(R.id.pass);
        ed5=(EditText) findViewById(R.id.cpass);
        b1=(AppCompatButton) findViewById(R.id.reg);
        b2=(AppCompatButton) findViewById(R.id.log);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName=ed1.getText().toString();
                getMob=ed2.getText().toString();
                getMail=ed3.getText().toString();
                getPass=ed4.getText().toString();
                getCpass=ed5.getText().toString();

                if (getPass.equals(getCpass))
                {
                    Toast.makeText(getApplicationContext(), getName, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getMob, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getMail, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getPass, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(),getCpass, Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Password and Cofirm password doesn't match", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

    }
}