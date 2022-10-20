package com.example.kalkulator_bidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnPersegi, btnSegitiga, btnLingkaran;
    EditText angka01, angka02;
    TextView hasilLuas, hasilKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka01=findViewById(R.id.angka1);
        angka02=findViewById(R.id.angka2);
        hasilLuas=findViewById(R.id.luas);
        hasilKeliling=findViewById(R.id.keliling);

        btnPersegi=findViewById(R.id.persegi);
        btnSegitiga=findViewById(R.id.segitiga);
        btnLingkaran=findViewById(R.id.lingkaran);

        btnPersegi.setOnClickListener(this);
        btnSegitiga.setOnClickListener(this);
        btnLingkaran.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch (v.getId())
        {
            case R.id.persegi:
                persegi();
                break;
            case R.id.segitiga:
                segitiga();
                break;
            case R.id.lingkaran:
                lingkaran();
                break;
        }
    }

    private void persegi(){
        if(angka01.getText().toString().trim().isEmpty() || angka02.getText().toString().trim().isEmpty())
        {
            Toast.makeText(this, "Data Kosong", Toast.LENGTH_SHORT).show();
        }
        else
        {
            float angk1=Float.parseFloat(String.valueOf(angka01.getText()));
            float angk2=Float.parseFloat(String.valueOf(angka02.getText()));

            float luas=(angk1*angk2);
            hasilLuas.setText(" "+luas);

            float keliling=(2*(angk1+angk2));
            hasilKeliling.setText(" "+keliling);
        }
    }

    private void segitiga() {
        if (angka01.getText().toString().trim().isEmpty() || angka02.getText().toString().trim().isEmpty()) {
            Toast.makeText(this, "Data Kosong", Toast.LENGTH_SHORT).show();
        } else {
            float angk1 = Float.parseFloat(String.valueOf(angka01.getText()));
            float angk2 = Float.parseFloat(String.valueOf(angka02.getText()));
            double sisi= Math.sqrt((Math.pow(angk1/2,2)+(Math.pow(angk2,2))));

            float luas = ((angk1 * angk2)/2);
            hasilLuas.setText(" " + luas);

            double keliling = (sisi);
            hasilKeliling.setText(" " + keliling);
        }
    }
    private void lingkaran(){
        if(angka01.getText().toString().trim().isEmpty())
        {
            Toast.makeText(this, "Data Kosong", Toast.LENGTH_SHORT).show();
        }
        else
        {
            float angk1=Float.parseFloat(String.valueOf(angka01.getText()));

            double luas=(3.14*Math.pow(angk1/2,2));
            hasilLuas.setText(" "+luas);

            double keliling=(3.14*angk1);
            hasilKeliling.setText(" "+keliling);
        }
    }

}