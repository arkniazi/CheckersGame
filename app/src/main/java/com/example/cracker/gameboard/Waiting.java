package com.example.cracker.gameboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

public class Waiting extends AppCompatActivity {

    private DataSnapshot dataSnapshot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiting);
        setTitle("Searching for Opponent");
        dataSnapshot = SharedObjects.dataSnapshot;
        Log.d(" Waiting for State: ",dataSnapshot.getValue().toString()+" "+ dataSnapshot);
        dataSnapshot.getRef().addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot data) {

                Log.d(" Waiting for State: ",data.child("State").getValue().toString());
                if (dataSnapshot.child("State").getValue().equals("playing")){

//                    MainActivity.opponentEmail = dataSnapshot.child("Player 2").getValue().toString();
                    MainActivity.myTag = "Player 1";
                    MainActivity.dataSnapshot = dataSnapshot;
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
//                    dataSnapshot.getRef().removeEventListener(this);
                    finish();

                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
