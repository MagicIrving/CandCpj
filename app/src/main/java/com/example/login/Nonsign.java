package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class Nonsign extends AppCompatActivity {

    private ListView listView ;
    private CustomAdapter adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_nonsignup);
        setTitle("배송 품목");


        adapter = new CustomAdapter() ;
        listView = (ListView)findViewById(R.id.listView) ;

        setData();

        listView.setAdapter(adapter);

    }

    private void setData() {
        TypedArray arrResId = getResources().obtainTypedArray(R.array.resId) ;
        String[] title = getResources().getStringArray(R.array.title) ;
        String[] contents = getResources().getStringArray(R.array.content) ;

        for (int i = 0; i < arrResId.length(); i++) {
            CustomDTO dto = new CustomDTO() ;
            dto.setResld(arrResId.getResourceId(i, 0));
            dto.setTitle(title[i]);
            dto.setContent(contents[i]);

            adapter.addItem(dto);
        }
    }

}
