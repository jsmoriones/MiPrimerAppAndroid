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

public class AnimalesView extends AppCompatActivity {

    TextView volver;
    LinearLayout cntVaca;
    LinearLayout cntPerro;
    LinearLayout cntGato;

    MediaPlayer sonidoVaca;
    MediaPlayer sonidoPerro;
    MediaPlayer sonidoGato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animales_view);

        cntVaca = findViewById(R.id.cntVaca);
        cntPerro = findViewById(R.id.cntPerro);
        cntGato = findViewById(R.id.cntGato);
        volver = findViewById(R.id.backScreenAnimales);


        cntVaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(AnimalesView.this, "Vaca", Toast.LENGTH_SHORT).show();
                sonidoVaca = MediaPlayer.create(AnimalesView.this, R.raw.vaca);
                sonidoVaca.start();
            }
        });

        cntPerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(AnimalesView.this, "Perro", Toast.LENGTH_SHORT).show();
                sonidoPerro = MediaPlayer.create(AnimalesView.this, R.raw.dog);
                sonidoPerro.start();
            }
        });

        cntGato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(AnimalesView.this, "Gato", Toast.LENGTH_SHORT).show();
                sonidoGato = MediaPlayer.create(AnimalesView.this, R.raw.cat);
                sonidoGato.start();
            }
        });

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AnimalesView.this, OptionalView.class);
                startActivity(intent);
            }
        });
    }
}