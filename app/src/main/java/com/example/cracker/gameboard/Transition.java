package com.example.cracker.gameboard;

import android.app.Activity;
import android.graphics.Color;
import android.widget.ImageView;


/**
 * Created by cracker on 12/24/2017.
 */

public class Transition {
    Activity context;
    Transition(Activity activity){
        this.context = activity;

    }

    public void swap(ImageView imageView){

        String s = "";//(String) imageViewSelected.getTag();
        if (s.equals("pawn_P1")){
            imageView.setTag("pawn_P1");
            imageView.setBackgroundResource(R.drawable.chess2);
        }else if(s.equals("pawn_P2")){
            imageView.setTag("pawn_P2");
            imageView.setBackgroundResource(R.drawable.chess3);
        }

//        imageViewSelected.setTag("void");
//        imageViewSelected.setImageBitmap(null);
//        imageViewSelected.setBackgroundColor(Color.BLACK);

    }

    public void kill(int remove){

//        String imageSelectedName = context.getResources().getResourceEntryName(imageViewSelected.getId());
//        int imageSelectedInt = mySplit(imageSelectedName, "imageView");
//        remove = context.getResources().getIdentifier("imageView" + (remove+imageSelectedInt), "id" , context.getPackageName());
//        ImageView imageRemove = (ImageView) context.findViewById(remove);
//        imageRemove.setTag("void");
//        imageRemove.setImageBitmap(null);
//        imageRemove.setBackgroundColor(Color.BLACK);
    }

    public int mySplit(String data, String regex ){
        String ss[] = data.split(regex);
        return Integer.parseInt(ss[ss.length-1]);

    }
}
