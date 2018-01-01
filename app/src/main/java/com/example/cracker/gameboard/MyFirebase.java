package com.example.cracker.gameboard;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by cracker on 12/26/2017.
 */

public class MyFirebase {
    private DatabaseReference ref;
    private DataSnapshot dataSnapshot;
    Iterator<DataSnapshot> iterator;

    MyFirebase(){
        ref = FirebaseDatabase.getInstance().getReference("Match");
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot data) {
                dataSnapshot = data;
                iterator = data.getChildren().iterator();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    public DataSnapshot getLastChild(){
        DataSnapshot d = null;
        while (iterator.hasNext()){
            d = iterator.next();
        }
        return d;
    }

    public DataSnapshot getDataSnapshot() {
        return dataSnapshot;
    }

    public boolean pushFirebase(Map<String,String> data){
        ref.push().setValue(data);
        return true;
    }

    public void setDataSnapshot(DataSnapshot dataSnapshot) {
        this.dataSnapshot = dataSnapshot;
    }
}
