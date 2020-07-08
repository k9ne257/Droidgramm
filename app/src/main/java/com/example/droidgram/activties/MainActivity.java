package com.example.droidgram.activties;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.droidgram.R;

public class MainActivity extends AppCompatActivity {
    private String user;
    private String password;
    private Button loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        this.getSupportActionBar().hide();

        loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(
            new View.OnClickListener() {
                public void onClick(View view) {
                    user = ((EditText) findViewById(R.id.input_username_login)).getText().toString();
                    password = ((EditText) findViewById(R.id.input_password_login)).getText().toString();
                    if (validate(user,password) == true){
                        loginSucess();
                    }
                    else{
                        Toast.makeText(MainActivity.this,"Login failed. Please try again", Toast.LENGTH_SHORT).show();
                    }
               }
            }
        );
    }

    private void loginSucess() {
        Intent i = new Intent(this, ProfileActivity.class);
        startActivity(i);
        finish();
    }

    private boolean validate(String user, String password) {
        //TODO login process
        if (user.equals("admin") && password.equals("admin")){
            return true;
        }
        return false;
    }

    public void signUpClickable(View view) {
        Intent i = new Intent(this, activity_signup.class);
        startActivity(i);
    }
}