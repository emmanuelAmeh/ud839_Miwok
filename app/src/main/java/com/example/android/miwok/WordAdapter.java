package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mResorcescolorId;

    public WordAdapter(@NonNull Context context, ArrayList<Word> words, int resorcescolorId) {
        super(context,0, words);
        mResorcescolorId = resorcescolorId;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.word_list, parent, false);
        }

        Word w = getItem(position);

        ImageView iconImageView = (ImageView) listItemView.findViewById(R.id.word_icon);

        if (w.getImageResourceId() == 0){
            iconImageView.setVisibility(View.GONE);
        } else{
            iconImageView.setImageResource(w.getImageResourceId());
        }

        View textcontainer = listItemView.findViewById(R.id.text_container);
        textcontainer.setBackgroundColor(mResorcescolorId);


        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text);
        miwokTextView.setText(w.getMiwokTranslation());

        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english_text);
        englishTextView.setText(w.getDefaultTranslation());

        return listItemView;
    }
}
