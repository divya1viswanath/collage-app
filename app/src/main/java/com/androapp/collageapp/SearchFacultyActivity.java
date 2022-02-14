package com.androapp.collageapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SearchFacultyActivity extends AppCompatActivity {

    EditText ed1;
    AppCompatButton b1,b2;
    String getFname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_faculty);
        ed1=(EditText)findViewById(R.id.fname);
        b1=(AppCompatButton)findViewById(R.id.ser);
        b2=(AppCompatButton) findViewById(R.id.dash);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFname=ed1.getText().toString();
                Toast.makeText(getApplicationContext(),getFname, Toast.LENGTH_SHORT).show();
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