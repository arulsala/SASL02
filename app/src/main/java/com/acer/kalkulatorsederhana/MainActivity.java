package com.acer.kalkulatorsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText tx1, tx2;
    TextView tvhas;
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx1 = findViewById(R.id.tx1);
        tx2 = findViewById(R.id.tx2);
        tvhas = findViewById(R.id.tvhas);
        bt1 = findViewById(R.id.bt1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(tx1.getText().toString());
                int num2 = Integer.parseInt(tx2.getText().toString());
                int hasilTambah = num1 + num2;
                tvhas.setText(String.valueOf(hasilTambah));
            }
        });
    }
}
