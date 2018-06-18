package com.oevoes.boothuren;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView naam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        naam = (TextView)findViewById(R.id.tvNaam);
        Bundle b = getIntent().getExtras();

        if(b != null){
            String value = b.getString("gebruiker");
            naam.setText(value);
        }

    }
}
