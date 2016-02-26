package br.com.garotadpi.fitoform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }
    public void enter (View v) {
        Intent cadeiraa = new Intent();
        cadeiraa.setClass(this, CadeiraAActivity.class);
        startActivity(cadeiraa);
    }
}
