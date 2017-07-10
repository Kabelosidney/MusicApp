package com.mlab.kabelo.musicapp;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Admin on 7/10/2017.
 */

public class WordAdapter {


    private static final String LOG_TAG = WordAdapter.class.getSimpleName();
    private Context context;

    public WordAdapter(AudioManager.OnAudioFocusChangeListener context, ArrayList<Word> words) {
        super(context, 0,words);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView englishTextView = (TextView) listItemView.findViewById(R.id.version_English);
        englishTextView.setText(currentWord.getVersionEnglish());


        TextView afrikaansTextView = (TextView) listItemView.findViewById(R.id.version_Afrikaans);
        afrikaansTextView.setText(currentWord.getVersionAfrikaans());


        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        iconView.setImageResource(currentWord.getmImageResourceId());

        return listItemView;


    }

    private Word getItem(int position) {
    }

    public Context getContext() {
        return context;
    }
}
