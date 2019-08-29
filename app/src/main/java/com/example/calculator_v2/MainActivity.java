package com.example.calculator_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_del, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn_kurang, btn_tambah, btn_kali, btn_bagi, btn_koma, btn_sama_dengan;
    EditText R_hasil;
    float var1, var2;
    boolean b_kali, b_kurang, b_tambah, b_bagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        R_hasil = (EditText) findViewById(R.id.hasil);
        btn_del = (Button) findViewById(R.id.hapus);
        btn_del.setOnClickListener(this);
        btn1 = (Button) findViewById(R.id.angka1);
        btn1.setOnClickListener(this);
        btn2 = (Button) findViewById(R.id.angka2);
        btn2.setOnClickListener(this);
        btn3 = (Button) findViewById(R.id.angka3);
        btn3.setOnClickListener(this);
        btn4 = (Button) findViewById(R.id.angka4);
        btn4.setOnClickListener(this);
        btn5 = (Button) findViewById(R.id.angka5);
        btn5.setOnClickListener(this);
        btn6 = (Button) findViewById(R.id.angka6);
        btn6.setOnClickListener(this);
        btn7 = (Button) findViewById(R.id.angka7);
        btn7.setOnClickListener(this);
        btn8 = (Button) findViewById(R.id.angka8);
        btn8.setOnClickListener(this);
        btn9 = (Button) findViewById(R.id.angka9);
        btn9.setOnClickListener(this);
        btn_kali = (Button) findViewById(R.id.kali);
        btn_kali.setOnClickListener(this);
        btn_bagi = (Button) findViewById(R.id.bagi);
        btn_bagi.setOnClickListener(this);
        btn_kurang = (Button) findViewById(R.id.kurang);
        btn_kurang.setOnClickListener(this);
        btn_tambah = (Button) findViewById(R.id.jumlah);
        btn_tambah.setOnClickListener(this);
        btn_koma = (Button) findViewById(R.id.koma);
        btn_koma.setOnClickListener(this);
        btn_sama_dengan = (Button) findViewById(R.id.sama_dengan);
        btn_sama_dengan.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.angka1:
                R_hasil.setText(R_hasil.getText().toString().trim() + "1");
                break;
            case R.id.angka2:
                R_hasil.setText(R_hasil.getText().toString().trim() + "2");
                break;
            case R.id.angka3:
                R_hasil.setText(R_hasil.getText().toString().trim() + "3");
                break;
            case R.id.angka4:
                R_hasil.setText(R_hasil.getText().toString().trim() + "4");
                break;
            case R.id.angka5:
                R_hasil.setText(R_hasil.getText().toString().trim() + "5");
                break;
            case R.id.angka6:
                R_hasil.setText(R_hasil.getText().toString().trim() + "6");
                break;
            case R.id.angka7:
                R_hasil.setText(R_hasil.getText().toString().trim() + "7");
                break;
            case R.id.angka8:
                R_hasil.setText(R_hasil.getText().toString().trim() + "8");
                break;
            case R.id.angka9:
                R_hasil.setText(R_hasil.getText().toString().trim() + "9");
                break;
            case R.id.angka0:
                R_hasil.setText(R_hasil.getText().toString().trim() + "0");
                break;
            case R.id.hapus:
                R_hasil.setText("");
                break;
            case R.id.jumlah:
                var1 = Float.parseFloat(R_hasil.getText().toString().trim());
                b_tambah = true;
                R_hasil.setText(null);
                break;
            case R.id.kurang:
                var1 = Float.parseFloat(R_hasil.getText().toString().trim());
                b_kurang = true;
                R_hasil.setText(null);
                break;
            case R.id.bagi:
                var1 = Float.parseFloat(R_hasil.getText().toString().trim());
                b_bagi = true;
                R_hasil.setText(null);
                break;
            case R.id.kali:
                var1 = Float.parseFloat(R_hasil.getText().toString().trim());
                b_kali = true;
                R_hasil.setText(null);
                break;
            case R.id.sama_dengan:
                var2 = Float.parseFloat(R_hasil.getText().toString().trim());
                if (b_tambah == true) {
                    R_hasil.setText(var1 + var2 + "");
                    b_tambah = false;
                } else if (b_kurang == true) {
                    R_hasil.setText(var1 - var2 + "");
                    b_kurang = false;
                } else if (b_kali == true) {
                    R_hasil.setText(var1 * var2 + "");
                    b_kali = false;
                } else if (b_bagi == true) {
                    R_hasil.setText(var1 / var2 + "");
                    b_bagi = false;
                }
        }
    }
}
