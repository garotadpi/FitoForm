package br.com.garotadpi.fitoform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CadeiraBActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadeira_b);
    }
    public void enter (View v) {
        Intent cadeirac = new Intent();
        cadeirac.setClass(this, CadeiraCActivity.class);
        startActivity(cadeirac);
    }
}
