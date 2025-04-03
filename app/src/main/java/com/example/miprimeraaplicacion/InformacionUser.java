package com.example.miprimeraaplicacion;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class InformacionUser extends AppCompatActivity {
    TextView txtTuNombre, txtTuApellido,txtTuEdad,txtTuGenero,txtTuColegio,txtTuNickname, txtIntereses;
    Bundle extras;
    ImageButton btnFacebook, btnInstagram, btnGmail, btnWeb;
    Button btnGoApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion_user);

        txtTuNombre = findViewById(R.id.txtTuNombre);
        txtTuApellido = findViewById(R.id.txtTuApellido);
        txtTuEdad = findViewById(R.id.txtTuEdad);
        txtTuGenero = findViewById(R.id.txtTuGenero);
        txtTuColegio = findViewById(R.id.txtTuColegio);
        txtTuNickname = findViewById(R.id.txtTuNickname);
        txtIntereses = findViewById(R.id.txtIntereses);
        btnFacebook = findViewById(R.id.btnFacebook);
        btnInstagram = findViewById(R.id.btnInstagram);
        btnGmail = findViewById(R.id.btnGmail);
        btnWeb = findViewById(R.id.btnWeb);
        btnGoApp = findViewById(R.id.btnGoApp);


        extras = getIntent().getExtras();
        String nombre = extras.getString("nombre");
        String apellido = extras.getString("apellido");
        String edad = extras.getString("edad");
        String colegio = extras.getString("colegio");
        String nickname = extras.getString("nickname");
        String genero = extras.getString("genero");
        String interes = extras.getString("interes");

        txtTuNombre.setText( nombre );
        txtTuApellido.setText( apellido );
        txtTuEdad.setText( edad );
        txtTuColegio.setText( colegio );
        txtTuNickname.setText( nickname );
        txtTuGenero.setText( genero );
        txtIntereses.setText(interes);

        /*if (getSeleccionados != null) {
            String texto = String.join(", ", getSeleccionados);
            txtIntereses.setText(texto);
        } else {
            txtIntereses.setText("No se seleccionó nada");
        }*/

        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"));
                startActivity(intent);
            }
        });
        btnInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com"));
                startActivity(intent);
            }
        });
        btnGmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gmail.com"));
                startActivity(intent);
            }
        });
        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mercadolibre.com"));
                startActivity(intent);
            }
        });

        btnGoApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InformacionUser.this, OptionalView.class);
                startActivity(intent);
            }
        });
    }
}