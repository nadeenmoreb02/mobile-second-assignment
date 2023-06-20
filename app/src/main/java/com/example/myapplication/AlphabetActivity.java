package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class AlphabetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);


        RecyclerView recycler = findViewById(R.id.pizza_recycler);

        String[] captions = new String[Alphabet.alphabets.length];
        int[] ids = new int[Alphabet.alphabets.length];

        for(int i = 0; i<captions.length;i++){
            captions[i] = Alphabet.alphabets[i].getAlphabet();
            ids[i] = Alphabet.alphabets[i].getImgId();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(captions, ids);
        recycler.setAdapter(adapter);
    }
}