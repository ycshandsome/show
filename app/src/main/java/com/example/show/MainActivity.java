package com.example.show;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bt,bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=findViewById(R.id.bt_dsp);
        bt2=findViewById(R.id.bt2);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tvx=findViewById(R.id.tvx);
                TextView tvy=findViewById(R.id.tvy);
                TextView tvz=findViewById(R.id.tvz);

                tvx.setText("a");
                tvy.setText("ACC_Y:230");
                tvz.setText("ACC_Z:53");


            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tvx=findViewById(R.id.tvx);
                TextView tvy=findViewById(R.id.tvy);
                TextView tvz=findViewById(R.id.tvz);

                tvx.setText("b");
                tvy.setText("ACC_Y:230");
                tvz.setText("ACC_Z:53");


            }
        });
    }
}