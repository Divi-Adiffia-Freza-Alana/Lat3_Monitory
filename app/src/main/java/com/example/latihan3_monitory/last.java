package com.example.latihan3_monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
/* Tanggal pengerjaan : kamis 6 mei 2021
 * Nim                 : 10118084
 * Nama                : DIVI ADIFFIA FREZA ALANA
 * Kelas               : IF-2
 */

public class last extends AppCompatActivity {
Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        Intent intent = getIntent();
        String message = intent.getStringExtra(form.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.name);
        String replace = textView.getText().toString().replace("kamu",message);
        textView.setText(String.valueOf(replace));

        button1 = findViewById(R.id.end);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           finishAndRemoveTask();
            }
        });

    }
}