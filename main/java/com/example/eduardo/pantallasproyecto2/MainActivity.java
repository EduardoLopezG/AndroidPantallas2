package com.example.eduardo.pantallasproyecto2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnRooms;
    private Button btnReservation;
    private Button btnMeetUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //############### Reservation ###############################
        btnReservation = (Button) findViewById(R.id.btn_Reservation);
        btnReservation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ReservationOptionsActivity.class);
                startActivity(intent);
            }
        });
        //################ Rooms #######################
        btnRooms = (Button) findViewById(R.id.btn_Romms);
        btnRooms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentRooms = new Intent(MainActivity.this, RoomsActivity.class);
                startActivity(intentRooms);
            }
        });
        //####################### MEET US ##################
        btnMeetUs = (Button) findViewById(R.id.btn_MeetUs);
        btnMeetUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMeetUs = new Intent(MainActivity.this, MeetUsActivity.class);
                startActivity(intentMeetUs);
            }
        });
    }//Fin de onCreate
}
