package com.jp.hidroria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {
    private Data data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        this.data = (Data) getIntent().getSerializableExtra("data");
        Typeface typeFace = Typeface.createFromAsset(getAssets(),"fonts/Thonburi Bold.ttf");

        TextView loc = (TextView) findViewById(R.id.loc);
        TextView locz, m;
        ImageView img;
        loc.setTypeface(typeFace);
        loc.setText(data.getLocationName().toUpperCase());
        String lines[] = data.getInfo().split("\\n");
        boolean color = true;
        Typeface type = Typeface.createFromAsset(getAssets(),"fonts/Sailors.ttf");


        loc = (TextView) findViewById(R.id.row1x);
        locz = (TextView) findViewById(R.id.row1z);
        img = (ImageView) findViewById(R.id.img1);
        m = (TextView) findViewById(R.id.m1);
        if(lines[0].contains("Baixa"))
            img.setImageResource(R.drawable.icon_baixa_mar);
        else if(lines[0].contains("Preia"))
            img.setImageResource(R.drawable.icon_preia_mar);
        loc.setTypeface(type);
        locz.setTypeface(type);
        m.setTypeface(typeFace);
        loc.setText(lines[0].split("     ")[0]);
        locz.setText(lines[0].split("     ")[1].split("   ")[0]);


        loc = (TextView) findViewById(R.id.row2x);
        locz = (TextView) findViewById(R.id.row2z);
        img = (ImageView) findViewById(R.id.img2);
        m = (TextView) findViewById(R.id.m2);
        if(!lines[1].split(" ")[0].equals(lines[0].split(" ")[0])) {
            if (color) {
                color = false;
            } else {
                color = true;
            }
        }
        if (color) {
            loc.setTextColor(Color.WHITE);
            locz.setTextColor(Color.WHITE);
            m.setTextColor(Color.WHITE);
            if(lines[1].contains("Baixa"))
                img.setImageResource(R.drawable.icon_baixa_mar);
            else if(lines[1].contains("Preia"))
                img.setImageResource(R.drawable.icon_preia_mar);
        } else {
            loc.setTextColor(Color.parseColor("#438DD6"));
            locz.setTextColor(Color.parseColor("#438DD6"));
            m.setTextColor(Color.parseColor("#438DD6"));
            if(lines[1].contains("Baixa"))
                img.setImageResource(R.drawable.icon_baixa_mar__1_);
            else if(lines[1].contains("Preia"))
                img.setImageResource(R.drawable.icon_preia_mar__1_);
        }
        loc.setTypeface(type);
        locz.setTypeface(type);
        m.setTypeface(typeFace);
        loc.setText(lines[1].split("     ")[0]);
        locz.setText(lines[1].split("     ")[1].split("   ")[0]);


        loc = (TextView) findViewById(R.id.row3x);
        locz = (TextView) findViewById(R.id.row3z);
        img = (ImageView) findViewById(R.id.img3);
        m = (TextView) findViewById(R.id.m3);
        if(!lines[2].split(" ")[0].equals(lines[1].split(" ")[0])) {
            if (color) {
                color = false;
            } else {
                color = true;
            }
        }
        if (color) {
            loc.setTextColor(Color.WHITE);
            locz.setTextColor(Color.WHITE);
            m.setTextColor(Color.WHITE);
            if(lines[2].contains("Baixa"))
                img.setImageResource(R.drawable.icon_baixa_mar);
            else if(lines[2].contains("Preia"))
                img.setImageResource(R.drawable.icon_preia_mar);
        } else {
            loc.setTextColor(Color.parseColor("#438DD6"));
            locz.setTextColor(Color.parseColor("#438DD6"));
            m.setTextColor(Color.parseColor("#438DD6"));
            if(lines[2].contains("Baixa"))
                img.setImageResource(R.drawable.icon_baixa_mar__1_);
            else if(lines[2].contains("Preia"))
                img.setImageResource(R.drawable.icon_preia_mar__1_);
        }
        loc.setTypeface(type);
        locz.setTypeface(type);
        m.setTypeface(typeFace);
        loc.setText(lines[2].split("     ")[0]);
        locz.setText(lines[2].split("     ")[1].split("   ")[0]);


        loc = (TextView) findViewById(R.id.row4x);
        locz = (TextView) findViewById(R.id.row4z);
        img = (ImageView) findViewById(R.id.img4);
        m = (TextView) findViewById(R.id.m4);
        if(!lines[3].split(" ")[0].equals(lines[2].split(" ")[0])) {
            if (color) {
                color = false;
            } else {
                color = true;
            }
        }
        if (color) {
            loc.setTextColor(Color.WHITE);
            locz.setTextColor(Color.WHITE);
            m.setTextColor(Color.WHITE);
            if(lines[3].contains("Baixa"))
                img.setImageResource(R.drawable.icon_baixa_mar);
            else if(lines[3].contains("Preia"))
                img.setImageResource(R.drawable.icon_preia_mar);
        } else {
            loc.setTextColor(Color.parseColor("#438DD6"));
            locz.setTextColor(Color.parseColor("#438DD6"));
            m.setTextColor(Color.parseColor("#438DD6"));
            if(lines[3].contains("Baixa"))
                img.setImageResource(R.drawable.icon_baixa_mar__1_);
            else if(lines[3].contains("Preia"))
                img.setImageResource(R.drawable.icon_preia_mar__1_);
        }
        loc.setTypeface(type);
        locz.setTypeface(type);
        m.setTypeface(typeFace);
        loc.setText(lines[3].split("     ")[0]);
        locz.setText(lines[3].split("     ")[1].split("   ")[0]);


        loc = (TextView) findViewById(R.id.row5x);
        locz = (TextView) findViewById(R.id.row5z);
        img = (ImageView) findViewById(R.id.img5);
        m = (TextView) findViewById(R.id.m5);
        if(!lines[4].split(" ")[0].equals(lines[3].split(" ")[0])) {
            if (color) {
                color = false;
            } else {
                color = true;
            }
        }
        if (color) {
            loc.setTextColor(Color.WHITE);
            locz.setTextColor(Color.WHITE);
            m.setTextColor(Color.WHITE);
            if(lines[4].contains("Baixa"))
                img.setImageResource(R.drawable.icon_baixa_mar);
            else if(lines[4].contains("Preia"))
                img.setImageResource(R.drawable.icon_preia_mar);
        } else {
            loc.setTextColor(Color.parseColor("#438DD6"));
            locz.setTextColor(Color.parseColor("#438DD6"));
            m.setTextColor(Color.parseColor("#438DD6"));
            if(lines[4].contains("Baixa"))
                img.setImageResource(R.drawable.icon_baixa_mar__1_);
            else if(lines[4].contains("Preia"))
                img.setImageResource(R.drawable.icon_preia_mar__1_);
        }
        loc.setTypeface(type);
        locz.setTypeface(type);
        m.setTypeface(typeFace);
        loc.setText(lines[4].split("     ")[0]);
        locz.setText(lines[4].split("     ")[1].split("   ")[0]);


        loc = (TextView) findViewById(R.id.row6x);
        locz = (TextView) findViewById(R.id.row6z);
        img = (ImageView) findViewById(R.id.img6);
        m = (TextView) findViewById(R.id.m6);
        if(!lines[5].split(" ")[0].equals(lines[4].split(" ")[0])) {
            if (color) {
                color = false;
            } else {
                color = true;
            }
        }
        if (color) {
            loc.setTextColor(Color.WHITE);
            locz.setTextColor(Color.WHITE);
            m.setTextColor(Color.WHITE);
            if(lines[5].contains("Baixa"))
                img.setImageResource(R.drawable.icon_baixa_mar);
            else if(lines[5].contains("Preia"))
                img.setImageResource(R.drawable.icon_preia_mar);
        } else {
            loc.setTextColor(Color.parseColor("#438DD6"));
            locz.setTextColor(Color.parseColor("#438DD6"));
            m.setTextColor(Color.parseColor("#438DD6"));
            if(lines[5].contains("Baixa"))
                img.setImageResource(R.drawable.icon_baixa_mar__1_);
            else if(lines[5].contains("Preia"))
                img.setImageResource(R.drawable.icon_preia_mar__1_);
        }
        loc.setTypeface(type);
        locz.setTypeface(type);
        m.setTypeface(typeFace);
        loc.setText(lines[5].split("     ")[0]);
        locz.setText(lines[5].split("     ")[1].split("   ")[0]);


        loc = (TextView) findViewById(R.id.row7x);
        locz = (TextView) findViewById(R.id.row7z);
        img = (ImageView) findViewById(R.id.img7);
        m = (TextView) findViewById(R.id.m7);
        if(!lines[6].split(" ")[0].equals(lines[5].split(" ")[0])) {
            if (color) {
                color = false;
            } else {
                color = true;
            }
        }
        if (color) {
            loc.setTextColor(Color.WHITE);
            locz.setTextColor(Color.WHITE);
            m.setTextColor(Color.WHITE);
            if(lines[6].contains("Baixa"))
                img.setImageResource(R.drawable.icon_baixa_mar);
            else if(lines[6].contains("Preia"))
                img.setImageResource(R.drawable.icon_preia_mar);
        } else {
            loc.setTextColor(Color.parseColor("#438DD6"));
            locz.setTextColor(Color.parseColor("#438DD6"));
            m.setTextColor(Color.parseColor("#438DD6"));
            if(lines[6].contains("Baixa"))
                img.setImageResource(R.drawable.icon_baixa_mar__1_);
            else if(lines[6].contains("Preia"))
                img.setImageResource(R.drawable.icon_preia_mar__1_);
        }
        loc.setTypeface(type);
        locz.setTypeface(type);
        m.setTypeface(typeFace);
        loc.setText(lines[6].split("     ")[0]);
        locz.setText(lines[6].split("     ")[1].split("   ")[0]);


        loc = (TextView) findViewById(R.id.row8x);
        locz = (TextView) findViewById(R.id.row8z);
        img = (ImageView) findViewById(R.id.img8);
        m = (TextView) findViewById(R.id.m8);
        if(!lines[7].split(" ")[0].equals(lines[6].split(" ")[0])) {
            if (color) {
                color = false;
            } else {
                color = true;
            }
        }
        if (color) {
            loc.setTextColor(Color.WHITE);
            locz.setTextColor(Color.WHITE);
            m.setTextColor(Color.WHITE);
            if(lines[7].contains("Baixa"))
                img.setImageResource(R.drawable.icon_baixa_mar);
            else if(lines[7].contains("Preia"))
                img.setImageResource(R.drawable.icon_preia_mar);
        } else {
            loc.setTextColor(Color.parseColor("#438DD6"));
            locz.setTextColor(Color.parseColor("#438DD6"));
            m.setTextColor(Color.parseColor("#438DD6"));
            if(lines[7].contains("Baixa"))
                img.setImageResource(R.drawable.icon_baixa_mar__1_);
            else if(lines[7].contains("Preia"))
                img.setImageResource(R.drawable.icon_preia_mar__1_);
        }
        loc.setTypeface(type);
        locz.setTypeface(type);
        m.setTypeface(typeFace);
        loc.setText(lines[7].split("     ")[0]);
        locz.setText(lines[7].split("     ")[1].split("   ")[0]);


        loc = (TextView) findViewById(R.id.row9x);
        locz = (TextView) findViewById(R.id.row9z);
        img = (ImageView) findViewById(R.id.img9);
        m = (TextView) findViewById(R.id.m9);
        if(!lines[8].split(" ")[0].equals(lines[7].split(" ")[0])) {
            if (color) {
                color = false;
            } else {
                color = true;
            }
        }
        if (color) {
            loc.setTextColor(Color.WHITE);
            locz.setTextColor(Color.WHITE);
            m.setTextColor(Color.WHITE);
            if(lines[8].contains("Baixa"))
                img.setImageResource(R.drawable.icon_baixa_mar);
            else if(lines[8].contains("Preia"))
                img.setImageResource(R.drawable.icon_preia_mar);
        } else {
            loc.setTextColor(Color.parseColor("#438DD6"));
            locz.setTextColor(Color.parseColor("#438DD6"));
            m.setTextColor(Color.parseColor("#438DD6"));
            if(lines[8].contains("Baixa"))
                img.setImageResource(R.drawable.icon_baixa_mar__1_);
            else if(lines[8].contains("Preia"))
                img.setImageResource(R.drawable.icon_preia_mar__1_);
        }
        loc.setTypeface(type);
        locz.setTypeface(type);
        m.setTypeface(typeFace);
        loc.setText(lines[8].split("     ")[0]);
        locz.setText(lines[8].split("     ")[1].split("   ")[0]);


        loc = (TextView) findViewById(R.id.row10x);
        locz = (TextView) findViewById(R.id.row10z);
        img = (ImageView) findViewById(R.id.img10);
        m = (TextView) findViewById(R.id.m10);
        if(!lines[9].split(" ")[0].equals(lines[8].split(" ")[0])) {
            if (color) {
                color = false;
            } else {
                color = true;
            }
        }
        if (color) {
            loc.setTextColor(Color.WHITE);
            locz.setTextColor(Color.WHITE);
            m.setTextColor(Color.WHITE);
            if(lines[9].contains("Baixa"))
                img.setImageResource(R.drawable.icon_baixa_mar);
            else if(lines[9].contains("Preia"))
                img.setImageResource(R.drawable.icon_preia_mar);
        } else {
            loc.setTextColor(Color.parseColor("#438DD6"));
            locz.setTextColor(Color.parseColor("#438DD6"));
            m.setTextColor(Color.parseColor("#438DD6"));
            if(lines[9].contains("Baixa"))
                img.setImageResource(R.drawable.icon_baixa_mar__1_);
            else if(lines[9].contains("Preia"))
                img.setImageResource(R.drawable.icon_preia_mar__1_);
        }
        loc.setTypeface(type);
        locz.setTypeface(type);
        m.setTypeface(typeFace);
        loc.setText(lines[9].split("     ")[0]);
        locz.setText(lines[9].split("     ")[1].split("   ")[0]);


        loc = (TextView) findViewById(R.id.row11x);
        locz = (TextView) findViewById(R.id.row11z);
        img = (ImageView) findViewById(R.id.img11);
        m = (TextView) findViewById(R.id.m11);
        if(!lines[10].split(" ")[0].equals(lines[9].split(" ")[0])) {
            if (color) {
                color = false;
            } else {
                color = true;
            }
        }
        if (color) {
            loc.setTextColor(Color.WHITE);
            locz.setTextColor(Color.WHITE);
            m.setTextColor(Color.WHITE);
            if(lines[10].contains("Baixa"))
                img.setImageResource(R.drawable.icon_baixa_mar);
            else if(lines[10].contains("Preia"))
                img.setImageResource(R.drawable.icon_preia_mar);
        } else {
            loc.setTextColor(Color.parseColor("#438DD6"));
            locz.setTextColor(Color.parseColor("#438DD6"));
            m.setTextColor(Color.parseColor("#438DD6"));
            if(lines[10].contains("Baixa"))
                img.setImageResource(R.drawable.icon_baixa_mar__1_);
            else if(lines[10].contains("Preia"))
                img.setImageResource(R.drawable.icon_preia_mar__1_);
        }
        loc.setTypeface(type);
        locz.setTypeface(type);
        m.setTypeface(typeFace);
        loc.setText(lines[10].split("     ")[0]);
        locz.setText(lines[10].split("     ")[1].split("   ")[0]);


        loc = (TextView) findViewById(R.id.row12x);
        locz = (TextView) findViewById(R.id.row12z);
        img = (ImageView) findViewById(R.id.img12);
        m = (TextView) findViewById(R.id.m12);
        if(!lines[11].split(" ")[0].equals(lines[10].split(" ")[0])) {
            if (color) {
                color = false;
            } else {
                color = true;
            }
        }
        if (color) {
            loc.setTextColor(Color.WHITE);
            locz.setTextColor(Color.WHITE);
            m.setTextColor(Color.WHITE);
            if(lines[11].contains("Baixa"))
                img.setImageResource(R.drawable.icon_baixa_mar);
            else if(lines[11].contains("Preia"))
                img.setImageResource(R.drawable.icon_preia_mar);
        } else {
            loc.setTextColor(Color.parseColor("#438DD6"));
            locz.setTextColor(Color.parseColor("#438DD6"));
            m.setTextColor(Color.parseColor("#438DD6"));
            if(lines[11].contains("Baixa"))
                img.setImageResource(R.drawable.icon_baixa_mar__1_);
            else if(lines[11].contains("Preia"))
                img.setImageResource(R.drawable.icon_preia_mar__1_);
        }
        loc.setTypeface(type);
        locz.setTypeface(type);
        m.setTypeface(typeFace);
        loc.setText(lines[11].split("     ")[0]);
        locz.setText(lines[11].split("     ")[1].split("   ")[0]);


        loc = (TextView) findViewById(R.id.row13x);
        locz = (TextView) findViewById(R.id.row13z);
        img = (ImageView) findViewById(R.id.img13);
        m = (TextView) findViewById(R.id.m13);
        if(!lines[12].split(" ")[0].equals(lines[11].split(" ")[0])) {
            if (color) {
                color = false;
            } else {
                color = true;
            }
        }
        if (color) {
            loc.setTextColor(Color.WHITE);
            locz.setTextColor(Color.WHITE);
            m.setTextColor(Color.WHITE);
            if(lines[12].contains("Baixa"))
                img.setImageResource(R.drawable.icon_baixa_mar);
            else if(lines[12].contains("Preia"))
                img.setImageResource(R.drawable.icon_preia_mar);
        } else {
            loc.setTextColor(Color.parseColor("#438DD6"));
            locz.setTextColor(Color.parseColor("#438DD6"));
            m.setTextColor(Color.parseColor("#438DD6"));
            if(lines[12].contains("Baixa"))
                img.setImageResource(R.drawable.icon_baixa_mar__1_);
            else if(lines[12].contains("Preia"))
                img.setImageResource(R.drawable.icon_preia_mar__1_);
        }
        loc.setTypeface(type);
        locz.setTypeface(type);
        m.setTypeface(typeFace);
        loc.setText(lines[12].split("     ")[0]);
        locz.setText(lines[12].split("     ")[1].split("   ")[0]);


        loc = (TextView) findViewById(R.id.row14x);
        locz = (TextView) findViewById(R.id.row14z);
        img = (ImageView) findViewById(R.id.img14);
        m = (TextView) findViewById(R.id.m14);
        if(!lines[13].split(" ")[0].equals(lines[12].split(" ")[0])) {
            if (color) {
                color = false;
            } else {
                color = true;
            }
        }
        if (color) {
            loc.setTextColor(Color.WHITE);
            locz.setTextColor(Color.WHITE);
            m.setTextColor(Color.WHITE);
            if(lines[13].contains("Baixa"))
                img.setImageResource(R.drawable.icon_baixa_mar);
            else if(lines[13].contains("Preia"))
                img.setImageResource(R.drawable.icon_preia_mar);
        } else {
            loc.setTextColor(Color.parseColor("#438DD6"));
            locz.setTextColor(Color.parseColor("#438DD6"));
            m.setTextColor(Color.parseColor("#438DD6"));
            if(lines[13].contains("Baixa"))
                img.setImageResource(R.drawable.icon_baixa_mar__1_);
            else if(lines[13].contains("Preia"))
                img.setImageResource(R.drawable.icon_preia_mar__1_);
        }
        loc.setTypeface(type);
        locz.setTypeface(type);
        m.setTypeface(typeFace);
        loc.setText(lines[13].split("     ")[0]);
        locz.setText(lines[13].split("     ")[1].split("   ")[0]);


        loc = (TextView) findViewById(R.id.row15x);
        locz = (TextView) findViewById(R.id.row15z);
        img = (ImageView) findViewById(R.id.img15);
        m = (TextView) findViewById(R.id.m15);
        if(!lines[14].split(" ")[0].equals(lines[13].split(" ")[0])) {
            if (color) {
                color = false;
            } else {
                color = true;
            }
        }
        if (color) {
            loc.setTextColor(Color.WHITE);
            locz.setTextColor(Color.WHITE);
            m.setTextColor(Color.WHITE);
            if(lines[14].contains("Baixa"))
                img.setImageResource(R.drawable.icon_baixa_mar);
            else if(lines[14].contains("Preia"))
                img.setImageResource(R.drawable.icon_preia_mar);
        } else {
            loc.setTextColor(Color.parseColor("#438DD6"));
            locz.setTextColor(Color.parseColor("#438DD6"));
            m.setTextColor(Color.parseColor("#438DD6"));
            if(lines[14].contains("Baixa"))
                img.setImageResource(R.drawable.icon_baixa_mar__1_);
            else if(lines[14].contains("Preia"))
                img.setImageResource(R.drawable.icon_preia_mar__1_);
        }
        loc.setTypeface(type);
        locz.setTypeface(type);
        m.setTypeface(typeFace);
        loc.setText(lines[14].split("     ")[0]);
        locz.setText(lines[14].split("     ")[1].split("   ")[0]);
    }

    public void onClickBack(View view) {
        Intent intent = new Intent(this, CalendarActivity.class);
        intent.putExtra("data", data);
        startActivity(intent);
    }
}