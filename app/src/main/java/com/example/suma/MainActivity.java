package com.example.suma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.OperationCanceledException;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int acert;
    int fallo;
    TextView preguntas;
    TextView aciertos;
    TextView fallos;
    TextView simbolo;
    TextView num1;
    TextView num2;
    EditText res;
    Button jugar;
    Button comprob;
    Spinner selecion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        selecion = findViewById(R.id.spinner);
        jugar = findViewById(R.id.button);
        comprob = findViewById(R.id.button2);
        preguntas=findViewById(R.id.textView4);
        aciertos= findViewById(R.id.textView5);
        fallos = findViewById(R.id.textView6);
        simbolo = findViewById(R.id.textView3);
        num1 = findViewById(R.id.txtn1);
        num2 = findViewById(R.id.txtn2);
        res = findViewById(R.id.editTextNumber);
        hacerOperacion(1);
    }

    public void hacerOperacion(int opcion){
        acert=0;
        fallo=0;
        Operacion o;
        String n1;
        String n2;
        simbolo.setText(Operacion.getSimbolo(opcion));
        aciertos.setText("Aciertos: "+acert);
        fallos.setText("Fallos: "+fallo);
        for(int i=1;i<=5;i++) {
            preguntas.setText("Pregunta nº: "+i);
            if (opcion == 1)
                o = new Operacion(Operacion.getNum2(), Operacion.getNum2());
            else {
                o = new Operacion(Operacion.getNum1(), Operacion.getNum1());
            }
            n1=o.getN1()+"";
            n2=o.getN2()+"";
            num1.setText(n1);
            num2.setText(n2);
            int Resultado = o.getResult(opcion);

            aciertos.setText("Aciertos: "+acert);
            fallos.setText("Fallos: "+fallo);
        }
    }
    public void limpiarCampos(){

    }
    public void actualizarCampos(){

    }
}