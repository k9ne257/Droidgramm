package com.example.droidgram.activties;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.droidgram.R;
import com.example.droidgram.manager.AccountManager;
import com.example.droidgram.models.Account;
import com.example.droidgram.services.Validator;

public class SignUpActivity extends AppCompatActivity {
    private String user;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String passwordConfirm;
    private String hintMessage;

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


                        hintMessage = validate(firstName, lastName, user, email, password, passwordConfirm);
                        if(hintMessage.equals("valid")){
                            //TODO this should add a User account to the DB with the details provided
                            Account acc = Account.addAccount(firstName, lastName, user, email, password);
                            AccountManager accountManager = new AccountManager();
                            accountManager.add_to_DB(acc);

                            Intent i = new Intent(SignUpActivity.this, UserInfoActivity.class);
                            startActivity(i);
                        }
                        else{
                            Toast.makeText(SignUpActivity.this, hintMessage, Toast.LENGTH_SHORT).show();
                        }
                    }

                }
        );
    }



    private String validate(String firstName, String lastName, String user, String email, String password, String passwordConfirm) {
        Validator validator = new Validator();
        //TODO Validation of username requires a duplicate check with usernames already in the DB

        if (firstName.equals("")){
            return "Please enter your first name";
        }
        if (lastName.equals("")){
            return "Please enter your last name";
        }
        if (user.equals("")){
            return "Please enter a user name";
        }

        if (validator.validateEmailInput(email)) {
            return "Please enter a valid email ";
        }

        if (validator.validatePassowordInput(password)) {
            return "Password must be at least 6 characters";
        }

        if (!password.equals(passwordConfirm) && !(password.equals(""))){
            return "passwords need to match";
        }

        return "valid";
    }

    public void login_clickable(View view) {
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
    }

}