package com.example.cracker.gameboard;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ImageView> arrayList = null;
    static boolean turn;

    static ImageView imageViewSelected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView=null;
        new CreateArr().add();
//        Log.i("Arra",""+arrayList.size());
        final Context context = this;
        for(int i = 0;i<arrayList.size();i++){

            imageView = arrayList.get(i);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    Button buttonProfile = (Button) findViewById(R.id.profile);
                    Button buttonProfile1 = (Button) findViewById(R.id.profile1);
                    String[] s = ((String) v.getTag()).split("-");
                    Log.d(" Tag", (String) v.getTag());
                    Log.d("ID of image", v.getResources().getResourceEntryName(v.getId()));
                    if ((turn && v.getTag().equals("pawn_P1")) || (!turn && v.getTag().equals("pawn_P2"))){

                        Check.selected = true;
                        Check.imageViewSelected = (ImageView) v;
                    }
                    else if (Check.selected && v.getTag().equals("void")) {

                            Check check = new Check((ImageView) v, (Activity) context);

                            if(check.move()){
                                if(turn){
                                    turn = false;
                                    buttonProfile1.setText(" Your Turn");
                                    buttonProfile.setText(" Opponent");

                                }
                                else {
                                    turn = true;

                                    buttonProfile.setText(" Your Turn");
                                    buttonProfile1.setText(" Opponent");
                                }
                            }
                            Check.selected = false;
                            Check.imageViewSelected = null;
                    }

                }
            });
        }

    }

    public class CreateArr{
        ImageView imageView = null;
        public  void add(){
            arrayList = new ArrayList<ImageView>();
            imageView = (ImageView) findViewById(R.id.imageView1);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView3);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView5);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView7);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView10);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView12);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView14);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView16);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView17);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView19);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView21);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView23);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView26);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView28);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView30);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView32);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView33);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView35);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView37);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView39);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView42);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView44);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView46);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView48);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView49);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView51);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView53);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView55);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView58);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView60);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView62);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView64);
            arrayList.add(imageView);

            for(int a=0;a<arrayList.size();a++ ){
                ImageView imagetag = arrayList.get(a);
                if(a<12){
                imagetag.setTag("pawn_P1");
                }
                else if(a>19){
                    imagetag.setTag("pawn_P2");

                }
                else{
                    imagetag.setTag("void");

                }
            }
        }
    }


}
