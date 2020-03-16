package com.example.firsttext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2ActivityUC1 extends AppCompatActivity {

    Button button456,buttonUC101,buttonUC102,buttonUC103;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_u_c1);

        button456=findViewById(R.id.button456);//定义返回按键
        button456.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iuc1=new Intent(Main2ActivityUC1.this,MainActivity.class);
                startActivity(iuc1);
            }
        });

        buttonUC101=findViewById(R.id.buttonUC101);//连接UC1的水平布局
        buttonUC101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iuc101=new Intent(Main2ActivityUC1.this,uc0101page.class);
                startActivity(iuc101);
            }
        });

        buttonUC102=findViewById(R.id.buttonUC102);//连接UC1的垂直布局
        buttonUC102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iuc102=new Intent(Main2ActivityUC1.this,uc0102page.class);
                startActivity(iuc102);
            }
        });

        buttonUC103=findViewById(R.id.buttonUC103);//连接UC1的靠左对齐
        buttonUC103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iuc103=new Intent(Main2ActivityUC1.this,uc0103page.class);
                startActivity(iuc103);
            }
        });

    }
}
