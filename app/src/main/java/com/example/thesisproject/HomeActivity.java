package com.example.thesisproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent intent = getIntent();
        String activity = intent.getStringExtra("FROM_ACTIVITY");
        String username;

        if (activity.equals("LOGIN")) {
            username = intent.getStringExtra(LoginActivity.LOGIN_USERNAME);
        } else {
            username = intent.getStringExtra(SignUp.SIGNUP_USERNAME);
        }

        TextView textView = findViewById(R.id.welcomeText);
//        String welcome = "Welcome " + username;
//        textView.setText(username);
        textView.setText(getResources().getString(R.string.welcome_message,  username));
    }
}