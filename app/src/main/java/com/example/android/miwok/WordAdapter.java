package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    int mBackgroundColor;

    public WordAdapter(Activity context, ArrayList<Word> words, int backgroundColor) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);

        mBackgroundColor = backgroundColor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // VOCAB TERMS

        Word word = getItem(position);

        TextView miwokView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokView.setText(word.getMiwokTerm());
//        miwokView.setBackgroundColor(mBackgroundColor);

        TextView defaultView = (TextView) listItemView.findViewById((R.id.default_text_view));
        defaultView.setText(word.getDefaultTerm());
//        defaultView.setBackgroundColor(mBackgroundColor);

        RelativeLayout layout = (RelativeLayout) listItemView.findViewById(R.id.vocab_section);
        layout.setBackgroundResource(mBackgroundColor);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.miwok_image_view);

        if (word.hasImageResource()) {

           imageView.setImageResource(word.getImageResourceId());
        }
        else {

            imageView.setVisibility(View.GONE);
        }

        //AUDIO





        return listItemView;
    }


}