package com.example.aula1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

    Intent it;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.helloWord);

        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                TextView tv = (TextView)findViewById(R.id.texto);
                tv.setText("Hello Word!");
            }
        });

        Button button2 = (Button) findViewById(R.id.oculta);

        button2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                TextView tv = (TextView)findViewById(R.id.texto);
                if(tv.getVisibility()==View.VISIBLE){
                    tv.setVisibility(View.INVISIBLE);
                }
                else{
                    tv.setVisibility(View.VISIBLE);
                }


            }
        });


        Button button3 = (Button) findViewById(R.id.novaAc);
        it = new Intent(this, NovaActivity.class);

        button3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {

                startActivity(it);


            }
        });



        Button button4 = (Button) findViewById(R.id.novaReceber);
        it = new Intent(this, NovaActivity.class);

        button4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent it2 = new Intent(MainActivity.this,ReceberActivity.class);
                Bundle params = new Bundle();
                EditText txt = (EditText)findViewById(R.id.editText);
                params.putString("msg", String.valueOf(txt.getText()));
                it2.putExtras(params);
                startActivity(it2);


            }
        });

        Log.d("teste", "OnCreate");

    }


    protected void onPause() {
        super.onPause();
        Log.v("teste", "onPause");
    }
    protected void onResume() {
        super.onResume();
        Log.v("teste", "onResume");
    }
    protected void onStop() {
        super.onStop();
        Log.d("teste", "onStop");
    }

    protected void onRestart() {
        super.onRestart();
        Log.d("teste", "onRestart");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d("teste", "onDestroy");
    }
}
