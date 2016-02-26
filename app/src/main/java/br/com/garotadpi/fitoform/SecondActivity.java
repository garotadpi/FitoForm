package br.com.garotadpi.fitoform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void enter (View v) {
        Intent cadastro = new Intent();
        cadastro.setClass(this, CadastroActivity.class);
        startActivity(cadastro);
    }
    public void aguarde (View v){
        Toast.makeText(getApplicationContext(),
                "Aguarde funcionalidade",
                Toast.LENGTH_SHORT).show();
    }
}
