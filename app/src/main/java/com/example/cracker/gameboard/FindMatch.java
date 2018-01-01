package com.example.cracker.gameboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindMatch extends AppCompatActivity {
//    private DatabaseReference ref;
    private MyFirebase myFirebase;
    private String email;
    private DataSnapshot dataSnapshot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_match);
        setTitle("Home");
//        getActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ff33b5e5")));
        Button login = (Button) findViewById(R.id.button3);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),StartActivity.class);
                startActivity(intent);
                finish();

            }
        });
        email= FirebaseAuth.getInstance().getCurrentUser().getEmail();
//        ref.getKey();

        myFirebase = new MyFirebase();
        Button  findMacth = (Button) findViewById(R.id.button1);
        findMacth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataSnapshot = myFirebase.getDataSnapshot();

                if (dataSnapshot!=null){

                Iterator<DataSnapshot> iterator = dataSnapshot.getChildren().iterator();

                int count = (int) dataSnapshot.getChildrenCount();
                Log.d(" Count", String.valueOf(count));
                int i=0;
                while (i<count){
                    i++;
                    Log.d(" Email ",email);
                    dataSnapshot = iterator.next();
                    if (dataSnapshot.child("State").getValue().equals("waiting")
                            && !dataSnapshot.child("Turn").getValue().equals(email)){
                        Log.d(" Waiting ",dataSnapshot.child("State").getValue().toString());
                        break;
                    }
                }
                if (count==0 ||  ( !dataSnapshot.child("Player 2 Email").getValue().equals(email)&&
                        !dataSnapshot.child("Player 1 Email").getValue().equals(email) &&
                        !dataSnapshot.child("State").getValue().equals("waiting"))){

                    insertChild();
                    Log.d(" Inserting Data"," Here");
                    SharedObjects.dataSnapshot = myFirebase.getLastChild();
                    Intent intent = new Intent(getApplicationContext(),Waiting.class);
                    startActivity(intent);
                    finish();

                }
                 else if (!(dataSnapshot.child("Player 1 Email").getValue().equals(email) ||
                        dataSnapshot.child("Player 2 Email").getValue().equals(email)) &&
                        dataSnapshot.child("State").getValue().equals("waiting") ){

                    dataSnapshot.child("State").getRef().setValue("playing");
                    dataSnapshot.child("Turn").getRef().setValue("Player 2");
                    dataSnapshot.child("Player 2 Email").getRef().setValue(email);

                    Log.d(" Pushing data", " Playing ");
                    MainActivity.myTag = "Player 2";
                    MainActivity.dataSnapshot = myFirebase.getLastChild();
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);

                    finish();
                 }

//                   Log.d(" Key ", String.valueOf(ref.push().setValue("waiting")));

                }
            }
        });
    }

    public void insertChild(){
        Map<String, String> userData = new HashMap<>();
        Log.d(" insert email",email);
        userData.put("Player 1 Email",email);
        userData.put("Player 2 Email"," ");
        userData.put("State","waiting");
        userData.put("Turn"," ");
        userData.put("Image"," ");
        userData.put("Image Selected"," ");
        userData.put("Image Kill"," ");
        userData.put("win"," ");
        myFirebase.pushFirebase(userData);
//        ref.push().setValue(userData);
    }
}
