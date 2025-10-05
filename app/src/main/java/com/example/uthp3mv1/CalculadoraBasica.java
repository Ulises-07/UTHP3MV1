package com.example.uthp3mv1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculadoraBasica extends AppCompatActivity {
    EditText etNumero1, etNumero2;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculadora_basica);

        etNumero1 = findViewById(R.id.etNumero1);
        etNumero2 = findViewById(R.id.etNumero2);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(etNumero1.getText().toString());
                int num2 = Integer.parseInt(etNumero2.getText().toString());

                Intent intent = new Intent(CalculadoraBasica.this, ResultadosActivity.class);
                intent.putExtra("numero1", num1);
                intent.putExtra("numero2", num2);
                startActivity(intent);
            }
        });
    }
}