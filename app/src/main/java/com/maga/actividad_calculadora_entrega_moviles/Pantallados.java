package com.maga.actividad_calculadora_entrega_moviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewAnimator;

public class Pantallados extends AppCompatActivity {

    TextView tvResultado;
    float num1 = 0.0f;
    float num2 = 0.0f;

    String operador = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallados);

        tvResultado = findViewById((R.id.tvResultado));
    }
    // ----------------------------> Numeros
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
    // -------------------------> operadores
    public  void suma(View view){
        operador = "+";
        guardarnum1(view);
    }
    public  void resta(View view){
        operador = "-";
    }
    public  void multiplica(View view){
        operador = "*";
    }
    public  void divide(View view){
        operador = "/";
    }

    public void limpiar(View view) {
        tvResultado.setText("0");
        num1 = 0.0f;
        num2 = 0.0f;
        operador = "";
    }

    public void borrar(View view) {
        String text = tvResultado.getText().toString();tvResultado.setText(text.substring(0,text.length() -1));
    }

    public void guardarnum1(View view) {
        num1 = Float.parseFloat(tvResultado.getText().toString());
        tvResultado.setText("0");
    }
    public void resultadoigual(View view) {
        Float resultado = 0.0f;
        num2 = Float.parseFloat(tvResultado.getText().toString());

        // suma
        if (operador == "+"){
            resultado = num1+num2;
        }
        // Resta
        if (operador == "-"){
            resultado = num1-num2;
        }

        // Multiplicacion
        if (operador == "*"){
            resultado = num1*num2;
        }

        // Division
        if (operador.equals("/")) {
            // Comprobar si el divisor es 0 para evitar la división por cero
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                // Manejar la división por cero, por ejemplo, mostrar un mensaje de error
                tvResultado.setText("Error");
                return;
            }
        }

        // Mostrar el resultado en tvResultado
        tvResultado.setText(String.valueOf(resultado));
    }
}