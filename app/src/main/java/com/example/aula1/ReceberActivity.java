package com.example.aula1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ReceberActivity extends AppCompatActivity {
    Intent it;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receber);

        Button button = (Button) findViewById(R.id.voltar);
        it = new Intent(this, MainActivity.class);

        Intent it2 = getIntent();
        Bundle params = it2.getExtras();
        String valor = params.getString("msg");


        TextView t = (TextView) findViewById(R.id.msg);

        t.setText(valor);

        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(it);
            }
        });
    }
}
