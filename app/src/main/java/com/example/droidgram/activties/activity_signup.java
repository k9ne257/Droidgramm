package com.example.droidgram.activties;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.droidgram.R;

public class activity_signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void createbutton(View view) {
    }

    public void login_clickable(View view) {
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
    }

}