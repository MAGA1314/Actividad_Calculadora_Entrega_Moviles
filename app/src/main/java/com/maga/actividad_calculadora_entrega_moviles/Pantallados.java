package com.maga.actividad_calculadora_entrega_moviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewAnimator;

public class Pantallados extends AppCompatActivity {

    TextView tvResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallados);

        tvResultado = findViewById((R.id.tvResultado));
    }
    public void  EscribirCero(View view){
        if(tvResultado.getText().toString().equals("0")){
            tvResultado.setText("0");
        }else{
            tvResultado.setText(tvResultado.getText() + "0");
        }
    }
    public void  EscribirUno(View view){
        if(tvResultado.getText().toString().equals("0")){
            tvResultado.setText("1");
        }else{
            tvResultado.setText(tvResultado.getText() + "1");
        }
    }
    public void  EscribirDos(View view){
        if(tvResultado.getText().toString().equals("0")){
            tvResultado.setText("2");
        }else{
            tvResultado.setText(tvResultado.getText() + "2");
        }
    }
    public void  EscribirTres(View view){
        if(tvResultado.getText().toString().equals("0")){
            tvResultado.setText("3");
        }else{
            tvResultado.setText(tvResultado.getText() + "3");
        }
    }
    public void  EscribirCuatro(View view){
        if(tvResultado.getText().toString().equals("0")){
            tvResultado.setText("4");
        }else{
            tvResultado.setText(tvResultado.getText() + "4");
        }
    }
    public void  EscribirCinco(View view){
        if(tvResultado.getText().toString().equals("0")){
            tvResultado.setText("5");
        }else{
            tvResultado.setText(tvResultado.getText() + "5");
        }
    }
    public void  EscribirSeis(View view){
        if(tvResultado.getText().toString().equals("0")){
            tvResultado.setText("6");
        }else{
            tvResultado.setText(tvResultado.getText() + "6");
        }
    }
    public void  EscribirSiete(View view){
        if(tvResultado.getText().toString().equals("0")){
            tvResultado.setText("7");
        }else{
            tvResultado.setText(tvResultado.getText() + "7");
        }
    }
    public void  EscribirOcho(View view){
        if(tvResultado.getText().toString().equals("0")){
            tvResultado.setText("8");
        }else{
            tvResultado.setText(tvResultado.getText() + "8");
        }
    }
    public void  EscribirNueve(View view){
        if(tvResultado.getText().toString().equals("0")){
            tvResultado.setText("9");
        }else{
            tvResultado.setText(tvResultado.getText() + "9");
        }
    }
}