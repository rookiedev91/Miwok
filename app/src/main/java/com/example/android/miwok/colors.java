package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class colors  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red","weṭeṭṭi"));
        words.add(new Word("green","chokokki"));
        words.add(new Word("brown","takaakki"));
        words.add(new Word("gray","topoppi"));
        words.add(new Word("black","kululli"));
        words.add(new Word("white","klelli"));
        words.add(new Word("dusty yellow","ṭopiisә"));
        words.add(new Word("mustard yellow","chiwiiṭә"));
        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}