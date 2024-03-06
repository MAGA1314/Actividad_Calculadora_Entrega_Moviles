package com.maga.actividad_calculadora_entrega_moviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewAnimator;

public class Pantallados extends AppCompatActivity {

    TextView tvResultado;
    Button btnpagina3;
    float num1 = 0.0f;
    float num2 = 0.0f;

    String operador = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallados);


        tvResultado = findViewById((R.id.tvResultado));
        btnpagina3 = findViewById(R.id.btnpagina3);


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
        guardarnum1(view);
    }
    public  void multiplica(View view){
        operador = "*";
        guardarnum1(view);
    }
    public  void divide(View view){
        operador = "/";
        guardarnum1(view);
    }
    public void raiz(View view){
        operador = "√";
        guardarnum1(view);
    }
    public void seno(View view){
        operador = "sin";
        guardarnum1(view);
    }
    public void coseno(View view){
        operador = "cos";
        guardarnum1(view);
    }
    public void tangente(View view){
        operador = "tan";
        guardarnum1(view);
    }
    public void arcs(View view){
        operador = "arcsin";
        guardarnum1(view);
    }
    public void arcc(View view){
        operador = "arccos";
        guardarnum1((view));
    }
    public void arct(View view){
        operador = "arctan";
        guardarnum1((view));
    }
    public void potencia2(View view){
        operador = "x²";
        guardarnum1(view);
    }
    public void pagina3(View view){

        // Crear el Intent y pasar datos extras
        Intent intent = new Intent(Pantallados.this, pantallatres.class);
        // Puedes pasar datos extras como se muestra a continuación, aquí estoy pasando el texto actual de tvResultado
        String resultadoActual = tvResultado.getText().toString();
        intent.putExtra("RESULTADO",resultadoActual);

        // Iniciar la actividad de la pantalla 3
        startActivity(intent);
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
        if (operador.equals("+")){
            resultado = num1+num2;
        }
        // Resta
        if (operador.equals("-")){
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

        // Potencia 2
        if (operador.equals("x²")){
            if (num1 != 0){
                double resultado1 = Math.pow(num1, 2);
                tvResultado.setText(String.valueOf(resultado1));
                return;
            }else {
                tvResultado.setText("Error");
                return;
            }
        }

        // Raiz
        if (operador.equals("√")) {
            if (num1 >= 0) {
                double resultado1 = Math.sqrt(num1);
                tvResultado.setText(String.valueOf(resultado1));
                return;
            } else {
                tvResultado.setText("Error");
                return;
            }
        }

        // Sin
        if (operador.equals("sin")){
            if (num1 >= 0) {
                double resultado1 = Math.sin(Math.toRadians(num1));
                tvResultado.setText(String.valueOf(resultado1));
                return;
            }else {
                tvResultado.setText("Error");
                return;
            }
        }

        // Cos
        if (operador.equals("cos")){
            if (num1 >= 0) {
                double resultado1 = Math.cos(Math.toRadians(num1));
                tvResultado.setText(String.valueOf(resultado1));
                return;
            }else {
                tvResultado.setText("Error");
                return;
            }
        }

        // Tan
        if (operador.equals("tan")){
            if ( num1 >= 0){
                double resultado1 = Math.tan(Math.toRadians(num1));
                tvResultado.setText(String.valueOf(resultado1));
                return;
            }else {
                tvResultado.setText("Error");
                return;
            }
        }

        // ArcSin
        if (operador.equals("arcsin")) {
            if (num1 >= -1 && num1 <= 1) {
                double resultado1 = Math.toDegrees(Math.asin(num1));
                tvResultado.setText(String.valueOf(resultado1));
                return;
            } else {
                tvResultado.setText("Error");
                return;
            }
        }

        // ArcCos
        if (operador.equals("arccos")) {
            if (num1 >= -1 && num1 <= 1) {
                double resultado1 = Math.toDegrees(Math.acos(num1));
                tvResultado.setText(String.valueOf(resultado1));
            } else {
                tvResultado.setText("Error");
            }
            return;
        }

        // ArcTan
        if (operador.equals("arctan")) {
            double resultado1 = Math.toDegrees(Math.atan(num1));
            tvResultado.setText(String.valueOf(resultado1));
            return;
        }

        // Mostrar el resultado en tvResultado
        tvResultado.setText(String.valueOf(resultado));
    }
}