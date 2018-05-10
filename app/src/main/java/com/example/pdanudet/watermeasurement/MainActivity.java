package com.example.pdanudet.watermeasurement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent myIntent = new Intent(v.getContext(), Result.class);
                        startActivity(myIntent);
                    }
                }
        );
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Button button2 = (Button)findViewById(R.id.button2);

        button2.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v2)
                    {
                        Intent myIntent2 = new Intent(v2.getContext(), prediction.class);
                        startActivity(myIntent2);
                    }
                }
        );
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Button button3 = (Button)findViewById(R.id.button3);

        button3.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v3)
                    {
                        Intent myIntent3 = new Intent(v3.getContext(), setting.class);
                        startActivity(myIntent3);
                    }
                }
        );
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Button button4 = (Button)findViewById(R.id.button4);

        button4.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v4)
                    {
                        Intent myIntent4 = new Intent(v4.getContext(), knowledge.class);
                        startActivity(myIntent4);
                    }
                }
        );
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}
