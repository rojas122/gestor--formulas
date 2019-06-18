package com.aplimovil.formulas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class Sub_category_Aritmetica extends AppCompatActivity {
ListView lista_ecua_aritmetica;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_category__aritmetica);

        lista_ecua_aritmetica= (ListView) findViewById(R.id.list_tipo_ecua_aritmetica);
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.arraySub_aritmetica,
                android.R.layout.simple_list_item_1);

        lista_ecua_aritmetica.setAdapter(adapter);
        lista_ecua_aritmetica.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(),"seleccionaste: "
                        +parent.getItemAtPosition(position).toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
    public  void clic_aritmetica (View view){

            Intent mintent_aritmetica=null;
            switch (view.getId() ){
                case R.id.btn_atras:
                    mintent_aritmetica=new Intent(Sub_category_Aritmetica.this,category.class);

                    break;
                case R.id.btn_arimetic:
                  //  mintent_aritmetica=new Intent(Sub_category_Aritmetica.this, subcategoria_al.class);
                    break;
                case R.id.btn_calculo:
                    // mintent=new Intent(category.this,Sub_category_calculo.class);
                    break;
            }
            startActivity(mintent_aritmetica);

        }
    }
