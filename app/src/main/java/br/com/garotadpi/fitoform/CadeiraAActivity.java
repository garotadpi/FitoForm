package br.com.garotadpi.fitoform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CadeiraAActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadeira_a);
    }
    public void enter (View v) {
        Intent cadeirab = new Intent();
        cadeirab.setClass(this, CadeiraBActivity.class);
        startActivity(cadeirab);
    }
}

