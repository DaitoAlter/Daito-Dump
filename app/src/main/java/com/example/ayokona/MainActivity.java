package com.example.ayokona;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnedit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profilemain);

        // Find the button in the layout
        Button btnedit = findViewById(R.id.btnsave);

        // Set a click listener on the button
        btnedit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the profileedit activity
                Intent intent = new Intent(MainActivity.this, profileedit.class);
                startActivity(intent);
            }
        });
    }
}