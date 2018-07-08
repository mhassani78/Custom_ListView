package com.example.maryam.customlistview;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView mList;
    ArrayList<Item> arrayItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mList = findViewById(R.id.list_view);

        arrayItem = new ArrayList<>();

        CustomAdapter mAdapter = new CustomAdapter(this, arrayItem);

        arrayItem.add(new Item("f1", "هندوانه"));
        arrayItem.add(new Item("f2", "پرتقال"));
        arrayItem.add(new Item("f3", "توت فرنگی"));
        arrayItem.add(new Item("f4", "انار"));
        arrayItem.add(new Item("f5", "سیب"));
        arrayItem.add(new Item("f6", "موز"));
        arrayItem.add(new Item("f7", "انگور"));
        arrayItem.add(new Item("f8", "همه میوه ها"));


        mList.setAdapter(mAdapter);
    }
}
