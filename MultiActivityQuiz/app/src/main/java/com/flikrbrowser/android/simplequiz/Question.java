package com.flikrbrowser.android.simplequiz;

/**
 * Created by krishnansriramrama on 12/28/16.
 */

public class Question {
    private String mQuestion;
    private boolean mAnswer;

    public Question(String question, boolean answer) {
        mQuestion = question;
        mAnswer = answer;
    }

    public String getQuestion() {
        return mQuestion;
    }

    public void setQuestion(String question) {
        mQuestion = question;
    }

    public boolean getAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }
}
