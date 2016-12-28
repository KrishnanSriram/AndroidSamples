package com.flikrbrowser.android.simplequiz;

import android.content.res.Resources;

import java.util.ArrayList;
/**
 * Created by krishnansriramrama on 12/28/16.
 */

public class Quiz {
    private ArrayList<Question> mQuestions;

    public Quiz() {
        mQuestions = new ArrayList<Question>();
    }

    public void loadQuestionForQuiz(Resources resources, String branch) {
        // branch is the name of resources .xml file
        // find and load file
        if(branch == "cities") {
            Question q1 = new Question(resources.getString(R.string.question_1), resources.getBoolean(R.bool.answer_1));
            Question q2 = new Question(resources.getString(R.string.question_2), resources.getBoolean(R.bool.answer_2));
            Question q3 = new Question(resources.getString(R.string.question_3), resources.getBoolean(R.bool.answer_3));
            Question q4 = new Question(resources.getString(R.string.question_4), resources.getBoolean(R.bool.answer_4));
            Question q5 = new Question(resources.getString(R.string.question_5), resources.getBoolean(R.bool.answer_5));

            mQuestions.add(q1);mQuestions.add(q2);mQuestions.add(q3);mQuestions.add(q4);mQuestions.add(q5);
        }

    }

    public ArrayList<Question> getQuestions() {
        return mQuestions;
    }


}
