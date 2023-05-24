package com.example.myquizz2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {
    FirebaseAuth auth;
    EditText loginEmail, loginPassword;
    Button loginButton;
    TextView redirection;
    ProgressBar progressbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        auth = FirebaseAuth.getInstance();
        loginEmail = findViewById(R.id.login_email);
        loginPassword = findViewById(R.id.login_password);
        loginButton = findViewById(R.id.login_button);
        redirection = findViewById(R.id.SignUpRedirectText);
        progressbar = (ProgressBar) findViewById(R.id.progressbar1);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressbar.setVisibility(View.VISIBLE);
                String user = loginEmail.getText().toString().trim();
                String pass = loginPassword.getText().toString().trim();
                auth.signInWithEmailAndPassword(user, pass)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressbar.setVisibility(View.GONE);
                        if (task.isSuccessful()) {
                            Toast.makeText(login.this, "Authentication succeded welcome",
                                    Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(login.this,categories.class);
                            startActivity(intent);

                        } else {

                            Toast.makeText(login.this, "Authentication failed " +task.getException().getMessage()+ " try again please",
                                    Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        });
        redirection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(login.this,sign_in.class);
                startActivity(intent2);
            }
        });
    }
}