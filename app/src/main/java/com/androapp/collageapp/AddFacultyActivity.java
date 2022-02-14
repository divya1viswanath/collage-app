package com.androapp.collageapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddFacultyActivity extends AppCompatActivity {

    EditText ed1,ed2,ed3,ed4,ed5;
    AppCompatButton b1,b2;
    String getFname,getDep,getQual,getMob,getMail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_faculty);
        ed1=(EditText)findViewById(R.id.fname);
        ed2=(EditText) findViewById(R.id.dep);
        ed3=(EditText) findViewById(R.id.qual);
        ed4=(EditText) findViewById(R.id.mob);
        ed5=(EditText) findViewById(R.id.mail);
        b1=(AppCompatButton) findViewById(R.id.sub);
        b2=(AppCompatButton) findViewById(R.id.dash);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFname=ed1.getText().toString();
                getDep=ed2.getText().toString();
                getQual=ed3.getText().toString();
                getMob=ed4.getText().toString();
                getMail=ed5.getText().toString();
                Toast.makeText(getApplicationContext(), "Submitted Successfully", Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
                startActivity(i);
            }
        });
    }
}