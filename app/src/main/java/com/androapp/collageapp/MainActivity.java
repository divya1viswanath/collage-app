package com.androapp.collageapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2;
    AppCompatButton b1,b2;
    String getMail,getPass,preferValue;
    SharedPreferences mypreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mypreferences=getSharedPreferences("Login",MODE_PRIVATE);
        ed1=(EditText) findViewById(R.id.mail);
        ed2=(EditText) findViewById(R.id.pass);
        b1=(AppCompatButton) findViewById(R.id.log);
        b2=(AppCompatButton) findViewById(R.id.reg);

        preferValue=mypreferences.getString("mail",null);
        if(preferValue!=null){
            Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
            startActivity(i);
        }

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                getMail=ed1.getText().toString();
                getPass=ed2.getText().toString();


                if(getMail.equals("admin@gmail.com")&& (getPass.equals("12345")))
                {
                    SharedPreferences.Editor myEdit=mypreferences.edit();
                    myEdit.putString("mail",getMail);
                    myEdit.commit();

                    Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Invalid Credentials", Toast.LENGTH_SHORT).show();
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(i);
            }
        });
    }
}