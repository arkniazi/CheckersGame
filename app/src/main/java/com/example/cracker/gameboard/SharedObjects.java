package com.example.cracker.gameboard;

import com.google.firebase.database.DataSnapshot;

/**
 * Created by cracker on 12/26/2017.
 */

public class SharedObjects {
    public static DataSnapshot dataSnapshot;

    public static DataSnapshot getDataSnapshot() {
        return dataSnapshot;
    }

    public static void setDataSnapshot(DataSnapshot dataSnapshot) {
        SharedObjects.dataSnapshot = dataSnapshot;
    }
}
