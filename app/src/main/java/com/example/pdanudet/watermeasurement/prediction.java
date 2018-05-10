package com.example.pdanudet.watermeasurement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class prediction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prediction);


        Button pdtMan = (Button)findViewById(R.id.pdtManual);

        pdtMan.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v1)
                    {
                        Intent pdtIntent1 = new Intent(v1.getContext(), MainActivity.class);
                        startActivity(pdtIntent1);
                    }
                }
        );

        Button pdtCus = (Button)findViewById(R.id.pdtCustomize);

        pdtCus.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v2)
                    {
                        Intent pdtIntent2 = new Intent(v2.getContext(), MainActivity.class);
                        startActivity(pdtIntent2);
                    }
                }
        );
    }
}
