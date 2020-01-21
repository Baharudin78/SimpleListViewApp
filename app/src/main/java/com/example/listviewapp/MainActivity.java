package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    //menambahkan data yang mau ditampilkan dala bentuk array
    String[] mobilePhone = {"samsung","iphone","xiomi","oppo","real me","sony"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);
        //membuat array adapter yang berfungsi unntuk menghubungkan antara 2 data
        final ArrayAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mobilePhone);
        listView.setAdapter(adapter);

        //membuat  click di list view
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"i will buy " + adapter.getItem(position),Toast.LENGTH_SHORT).show();
            }
        });
    }

}
