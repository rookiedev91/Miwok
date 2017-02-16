
package com.example.android.miwok;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by prashant on 2/16/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context,0,words);
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

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_word);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        miwokTextView.setText(textView.getMiwok());
        return listItemView;
    }
}

