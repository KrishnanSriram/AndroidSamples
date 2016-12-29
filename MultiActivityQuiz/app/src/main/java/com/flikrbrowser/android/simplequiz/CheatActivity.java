package com.flikrbrowser.android.simplequiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CheatActivity extends AppCompatActivity {

    private TextView answer_textview;
    private Button show_answer_button;
    private boolean mAnswer;
    private static final String ANSWER_IS_TRUE = "com.flikrbrowser.android.simplequiz.answer_is_true";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);

        mAnswer = getIntent().getBooleanExtra(ANSWER_IS_TRUE, false);

        answer_textview = (TextView)findViewById(R.id.textview_answer);
        show_answer_button = (Button)findViewById(R.id.show_answer_button);

        show_answer_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mAnswer == true) {
                    answer_textview.setText(R.string.true_button_title);
                } else {
                    answer_textview.setText(R.string.false_button_title);
                }
                setAnswerShowResult(mAnswer);
            }
        });
    }

    private void setAnswerShowResult(boolean isAnswerShown) {
        Intent data = new Intent();
        data.putExtra(ANSWER_IS_TRUE, isAnswerShown);
        setResult(-1, data);
    }
}
