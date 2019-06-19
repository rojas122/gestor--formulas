package com.aplimovil.formulas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Sub_category_Fisica extends AppCompatActivity implements ListView.OnItemClickListener {
ListView list_ecua_fisica;
    String[] valor_fisica =new String[]{"Electromagnetismo","Electrostatica","Campo Electrico", "Magnetismo","Capasitancia"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_category__fisica);
        list_ecua_fisica = (ListView) findViewById(R.id.list_tipo_ecua_fisica);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,valor_fisica);
        list_ecua_fisica.setOnItemClickListener(this);
        list_ecua_fisica.setAdapter(adapter);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String item1 ="Electromagnetismo";
        String item2 = "Electrostatica";
        String item3 = "Campo Electrico";
        String item4 = "Magnetismo";
        String item5 = "Capasitancia";

        String items = (String) adapterView.getItemAtPosition(i);
        if (items == item1) {
            Intent item = new Intent(Sub_category_Fisica.this, MainActivity.class);
            item.putExtra("item1", items);
            startActivity(item);
        }
        if (items == item2) {
            Intent item = new Intent(Sub_category_Fisica.this, category.class);
            item.putExtra("item2", items);
            startActivity(item);
        }
        if (items == item3) {
            Intent item = new Intent(Sub_category_Fisica.this, Sub_category_Fisica.class);
            item.putExtra("item3", items);
            startActivity(item);
        }
        if (items == item4) {
            Intent item = new Intent(Sub_category_Fisica.this, Sub_category_calculo.class);
            item.putExtra("item4", items);
            startActivity(item);
        }
        if (items == item5) {
            Intent item = new Intent(Sub_category_Fisica.this, Sub_category_Aritmetica.class);
            item.putExtra("item5", items);
            startActivity(item);
        }
    }

    public void clic_fisica (View view){
        Intent mintent_fisica=null;
        switch (view.getId() ){
            case R.id.btn_volver_fisica:
                mintent_fisica=new Intent(Sub_category_Fisica.this,category.class);

                break;
            case R.id.btn_alge:
                //mintent=new Intent(category.this, subcategoria_algebra_lineal.class);
                break;
            case R.id.btn_calculo:
                // mintent=new Intent(category.this,Sub_category_calculo.class);
                break;
        }
        startActivity(mintent_fisica);

    }

    }
