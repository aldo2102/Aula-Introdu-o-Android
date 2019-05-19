package com.example.aula1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NovaActivity extends Activity {

    Intent it;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova);

        Button button = (Button) findViewById(R.id.voltar);
        it = new Intent(this, MainActivity.class);


        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(it);
            }
        });
    }
}
