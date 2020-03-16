package com.example.firsttext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


     Button buttonUC1,buttonUC2,buttonUC3,buttonUC4,buttonUC5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonUC1=findViewById(R.id.buttonUC1);
        buttonUC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iuc1=new Intent(MainActivity.this,Main2ActivityUC1.class);
                startActivity(iuc1);
            }
        });

        buttonUC2=findViewById(R.id.buttonUC2);
        buttonUC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iuc2=new Intent(MainActivity.this,uc02relative.class);
                startActivity(iuc2);
            }
        });

        buttonUC3=findViewById(R.id.buttonUC3);
        buttonUC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iuc3=new Intent(MainActivity.this,uc03ima.class);
                startActivity(iuc3);
            }
        });

        buttonUC4=findViewById(R.id.buttonUC4);
        buttonUC4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iuc4=new Intent(MainActivity.this,uc4Table.class);
                startActivity(iuc4);
            }
        });

        buttonUC5=findViewById(R.id.buttonUC5);
        buttonUC5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iuc5=new Intent(MainActivity.this,uc5grid.class);
                startActivity(iuc5);
            }
        });

    }

}
