package com.anshul.expliciteintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {
   EditText etsurname;
   Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        etsurname =findViewById(R.id.etsurname);
        btn = findViewById(R.id.button4);
        String name = getIntent().getStringExtra("data");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etsurname.getText().toString().isEmpty()){
                    Toast.makeText(Activity3.this, " Please enter all fields", Toast.LENGTH_SHORT).show();
                }
                else{
                    String surname = etsurname.getText().toString().trim();
                    Intent intent = new Intent();
                    intent.putExtra("surname",surname);
                    setResult(RESULT_OK,intent);
                    Activity3.this.finish();
                }
            }
        });
    }
}