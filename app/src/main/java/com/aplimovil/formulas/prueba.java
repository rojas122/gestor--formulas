package com.aplimovil.formulas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class prueba extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_algebra);
    }

    public void volver_alge (View view){
        finish();
    }
}

