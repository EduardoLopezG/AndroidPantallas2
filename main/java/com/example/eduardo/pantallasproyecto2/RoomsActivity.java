package com.example.eduardo.pantallasproyecto2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class RoomsActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private ListView lsvRooms;
    private String[] rooms = {"Habitación 1","Habitación 2","Habitación 3","Habitación 4","Habitación 5","Habitación 6",
    "Habitación 7", "Habitación 8", "Habitación 9", "Habitación 10", "Habitación 11", "Habitación 12", "Habitación 13",
    "Habitación 14"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rooms);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, rooms);
        lsvRooms = findViewById(R.id.lsv_rooms);
        lsvRooms.setAdapter(adapter);
        lsvRooms.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, "You selected "+rooms[i], Toast.LENGTH_SHORT).show();
    }
}
