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

public class Game2 extends AppCompatActivity {

    LinearLayout cntGame2;
    ImageView imgSonidoJuego2;
    ImageView gallo;
    ImageView abuelo;
    ImageView setenta;
    ImageView caballo;
    MediaPlayer sonidoBafle2;
    MediaPlayer errorSonido;
    MediaPlayer successSonido;
    Button btnNextGame2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);

        cntGame2 = findViewById(R.id.cntGame2);
        imgSonidoJuego2 = findViewById(R.id.imgSonidoJuego2);
        gallo = findViewById(R.id.gallo);
        abuelo = findViewById(R.id.abuelo);
        setenta = findViewById(R.id.setenta);
        caballo = findViewById(R.id.caballo);
        btnNextGame2 = findViewById(R.id.btnNextGame2);

        cntGame2.setVisibility(View.INVISIBLE);
        btnNextGame2.setVisibility(View.INVISIBLE);

        imgSonidoJuego2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonidoBafle2 = MediaPlayer.create(Game2.this, R.raw.chicken);
                sonidoBafle2.start();

                cntGame2.setVisibility(View.VISIBLE);
            }
        });

        btnNextGame2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Game2.this, Game3.class);
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
        if (id == R.id.gallo) {
            successSonido = MediaPlayer.create(Game2.this, R.raw.success);
            successSonido.start();

            gallo.setOnClickListener(null);
            abuelo.setOnClickListener(null);
            setenta.setOnClickListener(null);
            caballo.setOnClickListener(null);

            abuelo.setColorFilter(filter);
            setenta.setColorFilter(filter);
            caballo.setColorFilter(filter);

            Toast.makeText(this, R.string.ganaste, Toast.LENGTH_SHORT).show();
        }else if(id == R.id.abuelo){
            errorSonido = MediaPlayer.create(Game2.this, R.raw.error);
            errorSonido.start();

            gallo.setOnClickListener(null);
            abuelo.setOnClickListener(null);
            setenta.setOnClickListener(null);
            caballo.setOnClickListener(null);

            gallo.setColorFilter(filter);
            setenta.setColorFilter(filter);
            caballo.setColorFilter(filter);

            Toast.makeText(this, R.string.fallaste, Toast.LENGTH_SHORT).show();
        }else if (id == R.id.setenta) {
            errorSonido = MediaPlayer.create(Game2.this, R.raw.error);
            errorSonido.start();

            gallo.setOnClickListener(null);
            abuelo.setOnClickListener(null);
            setenta.setOnClickListener(null);
            caballo.setOnClickListener(null);

            gallo.setColorFilter(filter);
            abuelo.setColorFilter(filter);
            caballo.setColorFilter(filter);

            Toast.makeText(this, R.string.fallaste, Toast.LENGTH_SHORT).show();
        }else if (id == R.id.caballo) {
            errorSonido = MediaPlayer.create(Game2.this, R.raw.error);
            errorSonido.start();

            gallo.setOnClickListener(null);
            abuelo.setOnClickListener(null);
            setenta.setOnClickListener(null);
            caballo.setOnClickListener(null);

            gallo.setColorFilter(filter);
            abuelo.setColorFilter(filter);
            setenta.setColorFilter(filter);

            Toast.makeText(this, R.string.fallaste, Toast.LENGTH_SHORT).show();
        }

        btnNextGame2.setVisibility(View.VISIBLE);
    }
}