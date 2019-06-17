package com.aplimovil.formulas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class subcategoria_algebra_lineal extends AppCompatActivity {
 ListView lista_ecua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activit_subcategoria_algebra);
        lista_ecua= (ListView) findViewById(R.id.list_tipo_ecuaciones);
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.arraySub_Category,
                android.R.layout.simple_list_item_1);

        lista_ecua.setAdapter(adapter);
        lista_ecua.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(),"seleccionaste: "
                       +parent.getItemAtPosition(position).toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void onClicc (View view){

        Intent mmintent=null;
        switch (view.getId() ){
            case R.id.btn_volver:
                mmintent= new Intent(subcategoria_algebra_lineal.this,MainActivity.class);

                break;
            case R.id.sig:
                mmintent=new Intent(subcategoria_algebra_lineal.this,prueba.class);
        break;
        }
        startActivity(mmintent);


        }

        }
