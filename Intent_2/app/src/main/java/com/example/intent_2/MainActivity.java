package com.example.intent_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewTaipei,textViewNewTaipei,textViewTaoyuan,textViewHsinchu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTaipei = (TextView)findViewById(R.id.textView_taipei);
        textViewNewTaipei = (TextView)findViewById(R.id.textView_newtaipei);
        textViewTaoyuan = (TextView)findViewById(R.id.textView_taoyuan);
        textViewHsinchu = (TextView)findViewById(R.id.textView_hsinchu);

        textViewTaipei.setOnClickListener(new Myclass());
        textViewNewTaipei.setOnClickListener(new Myclass());
        textViewTaoyuan.setOnClickListener(new Myclass());
        textViewHsinchu.setOnClickListener(new Myclass());
    }

    private class Myclass implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, DisplayMainActivity.class);
            switch (v.getId()){
                case R.id.textView_taipei:
                    intent.putExtra("name", getString(R.string.taipei));
                    intent.putExtra("data",R.string.taipei_data);
                    intent.putExtra("picture",R.drawable.taipei);
                    startActivity(intent);
                    break;
                case R.id.textView_newtaipei:
                    intent.putExtra("name", getString(R.string.newtaipei));
                    intent.putExtra("data",R.string.newtaipei_data);
                    intent.putExtra("picture",R.drawable.newtaipei);
                    startActivity(intent);
                    break;
                case R.id.textView_taoyuan:
                    intent.putExtra("name", getString(R.string.taoyuan));
                    intent.putExtra("data",R.string.taoyuan_data);
                    intent.putExtra("picture",R.drawable.taoyuan);
                    startActivity(intent);
                    break;
                case R.id.textView_hsinchu:
                    intent.putExtra("name", getString(R.string.hsinchu));
                    intent.putExtra("data",R.string.hsinchu_data);
                    intent.putExtra("picture",R.drawable.shinchu);
                    startActivity(intent);
                    break;
            }
        }
    }
}