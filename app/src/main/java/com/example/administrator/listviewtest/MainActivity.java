package com.example.administrator.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.administrator.listviewtest.entity.Fruit;
import com.example.administrator.listviewtest.method.FruitAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private String[] data = {"Apple", "Banana", "Orange", "Watermelon", "Pear", "Grape", "Pineapple",
    "Strawberry", "Cherry", "Mango", "Apple", "Banana", "Orange", "Watermelon", "Pear", "Grape", "Pineapple",
            "Strawberry", "Cherry", "Mango", "Apple", "Banana", "Orange", "Watermelon", "Pear", "Grape", "Pineapple",
            "Strawberry", "Cherry", "Mango", "Apple", "Banana", "Orange", "Watermelon", "Pear", "Grape", "Pineapple",
            "Strawberry", "Cherry", "Mango", };

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
//                MainActivity.this, android.R.layout.simple_list_item_1, data);
        initFruits();
        FruitAdapter adapter = new FruitAdapter(MainActivity.this, R.layout.fruit_item, fruitList);

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(MainActivity.this, fruit.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initFruits(){
        for(int i = 0; i < 2; i++){
            Fruit apple = new Fruit("Apple", R.mipmap.ic_launcher);
            fruitList.add(apple);
            Fruit apple1 = new Fruit("Apple1", R.mipmap.ic_launcher);
            fruitList.add(apple1);
            Fruit apple2 = new Fruit("Apple2", R.mipmap.ic_launcher);
            fruitList.add(apple2);
            Fruit apple3 = new Fruit("Apple3", R.mipmap.ic_launcher);
            fruitList.add(apple3);
            Fruit apple4 = new Fruit("Apple4", R.mipmap.ic_launcher);
            fruitList.add(apple4);
            Fruit apple5 = new Fruit("Apple5", R.mipmap.ic_launcher);
            fruitList.add(apple5);
            Fruit apple6 = new Fruit("Apple6", R.mipmap.ic_launcher);
            fruitList.add(apple6);
            Fruit apple7 = new Fruit("Apple7", R.mipmap.ic_launcher);
            fruitList.add(apple7);
            Fruit apple8 = new Fruit("Apple8", R.mipmap.ic_launcher);
            fruitList.add(apple8);
            Fruit apple9 = new Fruit("Apple9", R.mipmap.ic_launcher);
            fruitList.add(apple9);
            Fruit apple10 = new Fruit("Apple10", R.mipmap.ic_launcher);
            fruitList.add(apple10);
            Fruit apple11 = new Fruit("Apple11", R.mipmap.ic_launcher);
            fruitList.add(apple11);
            Fruit apple12 = new Fruit("Apple12", R.mipmap.ic_launcher);
            fruitList.add(apple12);
        }

    }

}
