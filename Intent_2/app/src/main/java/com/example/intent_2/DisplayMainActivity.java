package com.example.intent_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayMainActivity extends AppCompatActivity {

    private ImageView imageViewPic;
    private TextView textViewData;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_main);

        imageViewPic = (ImageView)findViewById(R.id.imageView_pic);
        textViewData = (TextView)findViewById(R.id.textView_data);

        intent = getIntent();
        setTitle(intent.getStringExtra("name"));
        imageViewPic.setImageResource(intent.getIntExtra("picture",R.drawable.taipei));
        textViewData.setText(intent.getIntExtra("data",R.string.taipei_data));
    }
}