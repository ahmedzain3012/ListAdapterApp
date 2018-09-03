package com.example.android.az.listadapterapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 1--   create arraylist append data in it
//        ArrayList<String> myData = new ArrayList<String>();
//        myData.add("az");
//        myData.add("as");
//
        //TODO 5 Use The Main Class fro Data

        ArrayList<MyData> myDatas = new ArrayList<>();
        myDatas.add(new MyData("1001","ahmed zain","30 December 1981"));
        myDatas.add(new MyData("1002","ahmed samir","1 September 1978"));


        //TODO 3--   find listview for append data in it
        ListView myList = (ListView) findViewById(R.id.list);

//        ArrayAdapter<String> mydataArrayAdapter = new ArrayAdapter<String>(
//                this,android.R.layout.simple_list_item_1,myData);

        MyAdapter mydataArrayAdapter = new MyAdapter(this,myDatas);

        myList.setAdapter(mydataArrayAdapter);


    }
}
