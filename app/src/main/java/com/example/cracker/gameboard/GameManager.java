package com.example.cracker.gameboard;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;

import com.google.firebase.database.DataSnapshot;

/**
 * Created by capk on 1/1/18.
 */

public class GameManager {

    public static DataSnapshot dataSnapshot;
    private boolean isSelected;
    private ImageView imageSelected;
    private Activity context;
    public String Turn;

    GameManager(Activity context){
        this.context = context;
    }

    public boolean isLegal(ImageView v){
        Check check = new Check(imageSelected, v, context);
        return check.move();
    }

    public void setRandomTurn(){

    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public ImageView getImageSelected() {
        return imageSelected;
    }

    public void setImageSelected(ImageView imageSelected) {
        this.imageSelected = imageSelected;
    }

    public String getTurn() {
        return Turn;
    }

    public void setTurn(String turn) {
        Turn = turn;
    }

}
