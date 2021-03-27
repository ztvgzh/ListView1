package com.example.listofourgroup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.editTextTextPersonName);
        e2 = findViewById(R.id.editTextTextPassword2);
        b1 = findViewById(R.id.button);
    }

    public void onClickBut(View view) {

        String login = e1.getText().toString();
        String pass = e2.getText().toString();
        if(login.equals("admin") && pass.equals("admin")){
            Intent intent = new Intent(this, List.class);
            startActivity(intent);
        }
        else{
            Toast toast = Toast.makeText(this, "Вы ввели неправильные данные", Toast.LENGTH_LONG );
            toast.show();
        }
    }
}