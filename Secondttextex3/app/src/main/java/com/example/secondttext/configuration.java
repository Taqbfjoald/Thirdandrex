package com.example.secondttext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class configuration extends AppCompatActivity {

    EditText ori,navigation,touch,mnc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration);

        ori=(EditText)findViewById(R.id.ori);
        navigation=(EditText)findViewById(R.id.navigation);
        touch=(EditText)findViewById(R.id.touch);
        mnc=(EditText)findViewById(R.id.mnc);
        Button bn2=(Button)findViewById(R.id.bn2);
        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(configuration.this,MainActivity.class);
                startActivity(intent);
            }
        });
        Button bn1=(Button)findViewById(R.id.bn1);
        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Configuration cfg =getResources().getConfiguration();
                String screen=cfg.orientation==Configuration.ORIENTATION_LANDSCAPE?"横向屏幕":"纵向屏幕";
                String mncCode=cfg.mnc+"";
                String naviName=cfg.orientation==Configuration.NAVIGATION_NONAV?"没有方向控制":
                        cfg.orientation==Configuration.NAVIGATION_WHEEL?"滚轮控制方向":
                                cfg.orientation==Configuration.NAVIGATION_DPAD?"方向键控制方向":"轨迹球控制方向";
                navigation.setText(naviName);
                String touchName=cfg.touchscreen==Configuration.TOUCHSCREEN_NOTOUCH ?"无触摸屏":
                        cfg.touchscreen==Configuration.TOUCHSCREEN_STYLUS?"触摸笔式触摸屏":"接受手指的触摸屏";
                ori.setText(screen);
                mnc.setText(mncCode);
                touch.setText(touchName);
            }
        });
    }
}