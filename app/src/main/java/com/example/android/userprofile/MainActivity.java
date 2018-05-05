package com.example.android.userprofile;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        ImageView profilePic = (ImageView) findViewById(R.id.profile_picture);
        profilePic.setImageResource(R.drawable.profilepicture);

        //find name text view and populate data
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(R.string.myName);
        name.setTextSize(30);
        name.setTextColor(Color.RED);

        //find birthday text view and populate data
        TextView birthDay = (TextView) findViewById(R.id.birthday);
        birthDay.setText(R.string.birthday);
        birthDay.setTextSize(30);
        birthDay.setTextColor(Color.BLACK);

        //find @country text view and populate data
        TextView country = (TextView) findViewById(R.id.country);
        country.setText(R.string.country);
        country.setTextColor(Color.BLACK);


    }
}
