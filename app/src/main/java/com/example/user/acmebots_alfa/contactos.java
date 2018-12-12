package com.example.user.acmebots_alfa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class contactos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactos);
    }
    //metodo para regresar
    public void Regresar(View view){
        Intent regresar=new Intent(this,MainAcme.class);
        startActivity(regresar);
    }
}
