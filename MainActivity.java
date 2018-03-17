package com.example.android.quidditchscoring;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreGryffindor = 0;
    int scoreSlytherin = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForGryffindor();
        displayForSlytherin();
    }

    /**
     * Resets the team's scores when the RESET button is clicked
     * @param view
     */
    public void resetScores(View view) {
        scoreGryffindor = 0;
        displayForGryffindor();
        scoreSlytherin = 0;
        displayForSlytherin();
    }

    /**
     * Adds 10 points to Gryffindor's score for a goal
     * @param view
     */
    public void gryffindorGoal(View view) {
        scoreGryffindor += 10;
        displayForGryffindor();
    }

    /**
     * Adds 10 points to Slytherin's score for a goal
     * @param view
     */
    public void slytherinGoal(View view) {
        scoreSlytherin += 10;
        displayForSlytherin();
    }

    /**
     * Adds 10 points to Gryffindor's score for a goal
     * @param view
     */
    public void gryffindorSnitch(View view) {
        scoreGryffindor += 150;
        displayForGryffindor();
        displayWinner();
    }

    /**
     * Adds 10 points to Slytherin's score for a goal
     * @param view
     */
    public void slytherinSnitch(View view) {
        scoreSlytherin += 150;
        displayForSlytherin();
        displayWinner();
    }

    /**
     * * Displays the score for Gryffindor.
     */
    public void displayForGryffindor() {
        TextView scoreView = (TextView) findViewById(R.id.score1);
        scoreView.setText(String.valueOf(scoreGryffindor));
    }

    /**
     * * Displays the score for Slytherin.
     */
    public void displayForSlytherin() {
        TextView scoreView = (TextView) findViewById(R.id.score2);
        scoreView.setText(String.valueOf(scoreSlytherin));
    }

    /**
     * When the snitch button is pressed, the quidditch match is over
     * This displays who has won the match.
     */
    public void displayWinner() {
        TextView winnerView = (TextView) findViewById(R.id.winnerStatement);
        if (scoreGryffindor > scoreSlytherin) {
            winnerView.setText(R.string.gryffindor_wins);
        }

        if (scoreGryffindor < scoreSlytherin) {
            winnerView.setText(R.string.slytherin_wins);
        }

        if (scoreGryffindor == scoreSlytherin) {
            winnerView.setText(R.string.tied);
        }
    }
}
