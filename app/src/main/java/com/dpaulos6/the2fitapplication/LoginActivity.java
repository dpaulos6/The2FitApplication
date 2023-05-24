package com.dpaulos6.the2fitapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity
{

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);

    TextView signup = findViewById(R.id.signupSubtext);
    signup.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        // Start the new activity here
        Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
        startActivity(intent);
      }
    });
  }
}