package com.example.cracker.gameboard;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;

/**
 * Created by cracker on 11/20/2017.
 */

public class Check {
    Activity context;
    private ImageView imageView = null;
    static boolean selected = false;
    static ImageView imageViewSelected ;


    Check(ImageView imageView, Activity context) {
        this.imageView = imageView;
        this.context = context;
    }

    public boolean checkAndMove() {

        String s = (String) imageViewSelected.getTag();

        if(imageView.getTag().equals("pawn_p1")){

            check(7,9);

        }else if (imageView.getTag().equals("queen_P1")){

        }else if (imageView.getTag().equals("pawn_P2")){

        }else if (imageView.getTag().equals("queen_P2")){

        }
        return true;
    }

    public void transition(int first,int second){


    }

    public void setMovable(ImageView image){
//        Resources res = context.getResources();
//        final ImageView image = (ImageView) findViewById(R.id.imageId);
//        final int newColor = res.getColor(R.color.new_color);
//        image.setColorFilter(newColor, Mode.SRC_ATOP);

    }


    public void check(int left, int right ){
        String  s = String.valueOf(imageViewSelected.getId());

        left = context.getResources().getIdentifier("imageView"+(left),"drawable",context.getPackageName());

    }
    public void checkBack(){

    }
    public void checkHorizontal(){

    }

}
