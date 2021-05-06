package com.example.latihan3_monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/* Tanggal pengerjaan : kamis 6 mei 2021
 * Nim                 : 10118084
 * Nama                : DIVI ADIFFIA FREZA ALANA
 * Kelas               : IF-2
 */

public class kode_keluarga extends AppCompatActivity {
    Button btnstart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kode_keluarga);

        btnstart = findViewById(R.id.start);

        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(kode_keluarga.this,form.class));
            }
        });

    }
}