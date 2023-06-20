package com.example.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NumbersActivity extends AppCompatActivity {
    private TextView numberTextView;
    private ImageView numberImageView;
    private Button nextButton;

    private int currentNumberIndex;
    private int[] numberImages = {
            R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six,
            R.drawable.seven,
            R.drawable.eight,
            R.drawable.nine,
            R.drawable.ten
    };

    private String[] numberNames = {
            "One",
            "Two",
            "Three",
            "Four",
            "Five",
            "Six",
            "Seven",
            "Eight",
            "Nine",
            "Ten"
    };

    private SharedPreferences sharedPreferences;
    private static final String PREF_CURRENT_NUMBER_INDEX = "current_number_index";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numbers);
        numberTextView = findViewById(R.id.numberTextView);
        numberImageView = findViewById(R.id.numberImageView);
        nextButton = findViewById(R.id.nextButton);

        // Initialize shared preferences
        sharedPreferences = getSharedPreferences("MyAppPreferences", Context.MODE_PRIVATE);

        // Retrieve the last saved number index from shared preferences
        currentNumberIndex = sharedPreferences.getInt(PREF_CURRENT_NUMBER_INDEX, 0);

        updateNumber();

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNumberIndex++;
                if (currentNumberIndex >= numberNames.length) {
                    currentNumberIndex = 0;
                }
                updateNumber();

                // Save the current number index to shared preferences
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt(PREF_CURRENT_NUMBER_INDEX, currentNumberIndex);
                editor.apply();
            }
        });
    }

    private void updateNumber() {
        String numberName = numberNames[currentNumberIndex];
        int numberImage = numberImages[currentNumberIndex];

        numberTextView.setText(numberName);
        numberImageView.setImageResource(numberImage);
    }
}