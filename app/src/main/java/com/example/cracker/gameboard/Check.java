package com.example.cracker.gameboard;

import android.app.Activity;
import android.graphics.Color;
import android.util.Log;
import android.widget.ImageView;

/**
 * Created by cracker on 11/20/2017.
 */

public class Check {
    Activity context;
    private ImageView imageView = null;
    static boolean selected = false;
    static ImageView imageViewSelected;


    Check(ImageView imageView, Activity context) {
        this.imageView = imageView;
        this.context = context;
    }

    public boolean move() {

        if (imageViewSelected.getTag().equals("pawn_P1")) {

            if(check(7) || check(9)){
                transition("pawn_P1");
                return true;
            }else if (check(14) && isOppnent(7)){
                kill(7);
                transition("pawn_P1");
                return true;
            } else if ((check(18) && isOppnent(9))) {
                kill(9);
                transition("pawn_P1");
                return true;
            }


        } else if (imageViewSelected.getTag().equals("queen_P1")) {

        } else if (imageViewSelected.getTag().equals("pawn_P2")) {
            if(check(-7) || check(-9)){
                transition("pawn_P2");
                return true;
            }else if (check(-14) && isOppnent(-7)){
                kill(-7);
                transition("pawn_P2");
                return true;
            }else if  (check(-18) && isOppnent(-9)) {
                kill(-9);
                transition("pawn_P2");
                return true;
            }

        } else if (imageViewSelected.getTag().equals("queen_P2")) {

        }
        return false;
    }

    public void transition(String s) {

        Log.d(" Transition",s);
        if (s.equals("pawn_P1")){
            imageView.setTag("pawn_P1");
            imageView.setBackgroundResource(R.drawable.chess2);
        }else if(s.equals("pawn_P2")){
            imageView.setTag("pawn_P2");
            imageView.setBackgroundResource(R.drawable.chess3);
        }

        imageViewSelected.setTag("void");
        imageViewSelected.setImageBitmap(null);
        imageViewSelected.setBackgroundColor(Color.BLACK);
    }

    public void setMovable(ImageView image) {
//        Resources res = context.getResources();
//        final ImageView image = (ImageView) findViewById(R.id.imageId);
//        final int newColor = res.getColor(R.color.new_color);
//        image.setColorFilter(newColor, Mode.SRC_ATOP);

    }


    public boolean check  (int left) {

        String imageSelectedName = context.getResources().getResourceEntryName(imageViewSelected.getId());
        int imageSelectedInt = mySplit(imageSelectedName, "imageView");
        String imageName = context.getResources().getResourceEntryName(imageView.getId());
        int imageInt = mySplit(imageName, "imageView");
        Log.d(" Integers ",imageInt +" "+imageSelectedInt+" "+left);


        if ( (imageInt == (imageSelectedInt + left))) {
            return true;
        }
        else
            return false;

    }
    public void kill(int remove){
        String imageSelectedName = context.getResources().getResourceEntryName(imageViewSelected.getId());
        int imageSelectedInt = mySplit(imageSelectedName, "imageView");
        remove = context.getResources().getIdentifier("imageView" + (remove+imageSelectedInt), "id" , context.getPackageName());
        ImageView imageRemove = (ImageView) context.findViewById(remove);
        imageRemove.setTag("void");
        imageRemove.setImageBitmap(null);
        imageRemove.setBackgroundColor(Color.BLACK);

    }

    public boolean isOppnent(int x) {
        String imageSelectedName = context.getResources().getResourceEntryName(imageViewSelected.getId());
        int imageSelectedInt = mySplit(imageSelectedName, "imageView");

        int a = context.getResources().getIdentifier("imageView"+(x+imageSelectedInt), "id", context.getPackageName());
        ImageView oppenent= (ImageView) context.findViewById(a);
        Log.d(" Tag of oppenent ", x+imageSelectedInt+"");
        if (oppenent.getTag().equals(imageViewSelected.getTag())) {
            return false;
        } else
            return true;
    }




    public int mySplit(String toBeSplit,String expression){
        String ss[] = toBeSplit.split(expression);

        return Integer.parseInt(ss[ss.length-1]);
    }

    public void checkBack(){

    }
    public void checkHorizontal(){

    }

}
