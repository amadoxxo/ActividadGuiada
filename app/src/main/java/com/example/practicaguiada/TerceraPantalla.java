package com.example.practicaguiada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TerceraPantalla extends AppCompatActivity {

    private TextView resultadoPago;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera_pantalla);

        imprimirPago();
    }

    private void imprimirPago() {
        Bundle recogeDato = getIntent().getExtras();
        double resultadoFinal = recogeDato.getDouble("pagoTotal");
        resultadoPago = (TextView) findViewById(R.id.tvResultado);
        resultadoPago.setText("El precio a pagar es de: "+resultadoFinal);
    }
}