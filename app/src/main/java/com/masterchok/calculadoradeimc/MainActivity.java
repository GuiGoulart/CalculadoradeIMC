package com.masterchok.calculadoradeimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editPeso;
    private EditText editAltura;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);
        textResultado = findViewById(R.id.textResultado);
    }

    public void calcularIMC(View view) {

        double peso = Double.parseDouble(editPeso.getText().toString());
        double altura = Double.parseDouble(editAltura.getText().toString());

        double imc = peso / altura * altura;

    if(imc <17) {
        textResultado.setText("Muito Abaixo do peso, IMC = " + imc);
    }else if(imc >= 17 && imc <= 18.49){
        textResultado.setText("Abaixo do Peso, IMC = "+imc);
    }else if(imc >= 18.5 && imc <= 24.99){
        textResultado.setText("Peso Normal, IMC = "+imc);
    }else if (imc >= 25 && imc <= 29.99){
        textResultado.setText("Acima do Peso, IMC = "+imc);
    }else if (imc >= 30 && imc <= 34.99){
        textResultado.setText("Obesidade I, IMC = "+imc);
    }else if (imc >= 35 && imc <= 39.99){
        textResultado.setText("Obesidade II, IMC = "+imc);
    }else if (imc >40){
        textResultado.setText("Obesidade III, IMC = "+imc);
    }
    }}
