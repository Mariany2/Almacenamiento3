package com.example.almacenamiento3;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        tv1 = (TextView) findViewById(R.id.et_nombre2);
        String dato = getIntent().getStringExtra("dato");
        tv1.setText("Bienvenido " + dato);
    }



    public void BotonAgenda(View view) {
        Intent i = new Intent(MainMenu.this, MainAgenda.class);
        startActivity(i);
    }

    }
