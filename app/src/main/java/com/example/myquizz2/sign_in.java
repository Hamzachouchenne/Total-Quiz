package com.example.myquizz2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;

public class sign_in extends AppCompatActivity {
    FirebaseAuth auth;
    EditText signupEmail, signupPassword,signupUser;
    Button signupButton;
    ProgressBar progressbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        auth = FirebaseAuth.getInstance();
        signupEmail = findViewById(R.id.signup_email);
        signupPassword = findViewById(R.id.signup_password);
        signupButton = findViewById(R.id.signup_button);
        progressbar = (ProgressBar) findViewById(R.id.progressbar);

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressbar.setVisibility(View.VISIBLE);
                String user = signupEmail.getText().toString().trim();
                String pass = signupPassword.getText().toString().trim();



                if (user.isEmpty()){
                    signupEmail.setError("Email cannot be empty");
                }
                if (pass.isEmpty()){
                    signupPassword.setError("Password cannot be empty");
                } else{
                    auth.createUserWithEmailAndPassword(user, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            progressbar.setVisibility(View.GONE);
                            if (task.isSuccessful()) {
                                Toast.makeText(sign_in.this, "SignedUp Successfully", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(sign_in.this, categories.class));
                            } else {
                                Toast.makeText(sign_in.this, "SignUp Failed" + task.getException().getMessage(), Toast.LENGTH_LONG).show();
                            }}
                    });}

            }
        });



    }
}

