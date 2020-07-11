package com.example.droidgram.activties;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.droidgram.R;

public class SignUpActivity extends AppCompatActivity {
    private String user;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String passwordConfirm;
    private String errorMessage;

    Button signupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        //TODO clean the code
        signupButton = findViewById(R.id.sign_up_button);
        signupButton.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        firstName = ((EditText) findViewById(R.id.input_firstname)).getText().toString();
                        lastName = ((EditText) findViewById(R.id.input_lastname)).getText().toString();
                        user = ((EditText) findViewById(R.id.input_user_signUp)).getText().toString();
                        email = ((EditText) findViewById(R.id.input_email)).getText().toString();
                        password = ((EditText) findViewById(R.id.input_password_signUp)).getText().toString();
                        passwordConfirm = ((EditText) findViewById(R.id.input_password_confirm)).getText().toString();


                        if(validate(firstName, lastName, user, email, password, passwordConfirm).equals("valid")){
                            //TODO this should add a User account to the DB with the details provided

                            Intent i = new Intent(SignUpActivity.this, UserInfoActivity.class);
                            startActivity(i);
                            finish();
                        }
                        else{
                            Toast.makeText(SignUpActivity.this, errorMessage, Toast.LENGTH_SHORT).show();
                        }
                    }

                }
        );
    }



    private String validate(String firstName, String lastName, String user, String email, String password, String passwordConfirm) {
        //TODO this method should validate if all input fiels are filled correctly and return and 'errorMessage if not'
        //TODO Validation of username requires a duplicate check with usernames already in the DB
        errorMessage = "Please fill out all fields";
        if (true){
            return errorMessage;
        }

        return "valid";
    }


    public void login_clickable(View view) {
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
    }

}