package com.example.bottom_dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView edt;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= findViewById(R.id.openbtn);
        edt = findViewById(R.id.txtadd);

        Intent intent = getIntent();
        String a = intent.getStringExtra("data");
        edt.setText(a);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bottomsheet bottomsheet = new Bottomsheet();
                bottomsheet.show(getSupportFragmentManager(),"TAG");

            }
        });

    }
}