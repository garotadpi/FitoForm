package br.com.garotadpi.fitoform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CadeiraDActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadeira_d);

    }
    public void enter (View v) {
        Intent cadeirae = new Intent();
        cadeirae.setClass(this, CadeiraEActivity.class);
        startActivity(cadeirae);
    }

}
