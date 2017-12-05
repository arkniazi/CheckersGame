package com.example.cracker.gameboard;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.attr.button;
import static android.R.attr.theme;

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
        for(int i = 0;i<arrayList.size();i++){

            imageView = arrayList.get(i);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String[] s = ((String) v.getTag()).split("-");
                    ImageView imageView1 = (ImageView) v;
                    Log.d("ID of image", String.valueOf(imageView1.getTag()));

//                    if((turn && s[s.length-1].equals("p1") ) || (!turn && s[s.length-1].equals("p2"))) {
//
//                        Check.selected = true;
//                        Check.imageViewSelected = (ImageView) v;
//
//                    }
//                    else if (!turn && v.getTag().equals("void")) {
//
//                        if (Check.selected ){
//
//                            Check check = new Check((ImageView) v, (Activity) getApplicationContext());
//                            if(check.checkAndMove()){
//                                if(turn){
//                                    turn = false;
//                                }
//                                else {
//                                    turn = true;
//                                }
//                            }
//                        }
//
//                    }

                }
            });
        }

    }

    public class CreateArr{
        ImageView imageView = null;
        public  void add(){
            arrayList = new ArrayList<ImageView>();
            imageView = (ImageView) findViewById(R.id.imageView2);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView4);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView6);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView8);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView10);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView12);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView14);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView16);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView18);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView20);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView22);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView24);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView26);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView28);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView30);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView32);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView34);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView36);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView38);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView40);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView42);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView44);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView46);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView48);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView50);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView52);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView54);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView56);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView58);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView60);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView62);
            arrayList.add(imageView);
            imageView = (ImageView) findViewById(R.id.imageView64);
            arrayList.add(imageView);





        }
    }


}
