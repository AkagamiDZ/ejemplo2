package com.example.ejemplo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button boton;
    EditText etnombre, etmatricula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnombre=(EditText) findViewById(R.id.etNombre);
        etmatricula=(EditText) findViewById(R.id.etMatricula);
        boton=(Button) findViewById(R.id.btaceptar);
        intent=new Intent(this, MainActivity.class);
        boton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public void onClick(View v) {
                startActivities(intent);

            }
        });
    }
}