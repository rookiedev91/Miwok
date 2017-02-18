
package com.example.android.miwok;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by prashant on 2/16/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int colorId;
    private int audioId;
    private MediaPlayer mediaPlayer;
    public WordAdapter(Activity context, ArrayList<Word> words,int color) {
        super(context, 0, words);
        colorId = color;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                   R.layout.list_item, parent, false);
        }
        Word textView = getItem(position);
        TextView engTextView = (TextView) listItemView.findViewById(R.id.english_word);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        engTextView.setText(textView.getEnglish());
       // engTextView.setBackgroundColor(color);

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_word);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        miwokTextView.setText(textView.getMiwok());

        ImageView iconImage = (ImageView)listItemView.findViewById(R.id.icon_miwok);
        if(textView.hasImage()) {
            iconImage.setImageResource(textView.getImage());
            iconImage.setVisibility(View.VISIBLE);
        }
        else
            iconImage.setVisibility(View.GONE);
        audioId= textView.getAudio();
        View textContainer=  listItemView.findViewById(R.id.text_container);
        textContainer.setBackgroundColor(ContextCompat.getColor(getContext(),colorId));
        return listItemView;
    }
}

