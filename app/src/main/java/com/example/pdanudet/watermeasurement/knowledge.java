package com.example.pdanudet.watermeasurement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class knowledge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knowledge);


        Button klHelp = (Button)findViewById(R.id.klHelp);

        klHelp.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View klHe)
                    {
                        Intent klIntent1 = new Intent(klHe.getContext(), MainActivity.class);
                        startActivity(klIntent1);
                    }
                }
        );

        Button klPlan = (Button)findViewById(R.id.klPlan);

        klPlan.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View klPl)
                    {
                        Intent klIntent2 = new Intent(klPl.getContext(), MainActivity.class);
                        startActivity(klIntent2);
                    }
                }
        );

        Button klWater = (Button)findViewById(R.id.klWater);

        klWater.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View klWt)
                    {
                        Intent klIntent3 = new Intent(klWt.getContext(), MainActivity.class);
                        startActivity(klIntent3);
                    }
                }
        );
    }
}
