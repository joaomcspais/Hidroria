package com.jp.hidroria;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.util.TypedValue;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CalendarActivity extends AppCompatActivity {
    private Data data;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        Typeface type = Typeface.createFromAsset(getAssets(),"fonts/Thonburi Bold.ttf");
        this.data = (Data) getIntent().getSerializableExtra("data");
        SimpleDateFormat sdf = new SimpleDateFormat("dd\nMMMM\nEEEE");
        TextView loc = (TextView) findViewById(R.id.loc);
        TextView date = (TextView) findViewById(R.id.date);
        loc.setTypeface(type);
        loc.setText(data.getLocationName().toUpperCase());
        AppCompatButton button = (AppCompatButton) findViewById(R.id.seguinte);
        button.setTypeface(type);
        type = Typeface.createFromAsset(getAssets(),"fonts/Sailors.ttf");
        date.setTypeface(type);
        date.setText(sdf.format(new Date()).toUpperCase());
        DatePicker picker = (DatePicker) findViewById(R.id.datePicker) ;
        picker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Calendar inst = Calendar.getInstance();
                inst.set(year, monthOfYear, dayOfMonth);
                String fin = sdf.format(inst.getTime());
                date.setText(fin);
                data.setDate(formatDate(inst.getTime()));
            }
        });

    }

    public void onClickNext(View view) {
        if (data.getDate() == "")
            data.setDate(formatDate(new Date()));
        data.setInfo(getFileInfo(data.getLocation()));
        Intent intent = new Intent(this, ResultsActivity.class);
        intent.putExtra("data", this.data);
        startActivity(intent);
    }

    private String getFileInfo(String loc) {
        String file = "";

        try {
            InputStream data = getAssets().open(loc + ".txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(data));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = reader.readLine();
                if (line.startsWith(this.data.getDate())) {
                    sb.append(line).append("\n");
                    break;
                } else if (line == null)
                    break;                                                                    //@todo DATA FORA DO RANGE
            }
            int count = 0;
            while (true) {
                String line = reader.readLine();
                if (count >= 14) {
                    reader.close();
                    file = sb.toString();
                    break;
                } else if (line != null) {
                    sb.append(line).append("\n");
                } else {
                    reader.close();
                    file = sb.toString();
                    break;
                }
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    private String formatDate(Date d) {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE, yyyy-MM-dd");
        String date = sdf.format(d);
        date = date.replaceAll("segunda", "Seg");
        date = date.replaceAll("terça", "Ter");
        date = date.replaceAll("quarta", "Qua");
        date = date.replaceAll("quinta", "Qui");
        date = date.replaceAll("sexta", "Sex");
        date = date.replaceAll("sábado", "Sab");
        date = date.replaceAll("domingo", "Dom");
        date = date.replaceAll("Mon", "Seg");
        date = date.replaceAll("Tue", "Ter");
        date = date.replaceAll("Wed", "Qua");
        date = date.replaceAll("Thu", "Qui");
        date = date.replaceAll("Fri", "Sex");
        date = date.replaceAll("Sat", "Sab");
        date = date.replaceAll("Sun", "Dom");
        return date;
    }

    public void onClickBack(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        startActivity(intent);
    }
}