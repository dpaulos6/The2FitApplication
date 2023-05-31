package com.dpaulos6.the2fitapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity
{

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_signup);

    TextView login = findViewById(R.id.loginSubtext);
    login.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        // Start the new activity here
        Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
        startActivity(intent);
      }
    });
  }

  public void RegisterAccount(View view)
  {
    EditText username = findViewById(R.id.usernameInput);
    EditText email = findViewById(R.id.emailInput);
    EditText passwd = findViewById(R.id.passwordInput);
    EditText cPasswd = findViewById(R.id.confirmPasswordInput);

    Log.d("MDLog", username.toString());
    Log.d("MDLog", email.toString());
    Log.d("MDLog", passwd.toString());
    Log.d("MDLog", cPasswd.toString());
  }
}