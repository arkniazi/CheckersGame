package com.example.cracker.gameboard;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import static android.support.v4.media.session.MediaControllerCompatApi21.getPackageName;

/**
 * Created by cracker on 11/20/2017.
 */

public class Check {
    boolean turn ;
    ImageView imageView =null;
    Check(boolean turn, ImageView imageView){
        this.turn = turn;
        this.imageView = imageView;
    }
    public void check(){
        if(turn == true){
            if (imageView.getTag().equals("pawn"))
            {
                String s = String.valueOf(imageView.getId());
                String l[] = s.split("\\.");
                String str  = (l[l.length-1]);
                int id = Integer.parseInt(str.substring(9));
                Drawable drawble = imageView.getResources().getIdentifier("imageView"+(id+7),"drawable",getPackageName());

            }else if(imageView.getTag().equals("queen")){


            }
        }
        else {

        }


    }
}
