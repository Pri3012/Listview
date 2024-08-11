package com.example.listview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> arrName=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listview);
        arrName.add("ram"); //adding data in arraylist
        arrName.add("ram2");
        arrName.add("ram3");
        arrName.add("ram4");
        arrName.add("ram5");
        arrName.add("ram6");
        arrName.add("ram7");
        arrName.add("ram8");
        arrName.add("ram9");
        arrName.add("ram10");
        arrName.add("ram11");
        arrName.add("ram12");
        arrName.add("ram13");
        arrName.add("ram14");
        arrName.add("ram115");
        arrName.add("ram16");
        arrName.add("ram171");
        arrName.add("ram18");
        arrName.add("ram19");
        arrName.add("ram20");
        arrName.add("ram21");


        //adaptor requires three things class referrence,layout,arraylist name.

        ArrayAdapter<String> adapter=new ArrayAdapter<>(getApplication(), android.R.layout.simple_list_item_1,arrName);
        listView.setAdapter(adapter); //listview p adaptor lagana .



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}