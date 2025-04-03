package com.example.miprimeraaplicacion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FormularioRegistro extends AppCompatActivity {
    EditText etNombre;
    EditText etApellido;
    EditText etEdad;
    EditText etColegio;
    EditText etNickname;
    Button btnGuardar;
    CheckBox cbJugarV,cbTrotar,cbPeliculas,cbLeer,cbComer,cbEscuchar;

    String sexoSeleccion, interes, orientacionSelected;

    Spinner spOrientacion;
    ListView lvIntereses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_registro);

        spOrientacion = (Spinner) findViewById(R.id.spOrientacion);
        lvIntereses = findViewById(R.id.lvIntereses);

        etNombre = findViewById(R.id.etNombre);
        etApellido = findViewById(R.id.etApellido);
        etEdad = findViewById(R.id.etEdad);
        etColegio = findViewById(R.id.etColegio);
        etNickname = findViewById(R.id.etNickname);
        btnGuardar = findViewById(R.id.btnGuardar);


        ArrayAdapter<CharSequence> adaptadorListView = ArrayAdapter.createFromResource(
                this,
                R.array.intereses,
                android.R.layout.simple_list_item_1
        );
        lvIntereses.setAdapter(adaptadorListView);


        ArrayAdapter<CharSequence> adapterSpinner = ArrayAdapter.createFromResource(this, R.array.orientacion, android.R.layout.simple_spinner_item);
        spOrientacion.setAdapter(adapterSpinner);


        lvIntereses.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                interes = parent.getItemAtPosition(position).toString();
            }
        });


        spOrientacion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                orientacionSelected = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FormularioRegistro.this, InformacionUser.class);
                ArrayList chbSeleccionados = new ArrayList<String>();

                intent.putExtra("nombre", etNombre.getText().toString());
                intent.putExtra("apellido", etApellido.getText().toString());
                intent.putExtra("edad", etEdad.getText().toString());
                intent.putExtra("colegio", etColegio.getText().toString());
                intent.putExtra("nickname", etNickname.getText().toString());



                intent.putExtra("genero", orientacionSelected);

                intent.putStringArrayListExtra("seleccionados", chbSeleccionados);
                intent.putExtra("interes", interes);


                startActivity(intent);
            }
        });
    }
}