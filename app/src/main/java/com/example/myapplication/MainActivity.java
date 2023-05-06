package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Spinner vocabularySpinner;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button vocabBtn = (Button)findViewById(R.id.button2);
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

<<<<<<<<< Temporary merge branch 1


        TextView titleTextView = findViewById(R.id.titleTextView);
        TextView descriptionTextView = findViewById(R.id.descriptionTextView);
        Button startButton = findViewById(R.id.startButton);
        // Set the image, title, and description
        imageView.setImageResource(R.drawable.landing_image);
        titleTextView.setText(R.string.app_name);
        descriptionTextView.setText(R.string.landing_description);
=========
        // Create an array of vocabulary names to display in the spinner
        String[] vocabularyNames = new String[vocabularies.length];
        for (int i = 0; i < vocabularies.length; i++) {
            vocabularyNames[i] = vocabularies[i].getName();
        }
>>>>>>>>> Temporary merge branch 2

        // Create an ArrayAdapter to populate the spinner with the vocabulary names
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, vocabularyNames);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
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

            }
        });


    }
}





