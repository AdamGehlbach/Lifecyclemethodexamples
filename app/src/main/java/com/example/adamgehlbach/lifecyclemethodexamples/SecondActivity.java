package com.example.adamgehlbach.lifecyclemethodexamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button finishButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Links variable reference to UI element for this activity by ID
        finishButton = findViewById(R.id.finish_button);

        // Method to set listener
        setisteners();
    }

    //Starts onClickListener for button
    private void setisteners() {

        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                finish();

            }
        });
    }
}
