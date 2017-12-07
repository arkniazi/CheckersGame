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

    public boolean checkAndMove() {

        String s = (String) imageViewSelected.getTag();

            transition();
        if (imageView.getTag().equals("pawn_p1")) {

            //check(7, 9);

        } else if (imageView.getTag().equals("queen_P1")) {

        } else if (imageView.getTag().equals("pawn_P2")) {

        } else if (imageView.getTag().equals("queen_P2")) {

        }
        return true;
    }

    public void transition() {

        Log.d(" Transition"," going here");
//        BitmapDrawable bitmap = ((BitmapDrawable) imageViewSelected.getDrawable());
//        Log.d("Package Name",imageViewSelected.getResources().getResourcePackageName(0));
        imageView.setImageDrawable(imageViewSelected.getDrawable());

//        Bitmap bit = bitmap.getBitmap();
//        imageView.setImageBitmap(bit);

//        imageView.setImageBitmap(BitmapFactory.decodeResource(context.getResources(),
//                imageViewSelected.getId()));
        imageView.setTag(imageViewSelected.getTag());

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


    public void check(int left, int right) {
        String imageSelectedName = imageViewSelected.getResources().getResourceEntryName(imageViewSelected.getId());
        int imageSelectedInt = mySplit(imageSelectedName, "imagView");
        String imageName = imageView.getResources().getResourceEntryName(imageView.getId());
        int imageInt = mySplit(imageName, "imagView");

        if ((imageSelectedInt == imageInt - left) || (imageSelectedInt == imageInt + left)
                || (imageSelectedInt == imageInt - right) || (imageSelectedInt == imageInt + right)) {

        } else if (imageSelectedInt == imageInt - 2 * left) {
            isOppnent(imageInt - left);
        } else if (imageSelectedInt == imageInt + 2 * left) {

        } else if (imageSelectedInt == imageInt - 2 * right) {

        } else if (imageSelectedInt == imageInt + 2 * right) {
//            isOppnent();
        }

        left = context.getResources().getIdentifier("imageView" + (left), "drawable", context.getPackageName());

    }

    public boolean isOppnent(int x) {
        int a = context.getResources().getIdentifier("imageView" + x, "drawable", context.getPackageName());
        ImageView imageKill = (ImageView) context.findViewById(a);
        if (imageKill.getTag().equals(imageViewSelected.getTag())) {
            return true;
        } else if (true) {
            return true;
        }
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
