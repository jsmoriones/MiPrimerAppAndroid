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

public class FrutasView extends AppCompatActivity {

    TextView volver;
    LinearLayout cntManzana;
    LinearLayout cntBanana;
    LinearLayout cntPera;

    MediaPlayer sonidoManzana;
    MediaPlayer sonidoBanana;
    MediaPlayer sonidoPera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frutas_view);

        cntManzana = findViewById(R.id.cntManzana);
        cntBanana = findViewById(R.id.cntBanana);
        cntPera = findViewById(R.id.cntPera);
        volver = findViewById(R.id.backScreenFrutas);

        cntManzana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(FrutasView.this, "Manzana", Toast.LENGTH_SHORT).show();
                sonidoManzana = MediaPlayer.create(FrutasView.this, R.raw.apple);
                sonidoManzana.start();
            }
        });

        cntBanana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(FrutasView.this, "Banana", Toast.LENGTH_SHORT).show();
                sonidoBanana = MediaPlayer.create(FrutasView.this, R.raw.banana);
                sonidoBanana.start();
            }
        });

        cntPera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(FrutasView.this, "Pera", Toast.LENGTH_SHORT).show();
                sonidoPera = MediaPlayer.create(FrutasView.this, R.raw.pair);
                sonidoPera.start();
            }
        });

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrutasView.this, OptionalView.class);
                startActivity(intent);
            }
        });
    }
}