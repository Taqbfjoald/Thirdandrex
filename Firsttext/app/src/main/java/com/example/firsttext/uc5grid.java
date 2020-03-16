package com.example.firsttext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class uc5grid extends AppCompatActivity {

    Button button5back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc5grid);

        button5back=findViewById(R.id.buttonUC5back);
        button5back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iuc5b=new Intent(uc5grid.this,MainActivity.class);
                startActivity(iuc5b);
            }
        });

    }
}
