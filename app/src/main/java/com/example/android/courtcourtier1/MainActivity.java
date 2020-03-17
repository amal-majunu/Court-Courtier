package com.example.android.courtcourtier1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scorea=0;
    public void add3ToA(View v){
        scorea+=3;
        displayForTeamA(scorea);
    }
    public void add2ToA(View v){
        scorea+=2;
        displayForTeamA(scorea);
    }
    public void add1ToA(View v){
        scorea+=1;
        displayForTeamA(scorea);
    }


    int scoreb=0;
    public void add3ToB(View v){
        scoreb+=3;
        displayForTeamB(scoreb);
    }
    public void add2ToB(View v){
        scoreb+=2;
        displayForTeamB(scoreb);
    }
    public void add1ToB(View v){
        scoreb+=1;
        displayForTeamB(scoreb);
    }

    public void reset(View v){
        scoreb=0;
        scorea=0;
        displayForTeamA(scorea);
        displayForTeamB(scoreb);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
