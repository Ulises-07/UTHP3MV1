package com.example.uthp3mv1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class ResultadosActivity extends AppCompatActivity {
    TextView tvSuma, tvResta, tvMultiplicacion, tvDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_resultados);

        tvSuma = findViewById(R.id.tvSuma);
        tvResta = findViewById(R.id.tvResta);
        tvMultiplicacion = findViewById(R.id.tvMultiplicacion);
        tvDivision = findViewById(R.id.tvDivision);

        int num1 = getIntent().getIntExtra("numero1", 0);
        int num2 = getIntent().getIntExtra("numero2", 0);

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        String division = (num2 != 0) ? String.valueOf((double) num1 / num2) : "Error: división por 0";

        tvSuma.setText("Suma: " + suma);
        tvResta.setText("Resta: " + resta);
        tvMultiplicacion.setText("Multiplicación: " + multiplicacion);
        tvDivision.setText("División: " + division);

    }
}