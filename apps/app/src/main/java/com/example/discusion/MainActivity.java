package com.example.discusion;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private TextView numero;
    private Button incrementar;
    private int valor = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero=(TextView)findViewById(R.id.textNumero);
        incrementar=(Button)findViewById(R.id.btnAumentar);
        incrementar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if(valor>=9){
                    valor=0;
                    numero.setText(String.valueOf(0));
                }else{
                    numero.setText(String.valueOf(++valor));
                }
            }
        });
    }
}