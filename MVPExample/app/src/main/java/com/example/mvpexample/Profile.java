package com.example.mvpexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Profile extends AppCompatActivity {

    TextView emailTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        emailTxt = (TextView) findViewById(R.id.emailTxt);

        Intent emailIntent = getIntent();
        String emailaddress = emailIntent.getStringExtra("email");

        emailTxt.setText(emailaddress);

    }
}
