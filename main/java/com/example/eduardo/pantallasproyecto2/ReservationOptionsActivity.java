package com.example.eduardo.pantallasproyecto2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ReservationOptionsActivity extends AppCompatActivity {

    private Button btnMakeReservation;
    private Button btnSearchReservation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation_options);

        //####################### MAKE RESERVATION #######################
        btnMakeReservation = (Button) findViewById(R.id.btn_makeReservation);
        btnMakeReservation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentReservation = new Intent(ReservationOptionsActivity.this, ResrvationActivity.class);
                startActivity(intentReservation);
            }
        });
        //###################### SEARCH RESERVATION #########################
        btnSearchReservation = (Button) findViewById(R.id.btn_searchReservation);
        btnSearchReservation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSearch = new Intent(ReservationOptionsActivity.this, SearchActivity.class);
                startActivity(intentSearch);
            }
        });
    }//Fin onCreate
}
