package com.example.almacenamiento3;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainAgenda extends AppCompatActivity {

    private EditText et_nombre, et_Email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_agenda);

        et_nombre  =(EditText) findViewById(R.id.txt_nombre);
        et_Email = (EditText) findViewById(R.id.et_Email);
    }

    public void Guardar(View view) {
        String nombre = et_nombre.getText().toString();
        String datos = et_Email.getText().toString();

        SharedPreferences preferences = getSharedPreferences("agenda", Context.MODE_PRIVATE);
        SharedPreferences.Editor obj_editor = preferences.edit();
        obj_editor.putString(nombre, datos);
        obj_editor.commit();

        Toast.makeText(this, "El contacto ha sido guardado", Toast.LENGTH_SHORT).show();
    }

    public void Buscar(View view) {
        String nombre = et_nombre.getText().toString();

        SharedPreferences preferences = getSharedPreferences("agenda",Context.MODE_PRIVATE);
        String datos = preferences.getString(nombre, "");

        if (datos.length() ==0){
            Toast.makeText(this, "No se encontro registro", Toast.LENGTH_SHORT).show();
        }else {
            et_Email.setText(datos);
        }
    }
}