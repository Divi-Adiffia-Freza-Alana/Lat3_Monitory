package com.example.latihan3_monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
/* Tanggal pengerjaan : kamis 6 mei 2021
 * Nim                 : 10118084
 * Nama                : DIVI ADIFFIA FREZA ALANA
 * Kelas               : IF-2
 */

public class form extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.latihan3_monitory.MESSAGE";
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        button = findViewById(R.id.next);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(form.this,last.class);
                EditText editText = (EditText) findViewById(R.id.nAma);
                String message = editText.getText().toString();
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);

            }
        });
    }
}