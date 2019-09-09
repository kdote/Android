package com.example.mvpexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mvpexample.Model.User;

public class MainActivity extends AppCompatActivity {

    EditText email, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.loginButton);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String useremail = email.getText().toString().trim();
                String userpassword = password.getText().toString();

                if(TextUtils.isEmpty(useremail)){
                    Toast.makeText(MainActivity.this, "Enter Email Address", Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(userpassword)){
                    Toast.makeText(MainActivity.this, "Enter password", Toast.LENGTH_SHORT).show();
                }

                else if (!TextUtils.isEmpty(useremail) && !TextUtils.isEmpty(useremail)){
                    User user = new User(useremail, userpassword);

                    Intent userIntent = new Intent(MainActivity.this, Profile.class);
                    String userEmail = user.getEmail();
                    userIntent.putExtra("email", userEmail);
                    startActivity(userIntent);
                }
            }
        });

    }
}
