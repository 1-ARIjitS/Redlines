package com.example.miwokapp;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;


public class wordAdapter extends ArrayAdapter <word>
{


    public int mColorRes;

    public wordAdapter(Activity context, int resource, ArrayList<word> words) {
        super(context, 0, words);
        mColorRes=resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent,false);
        }

        word currentWord = getItem(position);

        TextView english = (TextView) listItemView.findViewById(R.id.english);

        english.setText(currentWord.getEnglishTranslation());

        TextView miwok = (TextView) listItemView.findViewById(R.id.miwok);

        miwok.setText(currentWord.getMiwokTranslation());

        ImageView image=(ImageView)listItemView.findViewById(R.id.image_view);

        if(currentWord.hasImage())
        {
            image.setImageResource(currentWord.getImage());
            image.setVisibility(View.VISIBLE);
        }

        else
            image.setVisibility(View.GONE);

        View textContainer=(View)listItemView.findViewById(R.id.singleList);

        int color= ContextCompat.getColor(getContext(),mColorRes);

        textContainer.setBackgroundColor(color);


        return listItemView;
    }
}
