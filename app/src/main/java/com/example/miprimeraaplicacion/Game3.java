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

public class Game3 extends AppCompatActivity {

    LinearLayout cntGame3;
    ImageView imgSonidoJuego3;
    ImageView imgBebe;
    ImageView imgCuarenta;
    ImageView imgPapa;
    ImageView imgMadre;
    MediaPlayer sonidoBafle3;
    MediaPlayer errorError;
    MediaPlayer successSonido;

    Button btnNextGame3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game3);

        imgSonidoJuego3 = findViewById(R.id.imgSonidoJuego3);
        imgBebe = findViewById(R.id.imgBebe);
        imgCuarenta = findViewById(R.id.imgCuarenta);
        imgPapa = findViewById(R.id.imgPapa);
        imgMadre = findViewById(R.id.imgMadre);
        cntGame3 = findViewById(R.id.cntGame3);
        btnNextGame3 = findViewById(R.id.btnNextGame3);

        cntGame3.setVisibility(View.INVISIBLE);
        btnNextGame3.setVisibility(View.INVISIBLE);

        imgSonidoJuego3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoBafle3 = MediaPlayer.create(Game3.this, R.raw.children);
                sonidoBafle3.start();

                cntGame3.setVisibility(View.VISIBLE);
            }
        });

        btnNextGame3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Game3.this, Game4.class);
                startActivity(intent);
            }
        });
    }

    public void clickHandler(View v){
        //Codigo necesario para cambiar a blanco y negro las imagenes
        ColorMatrix matrix = new ColorMatrix();
        matrix.setSaturation(0);
        ColorMatrixColorFilter filter = new ColorMatrixColorFilter(matrix);

        int id = v.getId();
        if (id == R.id.imgMadre) {
            errorError = MediaPlayer.create(Game3.this, R.raw.error);
            errorError.start();

            imgBebe.setOnClickListener(null);
            imgCuarenta.setOnClickListener(null);
            imgPapa.setOnClickListener(null);
            imgMadre.setOnClickListener(null);

            imgBebe.setColorFilter(filter);
            imgCuarenta.setColorFilter(filter);
            imgPapa.setColorFilter(filter);

            Toast.makeText(this, R.string.fallaste, Toast.LENGTH_SHORT).show();
        }else if (id == R.id.imgBebe) {
            successSonido = MediaPlayer.create(Game3.this, R.raw.success);
            successSonido.start();

            imgBebe.setOnClickListener(null);
            imgCuarenta.setOnClickListener(null);
            imgPapa.setOnClickListener(null);
            imgMadre.setOnClickListener(null);

            imgMadre.setColorFilter(filter);
            imgCuarenta.setColorFilter(filter);
            imgPapa.setColorFilter(filter);

            Toast.makeText(this, R.string.ganaste, Toast.LENGTH_SHORT).show();
        }else if (id == R.id.imgPapa) {
            errorError = MediaPlayer.create(Game3.this, R.raw.error);
            errorError.start();

            imgBebe.setOnClickListener(null);
            imgCuarenta.setOnClickListener(null);
            imgPapa.setOnClickListener(null);
            imgMadre.setOnClickListener(null);

            imgBebe.setColorFilter(filter);
            imgCuarenta.setColorFilter(filter);
            imgMadre.setColorFilter(filter);

            Toast.makeText(this, R.string.fallaste, Toast.LENGTH_SHORT).show();
        }else if (id == R.id.imgCuarenta) {
            errorError = MediaPlayer.create(Game3.this, R.raw.error);
            errorError.start();

            imgBebe.setOnClickListener(null);
            imgCuarenta.setOnClickListener(null);
            imgPapa.setOnClickListener(null);
            imgMadre.setOnClickListener(null);

            imgBebe.setColorFilter(filter);
            imgPapa.setColorFilter(filter);
            imgMadre.setColorFilter(filter);

            Toast.makeText(this, R.string.fallaste, Toast.LENGTH_SHORT).show();
        }

        btnNextGame3.setVisibility(View.VISIBLE);
    }
}