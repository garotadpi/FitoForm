package br.com.garotadpi.fitoform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CadeiraFActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadeira_f);
    }
    public void enter (View v) {
        Intent cadeirag = new Intent();
        cadeirag.setClass(this, CadeiraGActivity.class);
        startActivity(cadeirag);
    }
}
