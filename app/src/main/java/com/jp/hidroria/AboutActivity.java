package com.jp.hidroria;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AboutActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Typeface type = Typeface.createFromAsset(getAssets(),"fonts/Thonburi Bold.ttf");
        TextView textView = (TextView) findViewById(R.id.t0);
        textView.setTypeface(type);
        textView = (TextView) findViewById(R.id.t1);
        textView.setTypeface(type);
        textView = (TextView) findViewById(R.id.t2);
        textView.setTypeface(type);
    }

    public void onClickBack(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        startActivity(intent);
    }
}