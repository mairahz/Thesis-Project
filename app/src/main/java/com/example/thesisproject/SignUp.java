package com.example.thesisproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {
    public static final String SIGNUP_NAME = "com.example.thesisproject.NAME";
    public static final String SIGNUP_USERNAME = "com.example.thesisproject.USERNAME";
    public static final String SIGNUP_EMAIL = "com.example.thesisproject.EMAIL";
    public static final String SIGNUP_PASSWORD = "com.example.thesisproject.PASSWORD";
    public static final String SIGNUP_CONFPASS = "com.example.thesisproject.CONFPASS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void onSave(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        // Name
        EditText editText = (EditText) findViewById(R.id.nameText);
        String name = editText.getText().toString();
        // Username
        editText = (EditText) findViewById(R.id.usernameText);
        String username = editText.getText().toString();
        // Email
        editText = (EditText) findViewById(R.id.emailText);
        String email = editText.getText().toString();
        // Password
        editText = (EditText) findViewById(R.id.passwordText);
        String password = editText.getText().toString();
        // Confirm Password
        editText = (EditText) findViewById(R.id.confPassText);
        String confPass = editText.getText().toString();

        // Send data to next screen
        intent.putExtra(SIGNUP_NAME, name);
        intent.putExtra(SIGNUP_USERNAME, username);
        intent.putExtra(SIGNUP_EMAIL, email);
        intent.putExtra(SIGNUP_PASSWORD, password);
        intent.putExtra(SIGNUP_CONFPASS, confPass);

        startActivity(intent);
    }

}