package com.example.firsttext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class uc4Table extends AppCompatActivity {

    Button buttonUC4back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc4_table);

        buttonUC4back=findViewById(R.id.button4back);
        buttonUC4back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iuc4b=new Intent( uc4Table.this,MainActivity.class);
                startActivity(iuc4b);
            }
        });

    }
}
