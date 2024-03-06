package com.maga.actividad_calculadora_entrega_moviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class pantallatres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallatres);

        Intent intent = getIntent();
        TextView tvResultado3 = findViewById(R.id.tvresultado3); // Asegúrate de tener un TextView con este ID en el layout
        String resultado = intent.getStringExtra("RESULTADO");

        if (resultado != null) {
            tvResultado3.setText(resultado);
        } else {
            // Manejar el caso en el que no se proporcionó ningún resultado
            Toast.makeText(this, "No se proporcionó ningún resultado", Toast.LENGTH_SHORT).show();
            finish();  // Puedes finalizar la actividad si no hay datos para mostrar
        }


        // Configurar la acción del botón "Volver"
        Button btnVolver = findViewById(R.id.btnvolver);
        btnVolver.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // Volver a la primera actividad
                Intent intent = new Intent(pantallatres.this, Pantallados.class);
                // Pasar un mensaje extra al primer Activity
                startActivity(intent);
            }
        });
    }

}