package com.aplimovil.formulas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        //btn_alge=(Button) findViewById(R.id.bnt_algebra);
        //btn_calc=(Button) findViewById(R.id.bnt_calculo);
        // btn_alge.setOnClickListener(new View.OnClickListener() {
        // @Override
        //  public void onClick(View v) {
        //        Toast.makeText(getApplicationContext(),"estas en la categoria algebra",Toast.LENGTH_LONG).show();
        //      }
        //    });;
    }
    public void onClic (View view){
        Intent mintent=null;
        switch (view.getId() ){
            case R.id.btn_ini:
                mintent=new Intent(category.this,MainActivity.class);

                break;
            case R.id.bnt_alge:
                mintent=new Intent(category.this,subcategoria.class);
                break;
        }
        startActivity(mintent);
    }
}