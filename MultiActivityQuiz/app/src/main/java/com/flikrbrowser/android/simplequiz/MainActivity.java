package com.flikrbrowser.android.simplequiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCurrentIndex = 0;

    private TextView questionTextView;
    private Button trueButton;
    private Button falseButton;
    private Button nextButton;
    private Button cheatButton;
    private Quiz mCitiesQuiz;
    private static final String TAG = MainActivity.class.getName();
    private static final String ANSWER_IS_TRUE = "com.flikrbrowser.android.simplequiz.answer_is_true";
    private static final int REQUEST_CODE_CHEAT = 0;
    private boolean cheated = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState != null) {
            Log.i(TAG, "instance state is available for information");
            mCurrentIndex = savedInstanceState.getInt("questionIndex");
        } else {
            mCurrentIndex = 0;
        }

        mCitiesQuiz = new Quiz();
        mCitiesQuiz.loadQuestionForQuiz(getResources(), "cities");

        questionTextView = (TextView)findViewById(R.id.textView_question);
        trueButton = (Button)findViewById(R.id.button_true);
        falseButton = (Button)findViewById(R.id.button_false);
        nextButton = (Button)findViewById(R.id.button_next);
        cheatButton = (Button)findViewById(R.id.button_cheat);

        String question_prefix = getString(R.string.question_prefix);
        questionTextView.setText(question_prefix + " " +
                mCitiesQuiz.getQuestions().get(mCurrentIndex).getQuestion());
        trueButton.setText(getString(R.string.true_button_title));
        falseButton.setText(getString(R.string.false_button_title));
        nextButton.setText(getString(R.string.next_button_title));
        cheatButton.setText(getString(R.string.cheat_button_title));

        trueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cheated == true) {
                    Toast.makeText(MainActivity.this, getString(R.string.judgement_toast),
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                if(isRightAnswer(true)) {
                    Toast.makeText(MainActivity.this, getString(R.string.correct_answer),
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, getString(R.string.incorrect_answer),
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        falseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cheated == true) {
                    Toast.makeText(MainActivity.this, getString(R.string.judgement_toast),
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                if(isRightAnswer(false)) {
                    Toast.makeText(MainActivity.this, getString(R.string.correct_answer),
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, getString(R.string.incorrect_answer),
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCurrentIndex += 1;
                cheated = false;
                String question_prefix = getString(R.string.question_prefix);
                String question = "";
                try {
                    question = question_prefix + " " +
                            mCitiesQuiz.getQuestions().get(mCurrentIndex).getQuestion();
                } catch (IndexOutOfBoundsException ex) {
                    mCurrentIndex = 0;
                } finally {
                    question = question_prefix + " " +
                            mCitiesQuiz.getQuestions().get(mCurrentIndex).getQuestion();
                }

                questionTextView.setText(question);
            }
        });

        cheatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cheatIntent = new Intent(MainActivity.this, CheatActivity.class);
                cheatIntent.putExtra(ANSWER_IS_TRUE, mCitiesQuiz.getQuestions().get(mCurrentIndex).getAnswer());
                startActivityForResult(cheatIntent, REQUEST_CODE_CHEAT);
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "Device rotated");
        outState.putInt("questionIndex", mCurrentIndex);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Log.i(TAG, "Back button pressed");
        if(resultCode != Activity.RESULT_OK) {
            Log.i(TAG, "Back button pressed and Activity is not OK");
            return;
        }

        if(requestCode == REQUEST_CODE_CHEAT) {
            Log.i(TAG, "Back button from CHEAT Activity");
            if(data == null) {
                Log.i(TAG, "Back button pressed, CHEAT Activity data is NULL");
                return;
            } else {
                Log.i(TAG, "Back button pressed, Ahhhh CHEAT Activity, you cheated");
                cheated = true;
            }
        }
    }

    private boolean isRightAnswer(boolean selectedAnswer) {
        return mCitiesQuiz.getQuestions().get(mCurrentIndex).getAnswer() == selectedAnswer;
    }
}
