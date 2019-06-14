package com.aplimovil.formulas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class subcategoria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subcategoria);

    }
    public void onClicc (View view){

        Intent  mintent= new Intent(subcategoria.this,category.class);
        startActivity(mintent);

    }

}
