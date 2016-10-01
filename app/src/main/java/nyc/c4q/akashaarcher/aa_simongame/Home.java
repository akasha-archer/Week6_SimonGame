package nyc.c4q.akashaarcher.aa_simongame;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class Home extends AppCompatActivity {
    private Handler myHandler;
    private Handler mHandler;
    public int level = 1;
    public int timeRemaining = level * 2;
    public int startCurrentString = 0;
    public String ourString = "";
    public int ourStLength = 1;
    public String userString = "";
    public int userStLength = 1;


    Random ran = new Random();
    Button btnG2, btnR2, btnY2, btnB2;
    TextView tvLevel2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnG2 = (Button)findViewById(R.id.btnG);
        btnR2 = (Button)findViewById(R.id.btnR);
        btnY2 = (Button)findViewById(R.id.btnY);
        btnB2 = (Button)findViewById(R.id.btnB);
        tvLevel2 = (TextView)findViewById(R.id.tvLevel);

        Toast.makeText(Home.this, "Remember the colors are going to turn on!\nReady? Go...", Toast.LENGTH_SHORT).show();

        ourString = ourString + nextChar();
        turnColorsOn(ourString);

        btnG2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                userString = userString + "G";
                ourStLength = ourString.length();
                userStLength = userString.length();

                if (userStLength == level) {

                    if (ourString.equals(userString)){

                        Toast.makeText(Home.this, "Level "+ level +" completed!", Toast.LENGTH_SHORT).show();
                        level ++;
                        //next Level is going to start, we are going to change some of the variables' values like they were in the beginning
                        timeRemaining = level * 2;
                        startCurrentString = 0;
                        userString = "";
                        userStLength = 1;
                        ourString = ourString + nextChar();
                        // next Level starts here
                        tvLevel2.setText(""+level);
                        turnColorsOn(ourString);
                    }else{

                        String result = "";
                        for (int i = 0; i<ourString.length(); i++) {


                            if (userString.charAt(i) != ourString.charAt(i)) {

                                result = result + userString.charAt(i) + " instead of " + ourString.charAt(i) + "\n";
                            }

                        }
                        result = "Game is over because you pressed: \n" + result;
                        Toast.makeText(Home.this, result + "\n\nSCORES: " + (level - 1), Toast.LENGTH_LONG).show();

                    }
                }

            }
        });

        btnR2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                userString = userString +  "R";

                ourStLength = ourString.length();
                userStLength = userString.length();

                if (userStLength == level) {

                    if (ourString.equals(userString)){

                        Toast.makeText(Home.this, "Level "+ level +" completed!", Toast.LENGTH_SHORT).show();
                        level ++;
                        //next Level is going to start, we are going to change some of the variables' values like they were in the beginning
                        timeRemaining = level * 2;
                        startCurrentString = 0;
                        userString = "";
                        userStLength = 1;
                        ourString = ourString + nextChar();
                        // next Level starts here
                        tvLevel2.setText(""+level);
                        turnColorsOn(ourString);
                    }else{
                        String result = "";
                        for (int i = 0; i<ourString.length(); i++) {


                            if (userString.charAt(i) != ourString.charAt(i)) {

                                result = result + userString.charAt(i) + " instead of " + ourString.charAt(i) + "\n";
                            }

                        }
                        result = "Game is over because you pressed: \n" + result;
                        Toast.makeText(Home.this, result + "\n\nSCORES: " + (level - 1), Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

        btnY2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                userString = userString +  "Y";

                ourStLength = ourString.length();
                userStLength = userString.length();

                if (userStLength == level) {

                    if (ourString.equals(userString)){

                        Toast.makeText(Home.this, "Level "+ level +" completed!", Toast.LENGTH_LONG).show();
                        level ++;

                        //next Level is going to start, we are going to change some of the variables' values like they were in the beginning
                        timeRemaining = level * 2;
                        startCurrentString = 0;
                        userString = "";
                        userStLength = 1;
                        ourString = ourString + nextChar();
                        // next Level starts here
                        tvLevel2.setText(""+level);
                        turnColorsOn(ourString);
                    }else{
                        String result = "";
                        for (int i = 0; i<ourString.length(); i++) {


                            if (userString.charAt(i) != ourString.charAt(i)) {

                                result = result + userString.charAt(i) + " instead of " + ourString.charAt(i) + "\n";
                            }
                        }
                        result = "Game is over because you pressed: \n" + result;
                        Toast.makeText(Home.this, result + "\n\nSCORES: " + (level - 1), Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

        btnB2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                userString = userString +  "B";

                ourStLength = ourString.length();
                userStLength = userString.length();

                if (userStLength == level) {

                    if (ourString.equals(userString)){

                        Toast.makeText(Home.this, "Level "+ level +" completed!", Toast.LENGTH_SHORT).show();
                        level ++;
                        //next Level is going to start, we are going to change some of the variables' values like they were in the beginning
                        timeRemaining = level * 2;
                        startCurrentString = 0;
                        userString = "";
                        userStLength = 1;
                        ourString = ourString + nextChar();
                        // next Level starts here
                        tvLevel2.setText(""+level);
                        turnColorsOn(ourString);
                    }else{
                        String result = "";
                        for (int i = 0; i<ourString.length(); i++) {


                            if (userString.charAt(i) != ourString.charAt(i)) {

                                result = result + userString.charAt(i) + " instead of " + ourString.charAt(i) + "\n";
                            }
                        }
                        result = "Game is over because you pressed: \n" + result;
                        Toast.makeText(Home.this, result + "\n\nSCORES: " + (level - 1), Toast.LENGTH_LONG).show();
                    }
                }

            }
        });


    }

    public void turnColorsOn(final String currentBtn) {

        myHandler = new Handler();

        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {


                if (timeRemaining % 2 == 0) {

                    if (currentBtn.charAt(startCurrentString) == 'G') {

                        btnG2.setBackgroundColor(getResources().getColor(R.color.greenOn));

                    } else if (currentBtn.charAt(startCurrentString) == 'R') {

                        btnR2.setBackgroundColor(getResources().getColor(R.color.redOn));

                    } else if (currentBtn.charAt(startCurrentString) == 'Y') {

                        btnY2.setBackgroundColor(getResources().getColor(R.color.yellowOn));

                    } else if (currentBtn.charAt(startCurrentString) == 'B') {

                        btnB2.setBackgroundColor(getResources().getColor(R.color.blueOn));

                    }

                } else {

                    if (currentBtn.charAt(startCurrentString) == 'G') {

                        btnG2.setBackgroundColor(getResources().getColor(R.color.greenOff));
                        startCurrentString ++;

                    }else if (currentBtn.charAt(startCurrentString) == 'R') {

                        btnR2.setBackgroundColor(getResources().getColor(R.color.redOff));
                        startCurrentString ++;

                    }else if (currentBtn.charAt(startCurrentString) == 'Y') {

                        btnY2.setBackgroundColor(getResources().getColor(R.color.yellowOff));
                        startCurrentString ++;

                    }else if (currentBtn.charAt(startCurrentString) == 'B') {

                        btnB2.setBackgroundColor(getResources().getColor(R.color.blueOff));
                        startCurrentString ++;

                    }


                }


                timeRemaining --;

                if (timeRemaining > 0) {

                    myHandler.postDelayed(this, 1000);
                }
            }

        };
        myHandler.postDelayed(myRunnable, 3000);
    }

    public static String nextChar (){
        String nextColor="";
        Random ran = new Random();

        int next = ran.nextInt(3) + 1;

        if (next == 1){
            nextColor = "Y";
        }else if (next == 2){
            nextColor = "G";
        }else if (next == 3){
            nextColor = "R";
        }else if (next == 4){
            nextColor = "B";
        }

        return nextColor;
    }




}
