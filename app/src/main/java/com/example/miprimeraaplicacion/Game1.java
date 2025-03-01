package com.example.miprimeraaplicacion;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Game1 extends AppCompatActivity {
    LinearLayout cntGame1;
    ImageView imgSonidoJuego1;
    ImageView lavadomanos;
    ImageView zapato;
    ImageView car;
    ImageView sonrisa;
    MediaPlayer sonidoBafle1;
    MediaPlayer errorSonido;
    MediaPlayer successSonido;
    Button btnNextGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game1);

        imgSonidoJuego1 = findViewById(R.id.imgSonidoJuego1);
        lavadomanos = findViewById(R.id.lavadomanos);
        zapato = findViewById(R.id.zapato);
        car = findViewById(R.id.car);
        sonrisa = findViewById(R.id.sonrisa);
        cntGame1 = findViewById(R.id.cntGame1);
        btnNextGame = findViewById(R.id.btnNextGame);

        cntGame1.setVisibility(View.INVISIBLE);

        imgSonidoJuego1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonidoBafle1 = MediaPlayer.create(Game1.this, R.raw.car);
                sonidoBafle1.start();

                cntGame1.setVisibility(View.VISIBLE);
            }
        });

        lavadomanos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                validateValue("lavamanos");
            }
        });

        zapato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                validateValue("zapato");
            }
        });

        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                validateValue("car");
            }
        });

        sonrisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                validateValue("sonrisa");
            }
        });



    }

    public void validateValue(String value){
        switch (value){
            case "lavamanos":
                errorSonido = MediaPlayer.create(Game1.this, R.raw.error);
                errorSonido.start();

                lavadomanos.setOnClickListener(null);
                zapato.setOnClickListener(null);
                car.setOnClickListener(null);
                sonrisa.setOnClickListener(null);

                lavadomanos.getDrawable().setColorFilter(Color.RED, PorterDuff.Mode.MULTIPLY);
                break;
            case "zapato":
                errorSonido = MediaPlayer.create(Game1.this, R.raw.error);
                errorSonido.start();

                lavadomanos.setOnClickListener(null);
                zapato.setOnClickListener(null);
                car.setOnClickListener(null);
                sonrisa.setOnClickListener(null);
                break;
            case "car":
                successSonido = MediaPlayer.create(Game1.this, R.raw.success);
                successSonido.start();

                lavadomanos.setOnClickListener(null);
                zapato.setOnClickListener(null);
                car.setOnClickListener(null);
                sonrisa.setOnClickListener(null);
                break;
            case "sonrisa":
                errorSonido = MediaPlayer.create(Game1.this, R.raw.error);
                errorSonido.start();

                lavadomanos.setOnClickListener(null);
                zapato.setOnClickListener(null);
                car.setOnClickListener(null);
                sonrisa.setOnClickListener(null);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + value);
        }
    }
}