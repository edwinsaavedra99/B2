package com.example.user.acmebots_alfa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class Main2Activity extends AppCompatActivity{
    private TextView tv1;
    private ListView lv1;
    String [] nombres ={"Robotica Nivel 1", "Robotica Nivel 2", "Robotica Nivel 3", "Electrica Nivel 1", "Electrica Nivel 2", "Electrica Nivel 3"};


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1 = (TextView)findViewById(R.id.t1v);
        lv1 = (ListView)findViewById(R.id.lv1);

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.list_item, nombres);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv1.setText("Usted se matriculo en " + lv1.getItemAtPosition(i));
            }
        });
    }
}


