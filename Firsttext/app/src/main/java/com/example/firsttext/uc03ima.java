package com.example.firsttext;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class uc03ima extends AppCompatActivity {

    Button button3back;

    private int curColor=0;
    final int[] colors = new int[]{
            R.color.color1,
            R.color.color2,
            R.color.color3,
            R.color.color4

    };
    final int[] names = new int[]{
            R.id.imageView1,
            R.id.imageView2,
            R.id.imageView3,
            R.id.imageView4,
    };
    ImageView [] views = new ImageView[names.length];
    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msq){
            if (msq.what == 0x123){
                for (int i=0;i<names.length;i++){
                    views[i].setBackgroundResource(colors[(i+curColor)%names.length]);
                }
                curColor++;
            }
            super.handleMessage(msq);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc03ima);

        for (int i = 0; i < names.length ; i++){
            views[i] = (ImageView) findViewById(names[i]);
        }
        //定义一个线程周期性地改变currentColor变量值
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                //发送一条空消息通知系统改变6个TextView组件的背景色
                handler.sendEmptyMessage(0x123);
            }
        },0,200);

        button3back =findViewById(R.id.button3back);//定义返回按键
        button3back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iuc1=new Intent(uc03ima.this,MainActivity.class);
                startActivity(iuc1);
            }
        });

    }
}
