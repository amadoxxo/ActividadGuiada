package com.example.practicaguiada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class SegundaPantalla extends AppCompatActivity {

    private EditText nombreM;
    private RadioButton perro, gato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pantalla);

        nombreM = (EditText) findViewById(R.id.etNombreM);
        perro = (RadioButton) findViewById(R.id.rbPerro);
        gato = (RadioButton) findViewById(R.id.rbGato);
    }

    public void pago(View view) {
        String nombre = nombreM.getText().toString();
        String tipo = "";

        if (perro.isChecked() == true) {
            tipo = "Perro";
        } else {
            tipo = "Gato";
        }

        Mascota mascota = new Mascota(nombre, tipo);

        double pagoTotal = mascota.funcionPrecio();

        Intent visualizarPago = new Intent(this, TerceraPantalla.class);
        visualizarPago.putExtra("pagoTotal", pagoTotal);
        startActivity(visualizarPago);
    }
}