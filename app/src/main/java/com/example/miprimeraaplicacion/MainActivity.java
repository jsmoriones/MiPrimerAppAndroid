package com.example.miprimeraaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //declaramos las variables para ser usadas | declaramos las vistas
    TextView txtTitulo;
    Button btnSiguiente;
    ImageView imgImagen1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //asignamos a cada variable los elementos de la vistas | Referenciamos las vistas de la interfaz
        txtTitulo = findViewById(R.id.txtTituloMain);
        btnSiguiente = findViewById(R.id.btnSiguiente);
        imgImagen1 = findViewById(R.id.imgImagen1);



        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Codigo para sara a otra vista | con este codigo hacemos el la navegacion de la aplicacion
                Intent intent = new Intent(MainActivity.this, FormularioRegistro.class);
                startActivity(intent);
            }
        });
    }
}