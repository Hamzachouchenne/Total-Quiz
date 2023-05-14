package com.example.myquizz2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;
import java.util.RandomAccess;

public class sport extends AppCompatActivity implements View.OnClickListener{
        int score = 0;
        int totalquestion = QuestionAnswer.questionForSport.length;
        int currentQuestionIndex = 0;
        String selectedAnswer = "";
        TextView totalquestions;
        Button ans1, ans2, ans3, ans4, submit;
        TextView question;



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.sport);

            totalquestions = (TextView) findViewById(R.id.total_question);
            ans1 = (Button) findViewById(R.id.ans_A);
            ans2 = (Button) findViewById(R.id.ans_B);
            ans3 = (Button) findViewById(R.id.ans_C);
            ans4 = (Button) findViewById(R.id.ans_D);
            submit = (Button) findViewById(R.id.submit_btn);
            question = (TextView) findViewById(R.id.question);

            ans1.setOnClickListener(this);
            ans2.setOnClickListener(this);
            ans3.setOnClickListener(this);
            ans4.setOnClickListener(this);
            submit.setOnClickListener(this);

            totalquestions.setText("Question " + (currentQuestionIndex+1) + " of " + totalquestion);

            loadNewQuestion();
        }

        @Override
        public void onClick(View view) {
            ans1.setBackgroundResource(R.drawable.logo_category);
            ans2.setBackgroundResource(R.drawable.logo_category);
            ans3.setBackgroundResource(R.drawable.logo_category);
            ans4.setBackgroundResource(R.drawable.logo_category);
            Button clickbutton = (Button) view;
            Random ran =new Random();
            int i = ran.nextInt(6-1);

            if (clickbutton.getId() == R.id.submit_btn) {
                if (selectedAnswer != ""){
                    if (selectedAnswer.equals(QuestionAnswer.correctAnswerForSport[currentQuestionIndex])) {
                        score++;
                        Toast.makeText(sport.this,""+QuestionAnswer.correct[i] , Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(sport.this,""+QuestionAnswer.incorrect[i] , Toast.LENGTH_SHORT).show();
                    }
                    currentQuestionIndex++;
                    loadNewQuestion();
                    totalquestions.setText("Question " + (currentQuestionIndex+1) + " of " + totalquestion);
                    selectedAnswer = "";}
                else {Toast.makeText(sport.this, "please choose an answer", Toast.LENGTH_SHORT).show();}


            } else {
                selectedAnswer = clickbutton.getText().toString();
                clickbutton.setBackgroundResource(R.drawable.sports_category);

            }
        }

        void loadNewQuestion() {
            if (currentQuestionIndex == totalquestion) {
                finishQuiz();
                return;
            }
            question.setText(QuestionAnswer.questionForSport[currentQuestionIndex]);
            ans1.setText(QuestionAnswer.choicesForSports[currentQuestionIndex][0]);
            ans2.setText(QuestionAnswer.choicesForSports[currentQuestionIndex][1]);
            ans3.setText(QuestionAnswer.choicesForSports[currentQuestionIndex][2]);
            ans4.setText(QuestionAnswer.choicesForSports[currentQuestionIndex][3]);
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
            Intent intent = new Intent(sport.this,categories.class);
            startActivity(intent);
        }
    }

