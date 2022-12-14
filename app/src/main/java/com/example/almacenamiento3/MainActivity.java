package com.example.almacenamiento3;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et_nombre);
    }

    public void Enviar(View view) {
        String nombre = et1.getText().toString();
        if (nombre.length() == 0){
            Toast.makeText(this, "DEBES INGRESAR UN NOMBRE", Toast.LENGTH_SHORT).show();
        }if (nombre.length() != 0){
            Toast.makeText(this, "GRACIAS", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, MainMenu.class);
            i.putExtra("dato",et1.getText().toString());
            startActivity(i);
        }
    }
}