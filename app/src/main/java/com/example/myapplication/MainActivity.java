package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner vocabularySpinner;
    private TextView textView;
    private ImageView imageView;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button vocabBtn = (Button)findViewById(R.id.button2);
        Button vowelBtn = (Button)findViewById(R.id.buttonVowel);
        Button grammerBtn = (Button)findViewById(R.id.button3);
        Button alphabetBtn = (Button)findViewById(R.id.alphabetBtn);
        Button numbersBtn = (Button) findViewById(R.id.numbersBtn);
        Button backvowelBtn = (Button) findViewById(R.id.backVowelBtn);
        Button backvocabBtn = (Button) findViewById(R.id.backVocabBtn);
        Button backgrammerBtn = (Button) findViewById(R.id.backgrammerBtn);



        // Create an array of Vocabulary objects
        Vocabulary[] vocabularies = {
                new Vocabulary("Choose Vocabulary", "Definition Here"),
                new Vocabulary("Include", "Contain as a part of the whole"),
                new Vocabulary("Label", "Phrase or name applied to a thing or a person"),
                new Vocabulary("Living", "The pursuit of a lifestyle of some specific types"),
                new Vocabulary("Necessary", "Something that is important"),
                new Vocabulary("Noticed", "Become aware of, mention or remark on"),
                new Vocabulary("Opinion", "A statement of advice by an expert or professional on a matter, a view, or judgment formed about something"),
                new Vocabulary("Plan", "A detailed proposal or achieving something"),
                new Vocabulary("Data", "Facts of a process"),
                new Vocabulary("Escape", "Break free from confinement or control"),
                new Vocabulary("Famous", "Known by many individuals"),
                new Vocabulary("Community", "A group of people residing at the same place or having something in common"),
                new Vocabulary("Data", "Facts of a process")

        };



        // Create an array of vocabulary names to display in the spinner
        String[] vocabularyNames = new String[vocabularies.length];
        for (int i = 0; i < vocabularies.length; i++) {
            vocabularyNames[i] = vocabularies[i].getName();
        }

        // Create an ArrayAdapter to populate the spinner with the vocabulary names
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, vocabularyNames);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Vowel[] vowels = {
                new Vowel("Choose Vowel", "Example Here", R.drawable.v),
                new Vowel("a", "apple", R.drawable.apple),
                new Vowel("e", "elephant", R.drawable.elephant),
                new Vowel("i", "ice", R.drawable.ice),
                new Vowel("o", "orange", R.drawable.orange),
                new Vowel("u", "umbrella", R.drawable.umbrella),
        };
        // Create an array of vowel Letters to display in the spinner
        String[] vowelLetters = new String[vowels.length];
        for (int i = 0; i < vowels.length; i++) {
            vowelLetters[i] = vowels[i].getLetter();
        }
        // Create an ArrayAdapter to populate the spinner with the Vowel Letters
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, vowelLetters);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Grammer[] grammers = {
                new Grammer("Choose topic", "Definition&Example Here"),
                new Grammer("Simple past tense", "Talk about a completed action in a time before now: John Cabot sailed to America in 1498."),
                new Grammer("Simple present tense", "Describe habits, unchanging situations, general truths, and fixed arrangements: I work in London."),
                new Grammer("Present continuous tense", "Describe actions happening now, at the moment of speaking, or current temporary situations: She is reading a book."),
                new Grammer("Past continuous tense", "Describe actions that were happening at a specific time in the past or ongoing actions interrupted by another event: They were watching TV when the power went out."),
                new Grammer("Present perfect tense", "Express actions or events that have just occurred, completed actions with a result in the present, or experiences in someone's life: I have finished my homework."),
                new Grammer("Past perfect tense", "Describe actions completed before a specific point in the past or to show cause and effect relationships: She had already eaten when I arrived."),
                new Grammer("Future simple tense", "Express actions that will happen in the future: They will arrive tomorrow."),
                new Grammer("Future continuous tense", "Describe ongoing actions that will happen in the future: I will be studying for my exam."),
                new Grammer("Future perfect tense", "Express actions that will be completed before a specific point in the future: By this time next year, I will have graduated."),

        };
        // Create an array of vowel Letters to display in the spinner
        String[] gs = new String[grammers.length];
        for (int i = 0; i < grammers.length; i++) {
            gs[i] = grammers[i].getTopic();
        }
        // Create an ArrayAdapter to populate the spinner with the Vowel Letters
        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, gs);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        vocabBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setContentView(R.layout.vocab);
                // Find views by ID
                vocabularySpinner = findViewById(R.id.vocabulary_spinner);
                textView = findViewById(R.id.textView);





                // Set the adapter for the spinner
                vocabularySpinner.setAdapter(adapter);


                ;

                // Set the spinner item selected listener
                vocabularySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        // Get the selected item
                        Vocabulary selectedVocabulary = vocabularies[position];

                        // Display the selected vocabulary
                        String name = selectedVocabulary.getName();
                        String definition = selectedVocabulary.getDefinition();
                        textView.setText(definition);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                        // This method is called when nothing is selected in the spinner
                        // TODO: handle the case when nothing is selected
                    }
                });
           /*     backvocabBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        setContentView(R.layout.activity_main);}});*/


            }
        });



        vowelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setContentView(R.layout.vowel);
                // Find views by ID
                vocabularySpinner = findViewById(R.id.vocabulary_spinner);
                textView = findViewById(R.id.textView);
                imageView = findViewById(R.id.vImg);



                // Set the adapter for the spinner
                vocabularySpinner.setAdapter(adapter2);


                ;

                // Set the spinner item selected listener
                vocabularySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        // Get the selected item
                        Vowel selectedVocabulary = vowels[position];

                        // Display the selected vocabulary
                        String name = selectedVocabulary.getLetter();
                        String definition = selectedVocabulary.getExample();
                        textView.setText(definition);
                        imageView.setImageResource(selectedVocabulary.getImg());
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                        // This method is called when nothing is selected in the spinner
                        // TODO: handle the case when nothing is selected
                    }
                });
                  /* backvowelBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            setContentView(R.layout.activity_main);}});*/

            }
        });


        grammerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.grammer);
                // Find views by ID
                vocabularySpinner = findViewById(R.id.vocabulary_spinner);
                textView = findViewById(R.id.textView);

                // Set the adapter for the spinner
                vocabularySpinner.setAdapter(adapter3);

                // Set the spinner item selected listener
                vocabularySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        // Get the selected item
                        Grammer selectedGrammer = grammers[position];

                        // Display the selected grammar
                        String name = selectedGrammer.getTopic();
                        String definition = selectedGrammer.getExample();
                        textView.setText(definition);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                        // This method is called when nothing is selected in the spinner
                        // TODO: handle the case when nothing is selected
                    }

                });
             /*   backgrammerBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        setContentView(R.layout.activity_main);}});*/
            }
        });
       alphabetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(MainActivity.this, AlphabetActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }, 1000);
            }});
        numbersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(MainActivity.this, NumbersActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }, 500);
            }});

    }

}
