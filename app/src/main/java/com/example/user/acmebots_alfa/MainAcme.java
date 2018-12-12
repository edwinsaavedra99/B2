package com.example.user.acmebots_alfa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainAcme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_acme);
    }
    //metodo de boton curso
    public void Curso(View view){
        Intent curso=new Intent(this,com.example.user.acmebots_alfa.curso.class);
        startActivity(curso);
    }
    public void Contacto(View view){
        Intent contacto=new Intent(this, contactos.class);
        startActivity(contacto);
    }
    public void Administrar(View view){
        Intent administrar=new Intent(this,Admi.class);
        startActivity(administrar);
    }

}
