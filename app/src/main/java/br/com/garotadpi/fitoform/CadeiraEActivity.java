package br.com.garotadpi.fitoform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CadeiraEActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadeira_e);
    }
    public void enter (View v) {
        Intent cadeiraf = new Intent();
        cadeiraf.setClass(this, CadeiraFActivity.class);
        startActivity(cadeiraf);
    }

}
