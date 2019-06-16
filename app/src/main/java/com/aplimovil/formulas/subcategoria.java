package com.aplimovil.formulas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class subcategoria extends AppCompatActivity {
 ListView lista_ecua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subcategoria);
        lista_ecua= (ListView) findViewById(R.id.list_tipo_ecuaciones);
       // ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.arraySub_Category,android.R.layout.simple_list_item_1);

        ArrayList<String> listaEcua=new ArrayList<>();
        listaEcua.add(" Sistema de Ecuaciones Lineales");
        listaEcua.add( "Suma de Matrices");
        listaEcua.add("Suma de Matrices" );
        listaEcua.add("Sistema de Ecuaciones Lineales ");
        listaEcua.add( "Suma de Comlejos ");
        listaEcua.add("Sistema de Ecuaciones Lineales" );
        listaEcua.add("Producto de Matrices");
        ArrayAdapter adaptdor =new ArrayAdapter(this,android.R.layout.simple_list_item_1,listaEcua);
        lista_ecua.setAdapter(adaptdor);
        lista_ecua.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(),"seleccionaste: "
                        +parent.getItemAtPosition(position).toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void onClicc (View view){

        Intent  mintent= new Intent(subcategoria.this,category.class);
        startActivity(mintent);

    }

}
