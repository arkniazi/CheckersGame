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

    public void checkAndMove() {
        if (imageView.getTag().equals("pawnP1")) {
            String s = String.valueOf(imageView.getId());
            String l[] = s.split("\\.");
            String str = (l[l.length - 1]);
            int id = Integer.parseInt(str.substring(9));
            checkFront(id,7,9);
//            int left = imageView.getResources().getIdentifier("imageView" + (id + 7), "drawable", context.getPackageName());


        }else if (imageView.getTag().equals("queenP1")){

        }else if (imageView.getTag().equals("pawnP2")){

        }else if (imageView.getTag().equals("queenP2")){

        }
    }

    public void transition(int first,int second){


    }

    public void setMovable(ImageView image){
//        Resources res = context.getResources();
//        final ImageView image = (ImageView) findViewById(R.id.imageId);
//        final int newColor = res.getColor(R.color.new_color);
//        image.setColorFilter(newColor, Mode.SRC_ATOP);

    }


    public void checkFront(int id, int left, int right ){
        if ( (id+left)>0 && (id+left)<64   ){
           left = context.getResources().getIdentifier("imageView"+(id+left),"drawable",context.getPackageName());
           ImageView imleft = (ImageView) context.findViewById(left);
            if (imleft.getTag().equals("void")){
                setMovable(imleft);
            }
            if (imageView.getTag()!=imleft.getTag() && !imleft.getTag().equals("void")){


            }

        }



    }
    public void checkBack(){

    }
    public void checkHorizontal(){

    }

}
