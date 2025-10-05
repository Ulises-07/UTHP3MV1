package com.example.uthp3mv1;

import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class activityResultActivity extends AppCompatActivity {

    EditText lblnombres, lblapellidos, lbledad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_result);

        lblnombres = (EditText) findViewById(R.id.lblnombre);
        lblapellidos = (EditText) findViewById(R.id.lblapellido);
        lbledad = (EditText) findViewById(R.id.lbledad);

        lblnombres.setText(getIntent().getStringExtra("pnombres"));
        lblapellidos.setText(getIntent().getStringExtra("papellidos"));
        lbledad.setText(getIntent().getStringExtra("pedad"));
    }
}