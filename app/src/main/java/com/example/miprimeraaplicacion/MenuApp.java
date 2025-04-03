package com.example.miprimeraaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MenuApp extends AppCompatActivity {

    //Inicializacion de las variables
    Button btnColores;
    Button btnAnimales;
    Button btnFrutas;
    TextView volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_app);

        //Asignacion de cada elemento de la vista a las variables
        btnColores = findViewById(R.id.btnColor);
        btnAnimales = findViewById(R.id.btnAnimales);
        btnFrutas = findViewById(R.id.btnFrutas);
        volver = findViewById(R.id.backScreenMenu);

        //Asignacion de los metodos para ejecutar las acciones que necesitemos
        btnColores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuApp.this, ColoresView.class);
                startActivity(intent);
            }
        });

        btnFrutas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuApp.this, FrutasView.class);
                startActivity(intent);
            }
        });

        btnAnimales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuApp.this, AnimalesView.class);
                startActivity(intent);
            }
        });

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuApp.this, OptionalView.class);
                startActivity(intent);
            }
        });
    }
}