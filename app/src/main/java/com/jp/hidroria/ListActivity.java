package com.jp.hidroria;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Typeface type = Typeface.createFromAsset(getAssets(),"fonts/Sailors.ttf");
        TextView textView;
        textView = (TextView) findViewById(R.id.bestida);
        textView.setTypeface(type);
        textView = (TextView) findViewById(R.id.bulhas);
        textView.setTypeface(type);
        textView = (TextView) findViewById(R.id.bunheiro);
        textView.setTypeface(type);
        textView = (TextView) findViewById(R.id.cambeia);
        textView.setTypeface(type);
        textView = (TextView) findViewById(R.id.esgueira);
        textView.setTypeface(type);
        textView = (TextView) findViewById(R.id.malhada);
        textView.setTypeface(type);
        textView = (TextView) findViewById(R.id.mancao);
        textView.setTypeface(type);
        textView = (TextView) findViewById(R.id.moliceiros_folsas_novas);
        textView.setTypeface(type);
        textView = (TextView) findViewById(R.id.nacinho);
        textView.setTypeface(type);
        textView = (TextView) findViewById(R.id.pardelhas);
        textView.setTypeface(type);
        textView = (TextView) findViewById(R.id.pedra);
        textView.setTypeface(type);
        textView = (TextView) findViewById(R.id.puchadouro);
        textView.setTypeface(type);
        textView = (TextView) findViewById(R.id.ribeira);
        textView.setTypeface(type);
        textView = (TextView) findViewById(R.id.ribeira_gago);
        textView.setTypeface(type);
        textView = (TextView) findViewById(R.id.ribeira_mourao);
        textView.setTypeface(type);
        textView = (TextView) findViewById(R.id.tabuada);
        textView.setTypeface(type);
        textView = (TextView) findViewById(R.id.teixugueiras);
        textView.setTypeface(type);
        textView = (TextView) findViewById(R.id.troncalhada);
        textView.setTypeface(type);
        type = Typeface.createFromAsset(getAssets(),"fonts/Thonburi Bold.ttf");
        textView = (TextView) findViewById(R.id.moreloc);
        textView.setTypeface(type);
    }

    public void onClickLocation(View view) {
        String loc, info;

        Data data = new Data();
        switch (view.getId()) {
            case R.id.bestida:
                data.setLocation("bestida");
                data.setLocationName("Cais da Bestida");
                break;
            case R.id.bulhas:
                data.setLocation("bulhas");
                data.setLocationName("Cais das Bulhas");
                break;
            case R.id.bunheiro:
                data.setLocation("bunheiro");
                data.setLocationName("Bunheiro");
                break;
            case R.id.cambeia:
                data.setLocation("cambeia");
                data.setLocationName("Cais da Cambeia");
                break;
            case R.id.esgueira:
                data.setLocation("esgueira");
                data.setLocationName("Ribeira de Esgueira");
                break;
            case R.id.malhada:
                data.setLocation("malhada");
                data.setLocationName("Cais da Malhada");
                break;
            case R.id.mancao:
                data.setLocation("mancao");
                data.setLocationName("Cais do Mancão");
                break;
            case R.id.moliceiros_folsas_novas:
                data.setLocation("moliceiros_folsas_novas");
                data.setLocationName("M. Folsas Novas");
                break;
            case R.id.nacinho:
                data.setLocation("nacinho");
                data.setLocationName("Cais do Nacinho");
                break;
            case R.id.pardelhas:
                data.setLocation("pardelhas");
                data.setLocationName("Pardelhas");
                break;
            case R.id.pedra:
                data.setLocation("pedra");
                data.setLocationName("Cais da Pedra");
                break;
            case R.id.puchadouro:
                data.setLocation("puchadouro");
                data.setLocationName("C. do Puchadouro");
                break;
            case R.id.ribeira:
                data.setLocation("ribeira");
                data.setLocationName("Cais da Ribeira");
                break;
            case R.id.ribeira_gago:
                data.setLocation("ribeira_gago");
                data.setLocationName("Cais de Ribeira Gago");
                break;
            case R.id.ribeira_mourao:
                data.setLocation("ribeira_mourao");
                data.setLocationName("Ribeira de Mourão");
                break;
            case R.id.tabuada:
                data.setLocation("tabuada");
                data.setLocationName("Cais da Tabuada");
                break;
            case R.id.teixugueiras:
                data.setLocation("teixugueiras");
                data.setLocationName("Cais das Teixugueiras");
                break;
            case R.id.troncalhada:
                data.setLocation("troncalhada");
                data.setLocationName("Troncalhada");
                break;
            default:
                return;
        }
        Intent intent = new Intent(this, CalendarActivity.class);
        intent.putExtra("data", data);
        startActivity(intent);
    }

    public void onClickBack(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        startActivity(intent);
    }
}