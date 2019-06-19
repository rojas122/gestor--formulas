package com.aplimovil.formulas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class subcategoria_algebra_lineal extends AppCompatActivity implements ListView.OnItemClickListener  {
 ListView lista_ecua;
    String[] valor =new String[]{"sistemas de escuaciones lineales","Suma de Matrices","suma de complejos", "Producto de Matrices","Sistema de Ecuaciones por tres "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activit_subcategoria_algebra);
        lista_ecua = (ListView) findViewById(R.id.list_tipo_ecuaciones);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,valor);
        lista_ecua.setOnItemClickListener(this);
        lista_ecua.setAdapter(adapter);

    }



    @Override
 public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String sistemas  = "sistemas de escuaciones lineales";
        String item2 = "Suma de Matrices";
        String item3 = "Suma de Complejos";
        String item4 = "Producto de Matrices";
        String item5 = "Sistema de Ecuaciones por tres";

        String items = (String) adapterView.getItemAtPosition(i);
        if (items == sistemas) {
            Intent item = new Intent(subcategoria_algebra_lineal.this, view_algebra.class);
            item.putExtra("item1", items);
            startActivity(item);
        }
        if (items == item2) {
            Intent item = new Intent(subcategoria_algebra_lineal.this, category.class);
            item.putExtra("item2", items);
            startActivity(item);
        }
        if (items == item3) {
            Intent item = new Intent(subcategoria_algebra_lineal.this, Sub_category_Fisica.class);
            item.putExtra("item3", items);
            startActivity(item);
        }
        if (items == item4) {
            Intent item = new Intent(subcategoria_algebra_lineal.this, Sub_category_calculo.class);
            item.putExtra("item4", items);
            startActivity(item);
        }
        if (items == item5) {
            Intent item = new Intent(subcategoria_algebra_lineal.this, Sub_category_Aritmetica.class);
            item.putExtra("item5", items);
            startActivity(item);
        }
        //final ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.arraySub_algebra,
        //      android.R.layout.simple_list_item_1);
        //lista_ecua.setOnItemClickListener(this);
        //lista_ecua.setAdapter(adapter);
        //lista_ecua.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        //   @Override
        // public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //   Toast.makeText(parent.getContext(),"seleccionaste: "
        //         +parent.getItemAtPosition(position).toString(),Toast.LENGTH_SHORT).show();
        //Intent intt = new Intent(subcategoria_algebra_lineal.this,sistem_ecua_lineales.class);
        //String valor= (String) parent.getItemAtPosition(position);
        //Intent nuevoform =new Intent(subcategoria_algebra_lineal.this,sistem_ecua_lineales.class);
        //nuevoform.putExtra("String",);

        // }
        //});

    }

    public void onClicc (View view){

        Intent mmintent=null;
        switch (view.getId() ){
            case R.id.btn_volver:
                mmintent= new Intent(subcategoria_algebra_lineal.this,MainActivity.class);

              //  break;
            //case R.id.sig:
               // mmintent=new Intent(subcategoria_algebra_lineal.this,prueba.class);
               // break;
        }
        startActivity(mmintent);


    }
}
