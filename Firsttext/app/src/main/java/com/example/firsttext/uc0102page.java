package com.example.firsttext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class uc0102page extends AppCompatActivity {

    Button button0102;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc0102page);

        button0102=findViewById(R.id.button0102);
        button0102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iuc02=new Intent(uc0102page.this,Main2ActivityUC1.class);
                startActivity(iuc02);
            }
        });

    }
}
