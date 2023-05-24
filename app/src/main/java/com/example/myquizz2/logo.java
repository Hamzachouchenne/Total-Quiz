package com.example.myquizz2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class logo extends AppCompatActivity implements View.OnClickListener{
        int score = 0;
        int totalquestion = QuestionAnswer.imageArray.length;
        int currentQuestionIndex = 0;
        String selectedAnswer = "";
        TextView totalquestions;
        Button submit;
        TextView question;
        ImageView image ;
        EditText answer ;





        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.logos);

            totalquestions = (TextView) findViewById(R.id.total_question);
            answer = (EditText) findViewById(R.id.edittext);
            submit = (Button) findViewById(R.id.submit_btn);
            question = (TextView) findViewById(R.id.question);
            image = (ImageView) findViewById(R.id.image);

            submit.setOnClickListener(this);

            totalquestions.setText("Question " + (currentQuestionIndex+1) + " of " + totalquestion);

            loadNewQuestion();
        }

        @Override
        public void onClick(View view) {

            Button clickbutton = (Button) view;
            Random ran =new Random();
            int i = ran.nextInt(6-1);
            selectedAnswer = answer.getText().toString();

            if (clickbutton.getId() == R.id.submit_btn) {
                if (!selectedAnswer.isEmpty()){

                    if (selectedAnswer.toLowerCase().equals(QuestionAnswer.correctAnswerForLogo[currentQuestionIndex].toLowerCase())) {
                        score++;
                        Toast.makeText(logo.this,""+QuestionAnswer.correct[i] , Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(logo.this, ""+QuestionAnswer.incorrect[i], Toast.LENGTH_SHORT).show();
                    }
                    answer.setText("");
                    currentQuestionIndex++;
                    loadNewQuestion();
                    totalquestions.setText("Question " + (currentQuestionIndex+1) + " of " + totalquestion);
                    selectedAnswer = "";}
                else {Toast.makeText(logo.this, "please choose an answer", Toast.LENGTH_SHORT).show();}


            }
        }

        void loadNewQuestion() {
            if (currentQuestionIndex == totalquestion) {
                finishQuiz();
                return;
            }
            image.setImageResource(QuestionAnswer.imageArray[currentQuestionIndex]);

        }

        void finishQuiz() {
            String passStatus = "";
            if (score > totalquestion * 0.60) {
                passStatus = "Passed";
            } else {
                passStatus = "Failed";
            }
            new AlertDialog.Builder(this)
                    .setTitle(passStatus)
                    .setMessage("Score is " + score + " out of " + totalquestion)
                    .setPositiveButton("Back to the Main Menu", (dialogInterface, i) -> restartQuiz())
                    .setCancelable(false)
                    .show();
        }


        void restartQuiz(){
            score = 0;
            currentQuestionIndex = 0;
            Intent intent = new Intent(logo.this,categories.class);
            startActivity(intent);
        }}

