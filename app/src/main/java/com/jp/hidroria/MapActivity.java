package com.jp.hidroria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        Typeface type = Typeface.createFromAsset(getAssets(),"fonts/Thonburi Bold.ttf");
        TextView textView = (TextView) findViewById(R.id.label);
        textView.setTypeface(type);
    }

    public void onClickLocation(View view) {
        String loc, info;
        Data data = new Data();
        switch (view.getId()) {
            case R.id.aveiro:
                data.setLocation("aveiro");
                data.setLocationName("Aveiro");
                break;
            case R.id.barra:
                data.setLocation("barra");
                data.setLocationName("Barra");
                break;
            case R.id.chegado:
                data.setLocation("chegado");
                data.setLocationName("Cais do Chegado");
                break;
            case R.id.costa_nova:
                data.setLocation("costa_nova");
                data.setLocationName("Costa Nova");
                break;
            case R.id.ilhavo:
                data.setLocation("ilhavo");
                data.setLocationName("Ílhavo");
                break;
            case R.id.ovar:
                data.setLocation("ovar");
                data.setLocationName("Ovar");
                break;
            case R.id.rio_novo:
                data.setLocation("rio_novo");
                data.setLocationName("Rio Novo");
                break;
            case R.id.sao_jacinto:
                data.setLocation("sao_jacinto");
                data.setLocationName("São Jacinto");
                break;
            case R.id.torreira:
                data.setLocation("torreira");
                data.setLocationName("Torreira");
                break;
            case R.id.vagueira:
                data.setLocation("vagueira");
                data.setLocationName("Vagueira");
                break;
            case R.id.varela:
                data.setLocation("varela");
                data.setLocationName("Ponte da Varela");
                break;
            case R.id.vista_alegre:
                data.setLocation("vista_alegre");
                data.setLocationName("Vista Alegre");
                break;
            default:
                return;
        }
        Intent intent = new Intent(this, CalendarActivity.class);
        intent.putExtra("data", data);
        startActivity(intent);
    }


    public void onClickInfo(View v) {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

    public void onClickPlus(View v) {
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }

    public void onClickBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}