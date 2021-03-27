package com.example.listofourgroup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class List extends AppCompatActivity {
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Intent intent = new Intent();

        list = findViewById(R.id.listView);
                String[] arr = getResources().getStringArray(R.array.students);
        ArrayAdapter<String> adapter = new ArrayAdapter<>( this,
                R.layout.support_simple_spinner_dropdown_item, arr);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(List.this, Info.class);
                intent.putExtra("position", position);
                startActivity(intent);
            }
        });
    }

}