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
        btnNextGame.setVisibility(View.INVISIBLE);

        imgSonidoJuego1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonidoBafle1 = MediaPlayer.create(Game1.this, R.raw.car);
                sonidoBafle1.start();

                cntGame1.setVisibility(View.VISIBLE);
            }
        });

        btnNextGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Game1.this, Game2.class);
                startActivity(intent);
            }
        });

        /*lavadomanos.setOnClickListener(new View.OnClickListener() {
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
        });*/



    }

    /*public void validateValue(String value){
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
    }*/

    public void clickHandler(View v){
        System.out.println("ClickHandler");
        //Codigo necesario para cambiar a blanco y negro las imagenes
        ColorMatrix matrix = new ColorMatrix();
        matrix.setSaturation(0);
        ColorMatrixColorFilter filter = new ColorMatrixColorFilter(matrix);

        int id = v.getId();
        if (id == R.id.lavadomanos) {
            errorSonido = MediaPlayer.create(Game1.this, R.raw.error);
            errorSonido.start();

            lavadomanos.setOnClickListener(null);
            zapato.setOnClickListener(null);
            car.setOnClickListener(null);
            sonrisa.setOnClickListener(null);

            zapato.setColorFilter(filter);
            car.setColorFilter(filter);
            sonrisa.setColorFilter(filter);

            Toast.makeText(this, R.string.fallaste, Toast.LENGTH_SHORT).show();
        }else if(id == R.id.zapato){
            errorSonido = MediaPlayer.create(Game1.this, R.raw.error);
            errorSonido.start();

            lavadomanos.setOnClickListener(null);
            zapato.setOnClickListener(null);
            car.setOnClickListener(null);
            sonrisa.setOnClickListener(null);

            lavadomanos.setColorFilter(filter);
            car.setColorFilter(filter);
            sonrisa.setColorFilter(filter);

            Toast.makeText(this, R.string.fallaste, Toast.LENGTH_SHORT).show();
        }else if(id == R.id.car){
            successSonido = MediaPlayer.create(Game1.this, R.raw.success);
            successSonido.start();

            lavadomanos.setOnClickListener(null);
            zapato.setOnClickListener(null);
            car.setOnClickListener(null);
            sonrisa.setOnClickListener(null);

            lavadomanos.setColorFilter(filter);
            zapato.setColorFilter(filter);
            sonrisa.setColorFilter(filter);

            Toast.makeText(this, R.string.ganaste, Toast.LENGTH_SHORT).show();
        }else if(id == R.id.sonrisa){
            errorSonido = MediaPlayer.create(Game1.this, R.raw.error);
            errorSonido.start();

            lavadomanos.setOnClickListener(null);
            zapato.setOnClickListener(null);
            car.setOnClickListener(null);
            sonrisa.setOnClickListener(null);

            sonrisa.setColorFilter(filter);

            Toast.makeText(this, R.string.fallaste, Toast.LENGTH_SHORT).show();
        }

        btnNextGame.setVisibility(View.VISIBLE);
    }
}