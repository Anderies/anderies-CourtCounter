package org.example.andeli.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int numberscoreA = 0;
    int numberscoreB = 0;
    int resetscore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void three(View view){
        numberscoreA = numberscoreA + 3;
        displayForTeamA(numberscoreA);
    }

    public void two(View view){
        numberscoreA = numberscoreA +2;
        displayForTeamA(numberscoreA);
    }

    public void one(View view){
        numberscoreA = numberscoreA +1;
        displayForTeamA(numberscoreA);
    }

    public void threeB(View view){
        numberscoreB = numberscoreB + 3;
        displayForTeamB(numberscoreB);
    }

    public void twoB(View view){
        numberscoreB = numberscoreB +2;
        displayForTeamB(numberscoreB);
    }

    public void oneB(View view){
        numberscoreB = numberscoreB +1;
        displayForTeamB(numberscoreB);
    }

    public void reset(View view){
        int numberscoreB = 0;
        int numberscoreA = 0;
        displayForTeamB(numberscoreB);
        displayForTeamA(numberscoreA);
    }



    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.scoreA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.scoreB);
        scoreView.setText(String.valueOf(score));
    }
}
