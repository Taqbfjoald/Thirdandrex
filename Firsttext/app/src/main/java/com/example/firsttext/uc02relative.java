package com.example.firsttext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class uc02relative extends AppCompatActivity {

    Button button2back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc02relativ);

        button2back =findViewById(R.id.button2back);//定义返回按键
        button2back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iuc1=new Intent(uc02relative.this,MainActivity.class);
                startActivity(iuc1);
            }
        });

    }
}
