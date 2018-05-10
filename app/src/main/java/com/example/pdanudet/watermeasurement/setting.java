package com.example.pdanudet.watermeasurement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        Button btOk = (Button)findViewById(R.id.btOkay);

        btOk.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        Intent stIntent = new Intent(v.getContext(), Result.class);
                        startActivity(stIntent);
                    }
                }
        );
    }
}
