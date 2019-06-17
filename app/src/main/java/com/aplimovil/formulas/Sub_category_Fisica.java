package com.aplimovil.formulas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Sub_category_Fisica extends AppCompatActivity {
ListView list_ecua_fisica;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_category__fisica);

        list_ecua_fisica= (ListView) findViewById(R.id.list_tipo_ecua_fisica);
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.arraySub_fisica,
                android.R.layout.simple_list_item_1);

        list_ecua_fisica.setAdapter(adapter);
        list_ecua_fisica.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(),"seleccionaste: "
                        +parent.getItemAtPosition(position).toString(),Toast.LENGTH_SHORT).show();
            }
        });
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
