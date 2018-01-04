package com.lupecamacho.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Integer.parseInt;
import static java.lang.String.*;

public class CounterActivity extends AppCompatActivity {
    private Button countButton;
    private int count = 0;
    private TextView currentCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        // Initialize all the things
        currentCount = (TextView) findViewById(R.id.currentCount);
        currentCount.setText(valueOf(count));

        countButton = (Button) findViewById(R.id.countButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                currentCount.setText(String.valueOf(count));
            }
        };

        countButton.setOnClickListener(listener);
    }

}
