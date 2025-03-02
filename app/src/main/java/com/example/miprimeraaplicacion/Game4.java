package com.example.miprimeraaplicacion;

import android.content.Intent;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Game4 extends AppCompatActivity {

    ImageView imgSonidoJuego4;
    MediaPlayer sonidoBafle4;
    LinearLayout cntGame4;
    ImageView imgArbol;
    ImageView imgRosa;
    ImageView imgCarne;
    ImageView imgDiez;
    MediaPlayer errorSonido;
    MediaPlayer successSonido;
    Button btnNextGame4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game4);

        imgSonidoJuego4 = findViewById(R.id.imgSonidoJuego4);
        imgArbol = findViewById(R.id.imgArbol);
        imgRosa = findViewById(R.id.imgRosa);
        imgCarne = findViewById(R.id.imgCarne);
        imgDiez = findViewById(R.id.imgDiez);
        cntGame4 = findViewById(R.id.cntGame4);
        btnNextGame4 = findViewById(R.id.btnNextGame4);

        cntGame4.setVisibility(View.INVISIBLE);

        imgSonidoJuego4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoBafle4 = MediaPlayer.create(Game4.this, R.raw.ten);
                sonidoBafle4.start();

                cntGame4.setVisibility(View.VISIBLE);
            }
        });

        btnNextGame4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Game4.this, OptionalView.class);
                startActivity(intent);
            }
        });
    }

    public void clickHandler(View v) {
        //Codigo necesario para cambiar a blanco y negro las imagenes
        ColorMatrix matrix = new ColorMatrix();
        matrix.setSaturation(0);
        ColorMatrixColorFilter filter = new ColorMatrixColorFilter(matrix);

        int id = v.getId();
        if (id == R.id.imgArbol){
            errorSonido = MediaPlayer.create(Game4.this, R.raw.error);
            errorSonido.start();

            imgArbol.setOnClickListener(null);
            imgRosa.setOnClickListener(null);
            imgCarne.setOnClickListener(null);
            imgDiez.setOnClickListener(null);

            imgRosa.setColorFilter(filter);
            imgCarne.setColorFilter(filter);
            imgDiez.setColorFilter(filter);

            Toast.makeText(this, R.string.fallaste, Toast.LENGTH_SHORT).show();
        }else if (id == R.id.imgRosa){
            errorSonido = MediaPlayer.create(Game4.this, R.raw.error);
            errorSonido.start();

            imgArbol.setOnClickListener(null);
            imgRosa.setOnClickListener(null);
            imgCarne.setOnClickListener(null);
            imgDiez.setOnClickListener(null);

            imgArbol.setColorFilter(filter);
            imgCarne.setColorFilter(filter);
            imgDiez.setColorFilter(filter);

            Toast.makeText(this, R.string.fallaste, Toast.LENGTH_SHORT).show();
        }else if (id == R.id.imgCarne){
            errorSonido = MediaPlayer.create(Game4.this, R.raw.error);
            errorSonido.start();

            imgArbol.setOnClickListener(null);
            imgRosa.setOnClickListener(null);
            imgCarne.setOnClickListener(null);
            imgDiez.setOnClickListener(null);

            imgArbol.setColorFilter(filter);
            imgRosa.setColorFilter(filter);
            imgDiez.setColorFilter(filter);

            Toast.makeText(this, R.string.fallaste, Toast.LENGTH_SHORT).show();
        }else if (id == R.id.imgDiez){
            successSonido = MediaPlayer.create(Game4.this, R.raw.success);
            successSonido.start();

            imgArbol.setOnClickListener(null);
            imgRosa.setOnClickListener(null);
            imgCarne.setOnClickListener(null);
            imgDiez.setOnClickListener(null);

            imgRosa.setColorFilter(filter);
            imgCarne.setColorFilter(filter);
            imgArbol.setColorFilter(filter);

            Toast.makeText(this, R.string.ganaste, Toast.LENGTH_SHORT).show();
        }
    }
}