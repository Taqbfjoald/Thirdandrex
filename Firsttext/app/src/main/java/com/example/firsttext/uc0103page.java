package com.example.firsttext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class uc0103page extends AppCompatActivity {

    Button button0103;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc0103page);

        button0103=findViewById(R.id.button0103);
        button0103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iuc03=new Intent(uc0103page.this,Main2ActivityUC1.class);
                startActivity(iuc03);
            }
        });

    }
}
