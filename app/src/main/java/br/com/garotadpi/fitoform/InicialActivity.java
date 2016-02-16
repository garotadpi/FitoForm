package br.com.garotadpi.fitoform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.graphics.Color;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

public class InicialActivity extends AppCompatActivity {
        Button b1,b2;
        EditText ed1,ed2;

        TextView tx1;
        int counter = 3;

    public void vaiPara (){
        Intent intent = new Intent(this, Dadospaciente.class);
        startActivity(intent);
    }
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_inicial);

            b1=(Button)findViewById(R.id.button4);
            ed1=(EditText)findViewById(R.id.editText);
            ed2=(EditText)findViewById(R.id.editText2);

            b2=(Button)findViewById(R.id.button2);
            tx1=(TextView)findViewById(R.id.textView);
            tx1.setVisibility(View.GONE);

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ed1.getText().toString().equals("admin") &&

                            ed2.getText().toString().equals("admin")) {
                        Toast.makeText(getApplicationContext(), "Abrindo...", Toast.LENGTH_SHORT).show();
vaiPara();

                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Senha ou Usuário incorretos", Toast.LENGTH_SHORT).show();

                    }
                }

            });



            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }


    }
