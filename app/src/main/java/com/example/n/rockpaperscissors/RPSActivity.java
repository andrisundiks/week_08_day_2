package com.example.n.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RPSActivity extends AppCompatActivity {

    private Button rockButton;
    private Button paperButton;
    private Button scissorButton;
    private TextView resultText;
    private TextView percentageText;
    private int totalGamesPlayed;
    private int totalGamesWon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rps);

        rockButton = findViewById(R.id.buttonRockID);
        paperButton = findViewById(R.id.buttonPaperID);
        scissorButton = findViewById(R.id.buttonScissorsID);
        resultText = findViewById(R.id.textResultID);
        percentageText = findViewById(R.id.textPercentageID);
    }

    public void onClickButton(View button){
        Button realButton = (Button) button;
        String result = GameLogic.compareHands(realButton.getText().toString());
        updateCounters(result);
        resultText.setText(result);
        percentageText.setText(winPercentage());

    }

    public void updateCounters(String result){

        if (result.equals("You win!")){
            totalGamesWon += 1;
            totalGamesPlayed +=1;
        } else {
            totalGamesPlayed +=1;
        }

    }

    public String winPercentage(){

        return String.format("You have won %s per cent of the games", ((totalGamesWon * 100) / totalGamesPlayed));

    }

    public String displayCounters(){
        return  String.format("You have won %s per cent of games", winPercentage());

    }
}
