package com.denieall.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Finding view by id
        Button btn_roll = findViewById(R.id.btnRoll);
        final ImageView left_dice = findViewById(R.id.img_left_dice);
        final ImageView right_dice = findViewById(R.id.img_right_dice);

        // Creating an array and making it constant
        final int[] diceImageArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        // Setting onclick event listener for button_roll
        btn_roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dicee", "Test");

                Random  rng = new Random();
                int dice_number_1 = rng.nextInt(6);
                int dice_number_2 = rng.nextInt(6);

                left_dice.setImageResource(diceImageArray[dice_number_1]);
                right_dice.setImageResource(diceImageArray[dice_number_2]);

// ************** Manipulating image name to update the image
//                // generate 0 to 5 --- for dice 1 and set dice img to left image view
//                int dice_number_1 = rng.nextInt(6) + 1;
//                int left_dice_img = getResources().getIdentifier("dice" + dice_number_1,"drawable", getPackageName());
//                left_dice.setImageResource(left_dice_img);
//
//                // generate 0 to 5 --- for dice 2 and set dice img to left image view
//                int dice_number_2 = rng.nextInt(6) + 1;
//                int right_dice_img = getResources().getIdentifier("dice" + dice_number_2,"drawable", getPackageName());
//                right_dice.setImageResource(right_dice_img);





            }
        });


    }
}
