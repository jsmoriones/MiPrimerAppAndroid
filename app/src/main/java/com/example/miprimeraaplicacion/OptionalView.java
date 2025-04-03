package com.example.miprimeraaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OptionalView extends AppCompatActivity {
    Button btnAprender;
    Button btnJugar;
    TextView backSCreenOptionalMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optional_view);

        btnAprender = findViewById(R.id.btnAprender);
        btnJugar = findViewById(R.id.btnJugar);
        //backSCreen = findViewById(R.id.bac);

        btnAprender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OptionalView.this, MenuApp.class);
                startActivity(intent);
            }
        });

        btnJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OptionalView.this, Game1.class);
                startActivity(intent);
            }
        });

        /*backSCreenOptionalMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OptionalView.this, OptionalView.class);
                startActivity(intent);
            }
        });*/
    }
}