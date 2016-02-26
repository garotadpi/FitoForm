package br.com.garotadpi.fitoform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void enter (View v) {
        Intent prescricao = new Intent();
        //Toast.makeText(getApplicationContext();
        prescricao.setClass (this, SecondActivity.class);
        startActivity(prescricao);
    }
}