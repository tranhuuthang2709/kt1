package com.example.appgk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MoTa extends AppCompatActivity {
    TextView txt_ten,txt_quocgia,txt_nghedanh, txt_sao;
    ImageView imgAnhmota;
    Button button_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mo_ta);
        imgAnhmota =(ImageView) findViewById(R.id.img_mota) ;
        txt_ten =(TextView) findViewById(R.id.txt_ten) ;
        txt_quocgia =(TextView) findViewById(R.id.txt_quocgia) ;
        txt_nghedanh =(TextView) findViewById(R.id.txt_nghedanh);
        txt_sao =(TextView) findViewById(R.id.txt_sao);
        button_back = (Button) findViewById(R.id.button_back);
        Intent intent  = getIntent();
        imgAnhmota.setImageResource(intent.getIntExtra("key1",0));
        txt_ten.setText(intent.getStringExtra("key2"));
        txt_quocgia.setText(intent.getStringExtra("key3"));
        txt_nghedanh.setText(intent.getStringExtra("key4"));
        txt_sao.setText(intent.getStringExtra("key5"));

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MoTa.this, Home.class));
            }
        });
    }
}