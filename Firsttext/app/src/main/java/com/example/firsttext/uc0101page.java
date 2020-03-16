package com.example.firsttext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class uc0101page extends AppCompatActivity {

    Button button0101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc0101page);

        button0101=findViewById(R.id.button0101);
        button0101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iuc01=new Intent(uc0101page.this,Main2ActivityUC1.class);
                startActivity(iuc01);
            }
        });
    }
}
