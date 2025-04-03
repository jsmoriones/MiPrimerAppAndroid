package com.example.miprimeraaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ColoresView extends AppCompatActivity {

    TextView volver;

    LinearLayout cntColorRojo;
    LinearLayout cntColorAzul;
    LinearLayout cntColorVerde;

    MediaPlayer sonidoRojo;
    MediaPlayer sonidoAzul;
    MediaPlayer sonidoVerde;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colores_view);

        cntColorRojo = findViewById(R.id.cntColorRojo);
        cntColorAzul = findViewById(R.id.cntColorAzul);
        cntColorVerde = findViewById(R.id.cntColorVerde);
        volver = findViewById(R.id.backScreenColores);

        cntColorRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(ColoresView.this, "Rojo", Toast.LENGTH_SHORT).show();
                sonidoRojo = MediaPlayer.create(ColoresView.this, R.raw.red);
                sonidoRojo.start();
            }
        });

        cntColorAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(ColoresView.this, "Azul", Toast.LENGTH_SHORT).show();
                sonidoAzul = MediaPlayer.create(ColoresView.this, R.raw.blue);
                sonidoAzul.start();
            }
        });

        cntColorVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(ColoresView.this, "Verde", Toast.LENGTH_SHORT).show();
                sonidoVerde = MediaPlayer.create(ColoresView.this, R.raw.green);
                sonidoVerde.start();
            }
        });

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ColoresView.this, OptionalView.class);
                startActivity(intent);
            }
        });
    }
}