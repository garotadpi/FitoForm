package br.com.garotadpi.fitoform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CadeiraCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadeira_c);
    }
    public void enter (View v) {
        Intent cadeirad = new Intent();
        cadeirad.setClass(this, CadeiraDActivity.class);
        startActivity(cadeirad);
    }

}