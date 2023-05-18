package com.appmob.veciapps;

import static android.icu.text.ListFormatter.Type.AND;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et_angka1, et_angka2;
    private Button btn_clear;
    private ImageButton btntambah, btnkurang, btnkali, btnbagi;
    private TextView tv_buktihasil;

    float number1, number2;
    float hasil = 0.0F;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_angka1 = findViewById(R.id.et_angka1);
        et_angka2 = findViewById(R.id.et_angka2);
        btn_clear = findViewById(R.id.btn_clear);
        btntambah = findViewById(R.id.btntambah);
        btnkurang = findViewById(R.id.btnkurang);
        btnkali = findViewById(R.id.btnkali);
        btnbagi = findViewById(R.id.btnbagi);
        tv_buktihasil = findViewById(R.id.tv_buktihasil);

        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (et_angka1.getText().toString().trim().equals("")) {
                    et_angka1.setError("Angka Pertama Harap Diisi");
                } else if (et_angka2.getText().toString().trim().equals("")) {
                    et_angka2.setError("Angka Kedua Harap Diisi");
                } else {

                    number1 = Float.parseFloat(et_angka1.getText().toString());
                    number2 = Float.parseFloat(et_angka2.getText().toString());
                    hasil = number1 + number2;

                    tv_buktihasil.setText(String.valueOf(hasil));

                }

            }
        });

        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (et_angka1.getText().toString().trim().equals("")) {
                    et_angka1.setError("Angka Pertama Harap Diisi");
                } else if (et_angka2.getText().toString().trim().equals("")) {
                    et_angka2.setError("Angka Kedua Harap Diisi");
                } else {

                    number1 = Float.parseFloat(et_angka1.getText().toString());
                    number2 = Float.parseFloat(et_angka2.getText().toString());
                    hasil = number1 - number2;

                    tv_buktihasil.setText(String.valueOf(hasil));

                }

            }
        });

        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (et_angka1.getText().toString().trim().equals("")) {
                    et_angka1.setError("Angka Pertama Harap Diisi");
                } else if (et_angka2.getText().toString().trim().equals("")) {
                    et_angka2.setError("Angka Kedua Harap Diisi");
                } else {

                    number1 = Float.parseFloat(et_angka1.getText().toString());
                    number2 = Float.parseFloat(et_angka2.getText().toString());
                    hasil = number1 * number2;

                    tv_buktihasil.setText(String.valueOf(hasil));

                }

            }
        });

        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (et_angka1.getText().toString().trim().equals("")) {
                    et_angka1.setError("Angka Pertama Harap Diisi");
                } else if (et_angka2.getText().toString().trim().equals("")) {
                    et_angka2.setError("Angka Kedua Harap Diisi");
                } else {

                    number1 = Float.parseFloat(et_angka1.getText().toString());
                    number2 = Float.parseFloat(et_angka2.getText().toString());
                    hasil = number1 / number2;

                    tv_buktihasil.setText(String.valueOf(hasil));

                }

            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                et_angka1.setText("");
                et_angka2.setText("");
                tv_buktihasil.setText(String.valueOf(0.0F));

            }
        });

    }
}