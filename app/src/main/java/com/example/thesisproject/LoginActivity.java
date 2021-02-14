package com.example.thesisproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    public static final String LOGIN_USERNAME = "com.example.thesisproject.USERNAME";
    public static final String LOGIN_PASSWORD = "com.example.thesisproject.PASSWORD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onLogin(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        // Username
        EditText editText = (EditText) findViewById(R.id.usernameLogin);
        String username = editText.getText().toString();
        // Password
        editText = (EditText) findViewById(R.id.passwordLogin);
        String password = editText.getText().toString();

        // Send data to next screen
        intent.putExtra(LOGIN_USERNAME, username);
        intent.putExtra(LOGIN_PASSWORD, password);

        startActivity(intent);
    }

}