package com.gmail.whatyouchoose;

import java.util.ArrayList;
import java.util.Arrays;

public class Question {
    private String redQuestion;
    private String blueQuestion;
    ArrayList<Question> questionList;
    String[] easyArrayRed;
    String[] easyArrayBlue;

    public Question(String red, String blue) {
        this.redQuestion = red;
        this.blueQuestion = blue;
    }

    public String getRedQuestion() {
        return redQuestion;
    }

    public String getBlueQuestion() {
        return blueQuestion;
    }


    public ArrayList<Question> getQuestionList(String level) {
        QuestionsData data = new QuestionsData();
        easyArrayRed = data.getEasyArrayRed();
        easyArrayBlue = data.getEasyArrayBlue();
        for (int i = 0; i < easyArrayRed.length; i++) {
            questionList.add(new Question(easyArrayRed[i], easyArrayBlue[i]));
        }

        return questionList;
    }

}
