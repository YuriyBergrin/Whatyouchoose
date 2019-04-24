package com.gmail.whatyouchoose;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Selectlevel extends Activity implements View.OnClickListener {

    Button btnEasy;
    Button btnNormal;
    Button btnHard;
    String easy = "1";
    String normal = "2";
    String hard = "3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectlevel);

        btnEasy = (Button) findViewById(R.id.buttonEasy);
        btnNormal = (Button) findViewById(R.id.buttonNormal);
        btnHard = (Button) findViewById(R.id.buttonHard);

        btnEasy.setOnClickListener(this);
        btnNormal.setOnClickListener(this);
        btnHard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.buttonEasy:
                Intent intentEasy = new Intent(this, ChoseActivity.class);
                intentEasy.putExtra("level", easy);
                startActivity(intentEasy);
                break;

            case R.id.buttonNormal:
                Intent intentNormal = new Intent(this, ChoseActivity.class);
                intentNormal.putExtra("level", normal);
                startActivity(intentNormal);
                break;

            case R.id.buttonHard:
                Intent intentHard = new Intent(this, ChoseActivity.class);
                intentHard.putExtra("level", hard);
                startActivity(intentHard);
                break;


        }
    }
}
