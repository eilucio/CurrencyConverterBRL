package com.example.conversormoedadollar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editReal;
    private EditText editDollar;
    private TextView txtDollar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void converter (View v){
        EditText editReal;
        EditText editDollar;
        TextView txtDollar;

        editReal = findViewById(R.id.editDollar);
        txtDollar = findViewById(R.id.txtDollar);
        editDollar = findViewById(R.id.editReal);

        Double dollardia = Double.parseDouble(editDollar.getText().toString());
        Double moedaReal = Double.parseDouble(editReal.getText().toString());
        Double convertido = dollardia * moedaReal;
        txtDollar.setText("Valor necessario em R$: "+ convertido);





    }
}