package com.example.tenziesgame;

import static com.example.tenziesgame.R.id.img3;
import static com.example.tenziesgame.R.id.start;
import static com.example.tenziesgame.R.id.submit;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Game extends AppCompatActivity {
    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;
    ImageView img6;
    ImageView img7;
    ImageView img8;
    ImageView img9;
    Button submitButton;


    TextView rule;
//    To Store the data
    int[] data = new int[9];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);
        img6 = findViewById(R.id.img6);
        img7 = findViewById(R.id.img7);
        img8 = findViewById(R.id.img8);
        img9 = findViewById(R.id.img9);
        rule=findViewById(R.id.rule);
        submitButton = findViewById(R.id.submit);
//        Starting the main Game
        onGameStart();
//            Setting on click for event 1
                img1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int number = randomNumberGenerator();
                        data[0]=number;
                        if(number==1){
                            img1.setImageResource(R.drawable.one);
                        }else if(number == 2){
                            img1.setImageResource(R.drawable.two);
                        }else if(number == 3){
                            img1.setImageResource(R.drawable.three);
                        }else if(number == 4){
                            img1.setImageResource(R.drawable.four);
                        }else if(number == 5){
                            img1.setImageResource(R.drawable.five);
                        }else if(number == 6){
                            img1.setImageResource(R.drawable.six);
                        }
                    }
                });
//        setting on click for event 2
                img2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int number = randomNumberGenerator();
                        data[1]=number;
                        if(number==1){
                            img2.setImageResource(R.drawable.one);
                        }else if(number == 2){
                            img2.setImageResource(R.drawable.two);
                        }else if(number == 3){
                            img2.setImageResource(R.drawable.three);
                        }else if(number == 4){
                            img2.setImageResource(R.drawable.four);
                        }else if(number == 5){
                            img2.setImageResource(R.drawable.five);
                        }else if(number == 6){
                            img2.setImageResource(R.drawable.six);
                        }
                    }
                });
                //        setting on click for event 3
                img3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int number = randomNumberGenerator();
                        data[2]=number;
                        if(number==1){
                            img3.setImageResource(R.drawable.one);
                        }else if(number == 2){
                            img3.setImageResource(R.drawable.two);
                        }else if(number == 3){
                            img3.setImageResource(R.drawable.three);
                        }else if(number == 4){
                            img3.setImageResource(R.drawable.four);
                        }else if(number == 5){
                            img3.setImageResource(R.drawable.five);
                        }else if(number == 6){
                            img3.setImageResource(R.drawable.six);
                        }
                    }
                });
//        setting on click for event 4
                img4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int number = randomNumberGenerator();
                        data[3]=number;
                        if(number==1){
                            img4.setImageResource(R.drawable.one);
                        }else if(number == 2){
                            img4.setImageResource(R.drawable.two);
                        }else if(number == 3){
                            img4.setImageResource(R.drawable.three);
                        }else if(number == 4){
                            img4.setImageResource(R.drawable.four);
                        }else if(number == 5){
                            img4.setImageResource(R.drawable.five);
                        }else if(number == 6){
                            img4.setImageResource(R.drawable.six);
                        }
                    }
                });
//        Setting up click for event 5
                img5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int number = randomNumberGenerator();
                        data[4]=number;
                        if(number==1){
                            img5.setImageResource(R.drawable.one);
                        }else if(number == 2){
                            img5.setImageResource(R.drawable.two);
                        }else if(number == 3){
                            img5.setImageResource(R.drawable.three);
                        }else if(number == 4){
                            img5.setImageResource(R.drawable.four);
                        }else if(number == 5){
                            img5.setImageResource(R.drawable.five);
                        }else if(number == 6){
                            img5.setImageResource(R.drawable.six);
                        }
                    }
                });
//        Setting up click for event 6
                img6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int number = randomNumberGenerator();
                        data[5]=number;
                        if(number==1){
                            img6.setImageResource(R.drawable.one);
                        }else if(number == 2){
                            img6.setImageResource(R.drawable.two);
                        }else if(number == 3){
                            img6.setImageResource(R.drawable.three);
                        }else if(number == 4){
                            img6.setImageResource(R.drawable.four);
                        }else if(number == 5){
                            img6.setImageResource(R.drawable.five);
                        }else if(number == 6){
                            img6.setImageResource(R.drawable.six);
                        }
                    }
                });
//        Setting up click for event 7
                img7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int number = randomNumberGenerator();
                        data[6]=number;
                        if(number==1){
                            img7.setImageResource(R.drawable.one);
                        }else if(number == 2){
                            img7.setImageResource(R.drawable.two);
                        }else if(number == 3){
                            img7.setImageResource(R.drawable.three);
                        }else if(number == 4){
                            img7.setImageResource(R.drawable.four);
                        }else if(number == 5){
                            img7.setImageResource(R.drawable.five);
                        }else if(number == 6){
                            img7.setImageResource(R.drawable.six);
                        }
                    }
                });
//        Setting up click for event 8
                img8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int number = randomNumberGenerator();
                        data[7]=number;
                        if(number==1){
                            img8.setImageResource(R.drawable.one);
                        }else if(number == 2){
                            img8.setImageResource(R.drawable.two);
                        }else if(number == 3){
                            img8.setImageResource(R.drawable.three);
                        }else if(number == 4){
                            img8.setImageResource(R.drawable.four);
                        }else if(number == 5){
                            img8.setImageResource(R.drawable.five);
                        }else if(number == 6){
                            img8.setImageResource(R.drawable.six);
                        }
                    }
                });
//        Setting up click for event 9
                img9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int number = randomNumberGenerator();
                        data[8]=number;
                        if(number==1){
                            img9.setImageResource(R.drawable.one);
                        }else if(number == 2){
                            img9.setImageResource(R.drawable.two);
                        }else if(number == 3){
                            img9.setImageResource(R.drawable.three);
                        }else if(number == 4){
                            img9.setImageResource(R.drawable.four);
                        }else if(number == 5){
                            img9.setImageResource(R.drawable.five);
                        }else if(number == 6){
                            img9.setImageResource(R.drawable.six);
                        }
                    }
                });

//                Check button on click listner
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkWinner()){
                    changeBackToMain();
                }
            }
        });
    }




    protected void changeBackToMain(){
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        Toast.makeText(this,"Game over",Toast.LENGTH_LONG).show();
        startActivity(intent);
    }
    protected void onGameStart(){
            int min = 1;
            int max=6;
        for(int i=0;i<data.length;i++){
            int random =(int) Math.floor(Math.random()*(max-min+1)+min);
            data[i]=random;
            switch (i){
                case 0:
                    if(random==1){
                        img1.setImageResource(R.drawable.one);
                    }else if(random == 2){
                        img1.setImageResource(R.drawable.two);
                    }else if(random == 3){
                        img1.setImageResource(R.drawable.three);
                    }else if(random == 4){
                        img1.setImageResource(R.drawable.four);
                    }else if(random == 5){
                        img1.setImageResource(R.drawable.five);
                    }else if(random == 6){
                        img1.setImageResource(R.drawable.six);
                    }
                    break;
                case 1:
                    if(random==1){
                        img2.setImageResource(R.drawable.one);
                    }else if(random == 2){
                        img2.setImageResource(R.drawable.two);
                    }else if(random == 3){
                        img2.setImageResource(R.drawable.three);
                    }else if(random == 4){
                        img2.setImageResource(R.drawable.four);
                    }else if(random == 5){
                        img2.setImageResource(R.drawable.five);
                    }else if(random == 6){
                        img2.setImageResource(R.drawable.six);
                    }
                    break;
                case 2:
                    if(random==1){
                        img3.setImageResource(R.drawable.one);
                    }else if(random == 2){
                        img3.setImageResource(R.drawable.two);
                    }else if(random == 3){
                        img3.setImageResource(R.drawable.three);
                    }else if(random == 4){
                        img3.setImageResource(R.drawable.four);
                    }else if(random == 5){
                        img3.setImageResource(R.drawable.five);
                    }else if(random == 6){
                        img3.setImageResource(R.drawable.six);
                    }
                    break;
                case 3:
                    if(random==1){
                        img4.setImageResource(R.drawable.one);
                    }else if(random == 2){
                        img4.setImageResource(R.drawable.two);
                    }else if(random == 3){
                        img4.setImageResource(R.drawable.three);
                    }else if(random == 4){
                        img4.setImageResource(R.drawable.four);
                    }else if(random == 5){
                        img4.setImageResource(R.drawable.five);
                    }else if(random == 6){
                        img4.setImageResource(R.drawable.six);
                    }
                    break;
                case 4:
                    if(random==1){
                        img5.setImageResource(R.drawable.one);
                    }else if(random == 2){
                        img5.setImageResource(R.drawable.two);
                    }else if(random == 3){
                        img5.setImageResource(R.drawable.three);
                    }else if(random == 4){
                        img5.setImageResource(R.drawable.four);
                    }else if(random == 5){
                        img5.setImageResource(R.drawable.five);
                    }else if(random == 6){
                        img5.setImageResource(R.drawable.six);
                    }
                    break;
                case 5:
                    if(random==1){
                        img6.setImageResource(R.drawable.one);
                    }else if(random == 2){
                        img6.setImageResource(R.drawable.two);
                    }else if(random == 3){
                        img6.setImageResource(R.drawable.three);
                    }else if(random == 4){
                        img6.setImageResource(R.drawable.four);
                    }else if(random == 5){
                        img6.setImageResource(R.drawable.five);
                    }else if(random == 6){
                        img6.setImageResource(R.drawable.six);
                    }
                    break;
                case 6:
                    if(random==1){
                        img7.setImageResource(R.drawable.one);
                    }else if(random == 2){
                        img7.setImageResource(R.drawable.two);
                    }else if(random == 3){
                        img7.setImageResource(R.drawable.three);
                    }else if(random == 4){
                        img7.setImageResource(R.drawable.four);
                    }else if(random == 5){
                        img7.setImageResource(R.drawable.five);
                    }else if(random == 6){
                        img7.setImageResource(R.drawable.six);
                    }
                    break;
                case 7:
                    if(random==1){
                        img8.setImageResource(R.drawable.one);
                    }else if(random == 2){
                        img8.setImageResource(R.drawable.two);
                    }else if(random == 3){
                        img8.setImageResource(R.drawable.three);
                    }else if(random == 4){
                        img8.setImageResource(R.drawable.four);
                    }else if(random == 5){
                        img8.setImageResource(R.drawable.five);
                    }else if(random == 6){
                        img8.setImageResource(R.drawable.six);
                    }
                    break;
                case 8:
                    if(random==1){
                        img9.setImageResource(R.drawable.one);
                    }else if(random == 2){
                        img9.setImageResource(R.drawable.two);
                    }else if(random == 3){
                        img9.setImageResource(R.drawable.three);
                    }else if(random == 4){
                        img9.setImageResource(R.drawable.four);
                    }else if(random == 5){
                        img9.setImageResource(R.drawable.five);
                    }else if(random == 6){
                        img9.setImageResource(R.drawable.six);
                    }
                    break;
            }
        }
        // setting up the images
        img1.setImageResource(R.drawable.one);
    }

    protected int randomNumberGenerator(){
        int min = 1;
        int max=6;
        return (int) Math.floor(Math.random()*(max-min+1)+min);
    }

    protected boolean checkWinner(){
        int firstNumber = data[0];

        for(int i=1;i<data.length;i++){
            if(!(data[i] == firstNumber)){
                return false;
            }
        }
        return true;
    }
}