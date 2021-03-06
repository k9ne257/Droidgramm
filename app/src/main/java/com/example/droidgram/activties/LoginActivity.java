package com.example.droidgram.activties;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.droidgram.R;
import com.example.droidgram.services.Validator;

public class LoginActivity extends AppCompatActivity {
    private String user;
    private String password;
    private Button loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        user = ((EditText) findViewById(R.id.input_username_login)).getText().toString();
                        password = ((EditText) findViewById(R.id.input_password_login)).getText().toString();
                        if (validate(user,password) == true){
                            loginSuccess();
                        }
                        else{
                            Toast.makeText(LoginActivity.this,"Login failed. Please try again", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }

    private void loginSuccess() {
        Intent i = new Intent(this, ProfileActivity.class);
        startActivity(i);
        finish();
    }

    private boolean validate(String user, String password) {
        //TODO manual and unit Tests for this method needed
        Validator v = new Validator();
        return !v.validateLogin(user,password);
    }

    public void signUpClickable(View view) {
        Intent i = new Intent(this, SignUpActivity.class);
        startActivity(i);
    }
}