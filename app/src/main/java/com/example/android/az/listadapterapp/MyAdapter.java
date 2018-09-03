package com.example.android.az.listadapterapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

//TODO 7 create my adapter

public class MyAdapter extends ArrayAdapter<MyData> {

    //TODO 8 Create constructor

    public MyAdapter(@NonNull Context context, @NonNull List<MyData> objects) {
        super(context, 0, objects);
    }

    //TODO 9 override getView method

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //9--1 define listviewitem
        View listViewItem = convertView;

        //9--2 check it null and get the current
        if(listViewItem == null){
            listViewItem = LayoutInflater.from(getContext()).
                    inflate(R.layout.my_list_item,parent,false);
        }

        //9--3 make object from main class by position
        MyData currentMyData = getItem(position);

        //9--4 define item view and find it by id then set text
        TextView codeView = listViewItem.findViewById(R.id.code);
        codeView.setText(currentMyData.getmCode());

        TextView nameView = listViewItem.findViewById(R.id.name);
        nameView.setText(currentMyData.getmName());

        TextView bdView = listViewItem.findViewById(R.id.bd);
        bdView.setText(currentMyData.getmBirthdate());

        //9--5 return the list
        return listViewItem;
    }
}
