package com.example.senddatafromactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText  = findViewById(R.id.editTextId);

        button = findViewById(R.id.buttonid);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textt = null;
                textt = editText.getText().toString();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                intent.putExtra("text", "Something");

                startActivity(intent);

            }
        });


    }
}
