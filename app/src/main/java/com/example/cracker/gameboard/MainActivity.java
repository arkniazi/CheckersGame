package com.example.cracker.gameboard;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Context context = this;
//    private String myTag;
    private ImageView imageView;
    GameManager gameManager;
    static String myTag;
    static String turn;
    static DataSnapshot dataSnapshot;
    static ArrayList<ImageView> arrayList = null;
//    static boolean turn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gameManager = new GameManager(this);
        gameManager.setTurn("Player 1");
//        ImageView imageView=null;
//        email= FirebaseAuth.getInstance().getCurrentUser().getEmail();
        new CreateArr().add();
//        dataSnapshot.getRef().addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                if(dataSnapshot.child("Turn").getValue().equals(myTag) && !dataSnapshot.child("Image Selected").equals(" ")){
//                    String imageName = dataSnapshot.child("Image").getValue().toString();
//                    String imageNameSelected = dataSnapshot.child("Image Selected").getValue().toString();
//                    String imageKill = dataSnapshot.child("Image Kill").getValue().toString();
//
//                    Transition transition = new Transition((Activity) context);
//                    if (!(imageName.equals(" ") && imageNameSelected.equals(" "))){
//
//                        turn = dataSnapshot.child("Turn").getValue().toString();
//                        imageView = (ImageView) findViewById(getBaseContext().getResources().getIdentifier(imageName,"id",getPackageName()));
//                        Check.imageViewSelected = (ImageView) findViewById(getBaseContext().getResources().getIdentifier(imageNameSelected,"id",getPackageName()));
//                        transition.swap(imageView);
//                    }
//                    if (!imageKill.equals(" ")){
//
//                        transition.kill(Integer.parseInt(imageKill));
//                    }
//                    dataSnapshot.child("Image").getRef().setValue(" ");
//                    dataSnapshot.child("Image Selected").getRef().setValue(" ");
//                    dataSnapshot.child("Image Kill").getRef().setValue(" ");
//
//
//                }
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });
//        Log.i("Arra",""+arrayList.size());
        for(int i = 0;i<arrayList.size();i++){

            imageView = arrayList.get(i);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    Button buttonProfile = (Button) findViewById(R.id.profile);
                    Button buttonProfile1 = (Button) findViewById(R.id.profile1);
                    String[] s = ((String) v.getTag()).split("_");
                    Log.d(" Tag", (String) v.getTag());
                    Log.d("ID of image", v.getResources().getResourceEntryName(v.getId()));
                    if((gameManager.getTurn().equals("Player 1") && s[s.length-1].equals("P1")) ||
                            (gameManager.getTurn().equals("Player 2") && s[s.length].equals("P2"))){
//                    if ((myTag.equals("Player 1") && myTag.equals(turn) && v.getTag().equals("pawn_P1")) ||
//                            (myTag.equals("Player 2") && myTag.equals(turn) && v.getTag().equals("pawn_P2"))){

                        gameManager.setSelected(true);
                        gameManager.setImageSelected((ImageView) v);
//                        Check.selected = true;
//                        Check.imageViewSelected = (ImageView) v;
                    }
                    else if (gameManager.isSelected() && v.getTag().equals("void")) {


                            if(gameManager.isLegal((ImageView) v)){
                                if(gameManager.getTurn().equals("Player 1")){
                                    gameManager.setTurn("Player 2");
//                                    turn = false;
                                    buttonProfile1.setText(" Your Turn");
                                    buttonProfile.setText(" Opponent");

                                }
                                else {
                                    gameManager.setTurn("Player 1");
//                                    turn = true;

                                    buttonProfile.setText(" Your Turn");
                                    buttonProfile1.setText(" Opponent");
                                }
//                                 dataSnapshot.child("Image Selected").getRef().setValue(context.getResources().
//                                     getResourceEntryName(Check.imageViewSelected.getId()));
//                                dataSnapshot.child("Image").getRef().setValue(context.getResources().
//                                    getResourceEntryName(v.getId()));
//
//                                 if (myTag.equals("Player 1")){
//                                     dataSnapshot.child("Turn").getRef().setValue("Player 2");
//
//                                 }
//                                else {
//                                     dataSnapshot.child("Turn").getRef().setValue("Player 1");
//                                 }
//                                 if (Check.killImage>0){
//                                     dataSnapshot.child("Image Kill").getRef().setValue(Check.killImage);
//                                     Check.killImage = 0;
//                                 }
                            }

                        gameManager.setSelected(false);
                        gameManager.setImageSelected(null);

//                            Check.selected = false;
//                            Check.imageViewSelected = null;
                    }

                }
            });
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        dataSnapshot.child("State").getRef().setValue("Completed");
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
