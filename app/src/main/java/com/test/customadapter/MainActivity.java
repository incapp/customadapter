package com.test.customadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        final List<User> list = new ArrayList<>();

        list.add(new User("A", 1));
        list.add(new User("B", 2));
        list.add(new User("C", 3));
        list.add(new User("D", 4));
        list.add(new User("E", 5));

        listView.setAdapter(new UserListAdapter(MainActivity.this, list));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,
                        list.get(position).getName() + " clicked.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
