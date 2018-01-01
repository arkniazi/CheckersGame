package com.example.cracker.gameboard;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by cracker on 11/20/2017.
 */

public class Check {
    Activity context;
    private ImageView imageView = null;
    private ImageView imageSelected = null;
//    static ImageView imageViewSelected;
    static int killImage = 0;


    Check(ImageView imageSelected,ImageView imageView, Activity context) {
        this.imageSelected = imageSelected;
        this.imageView = imageView;
        this.context = context;
    }

    public boolean move() {

        if (imageSelected.equals("pawn_P1")) {

            if(check(7) || check(9)){
                transition("pawn_P1");
                return true;
            }else if (check(14) && isOppnent(7)){
                kill(7);
                transition("pawn_P1");
                if(win("pawn_P2")){
                    Toast.makeText(context," Player 1 win",Toast.LENGTH_LONG);
                    restart();
                }
                return true;
            } else if ((check(18) && isOppnent(9))) {
                kill(9);
                transition("pawn_P1");
                if(win("pawn_P2")){
                    Toast.makeText(context," Player 1 win",Toast.LENGTH_LONG);
                    restart();
                }
                return true;
            }


        } else if (imageSelected.getTag().equals("queen_P1")) {

        } else if (imageSelected.getTag().equals("pawn_P2")) {
            if(check(-7) || check(-9)){
                transition("pawn_P2");
                return true;
            }else if (check(-14) && isOppnent(-7)){
                kill(-7);
                transition("pawn_P2");
                if(win("pawn_P1")){
                    Toast.makeText(context," Palyer 2 win",Toast.LENGTH_LONG);
                    restart();
                }
                return true;
            }else if  (check(-18) && isOppnent(-9)) {
                kill(-9);
                transition("pawn_P2");
                if(win("pawn_P1")){
                    Toast.makeText(context," Palyer 2 win",Toast.LENGTH_LONG);
                    restart();
                }
                return true;
            }

        } else if (imageSelected.getTag().equals("queen_P2")) {

        }
        return false;
    }
    public void upgradeToQueen(){



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

        imageSelected.setTag("void");
        imageSelected.setImageBitmap(null);
        imageSelected.setBackgroundColor(Color.BLACK);
    }

    public void setMovable(ImageView image) {
//        Resources res = context.getResources();
//        final ImageView image = (ImageView) findViewById(R.id.imageId);
//        final int newColor = res.getColor(R.color.new_color);
//        image.setColorFilter(newColor, Mode.SRC_ATOP);

    }


    public boolean check  (int left) {

        String imageSelectedName = context.getResources().getResourceEntryName(imageSelected.getId());
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
        String imageSelectedName = context.getResources().getResourceEntryName(imageSelected.getId());
        int imageSelectedInt = mySplit(imageSelectedName, "imageView");
        remove = context.getResources().getIdentifier("imageView" + (remove+imageSelectedInt), "id" , context.getPackageName());
        ImageView imageRemove = (ImageView) context.findViewById(remove);
        imageRemove.setTag("void");
        imageRemove.setImageBitmap(null);
        imageRemove.setBackgroundColor(Color.BLACK);
        killImage = remove;

    }

    public boolean isOppnent(int x) {
        String imageSelectedName = context.getResources().getResourceEntryName(imageSelected.getId());
        int imageSelectedInt = mySplit(imageSelectedName, "imageView");

        int a = context.getResources().getIdentifier("imageView"+(x+imageSelectedInt), "id", context.getPackageName());
        ImageView opponent= (ImageView) context.findViewById(a);
        Log.d(" Tag of opponent ", x+imageSelectedInt+"");
        if (opponent.getTag().equals(imageSelected.getTag())) {
            return false;
        } else
            return true;
    }




    public int mySplit(String toBeSplit,String expression){
        String ss[] = toBeSplit.split(expression);
        return Integer.parseInt(ss[ss.length-1]);
    }

    public boolean win(String s){ //win(String s,String ss) for queen and pawn ... need to be modified
        ArrayList<ImageView> arrayList = MainActivity.arrayList;
        for (int i =0;i<arrayList.size();i++){
            ImageView imageTest = arrayList.get(i);
            if(imageTest.getTag().equals(s)){
                return false;
            }
        }

        return true;
    }

    public void checkBack(){

    }
    public void checkHorizontal(){

    }

    public void restart(){
        Intent i = context.getPackageManager()
                .getLaunchIntentForPackage( context.getPackageName() );
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        context.startActivity(i);
    }
    public boolean checkUpgrade(String s){
        if (s.equals("pawn_P1"))
        {

        }else if (s.equals("pawn_P2")){

        }

        return false;
    }

}
