package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        /*NumbersClickListener clickListener=new NumbersClickListener();*/

        Button numbersButton=(Button)findViewById(R.id.numbersButton);

        numbersButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent numbersIntent=new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(numbersIntent);
            }
        }
        );
        Button familyButton=(Button)findViewById(R.id.familyButton);

        familyButton.setOnClickListener(new View.OnClickListener()
                                         {
                                             @Override
                                             public void onClick(View view) {
                                                 Intent numbersIntent=new Intent(MainActivity.this,FamilyActivity.class);
                                                 startActivity(numbersIntent);
                                             }
                                         }
        );
        Button colorsButton=(Button)findViewById(R.id.colorsButton);

        colorsButton.setOnClickListener(new View.OnClickListener()
                                         {
                                             @Override
                                             public void onClick(View view) {
                                                 Intent numbersIntent=new Intent(MainActivity.this,ColorsActivity.class);
                                                 startActivity(numbersIntent);
                                             }
                                         }
        );
        Button phrasesButton=(Button)findViewById(R.id.phrasesButton);

        phrasesButton.setOnClickListener(new View.OnClickListener()
                                         {
                                             @Override
                                             public void onClick(View view) {
                                                 Intent numbersIntent=new Intent(MainActivity.this,PhrasesActivity.class);
                                                 startActivity(numbersIntent);
                                             }
                                         }
        );

    }

//    public void numbers_Button(View view)
//    {
//        Intent intent = new Intent(this, NumbersActivity.class);
//        startActivity(intent);
//    }
/*    public void family_Button(View view)
    {
        Intent intent = new Intent(this, FamilyActivity.class);
        startActivity(intent);
    }
    public void colors_Button(View view)
    {
        Intent intent = new Intent(this,ColorsActivity.class);
        startActivity(intent);
    }
    public void phrases_Button(View view)
    {
        Intent intent = new Intent(this, PhrasesActivity.class);
        startActivity(intent);
    }*/
}