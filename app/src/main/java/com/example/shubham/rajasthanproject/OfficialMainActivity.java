package com.example.shubham.rajasthanproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class OfficialMainActivity extends AppCompatActivity {


    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_official_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        fab=findViewById(R.id.fab);

        setSupportActionBar(toolbar);
        ListView listView = findViewById(R.id.list_of_districts);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(OfficialMainActivity.this,SurveyForm.class);
                startActivity(intent);
            }
        });

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        ArrayList<String> string_district = bundle.getStringArrayList("districts");
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,string_district);
        listView.setAdapter(adapter);

    }

}
