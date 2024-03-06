package com.maga.actividad_calculadora_entrega_moviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pantallatres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallatres);
        // Configurar la acción del botón "Volver"
        Button btnVolver = findViewById(R.id.btnvolver);
        btnVolver.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // Limpiar los EditText en la segunda actividad
                // Volver a la primera actividad
                Intent intent = new Intent(pantallatres.this, Pantallados.class);
                // Pasar un mensaje extra al primer Activity
                intent.putExtra("mensaje", "¡Volvió a la primera pantalla!");
                startActivity(intent);
            }
        });
    }

}