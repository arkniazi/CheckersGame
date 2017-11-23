package com.example.cracker.gameboard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Button> arrayList = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = null;
        new CreateArr().add();
//        Log.i("Arra",""+arrayList.size());
        for(int i = 1;i<arrayList.size();i++){

            button = arrayList.get(i);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(),v.getId()+"HY",Toast.LENGTH_LONG).show();

                }
            });
        }

    }

    public class CreateArr{
        Button button =null;
        public  void add(){
            arrayList = new ArrayList<Button>();
            button = (Button) findViewById(R.id.button2);
            arrayList.add(button);
            button = (Button) findViewById(R.id.button4);
            arrayList.add(button);
            button = (Button) findViewById(R.id.button6);
            arrayList.add(button);
            button = (Button) findViewById(R.id.button8);
            arrayList.add(button);
            button = (Button) findViewById(R.id.button10);
            arrayList.add(button);
            button = (Button) findViewById(R.id.button12);
            arrayList.add(button);
            button = (Button) findViewById(R.id.button14);
            arrayList.add(button);
            button = (Button) findViewById(R.id.button16);
            arrayList.add(button);
            button = (Button) findViewById(R.id.button18);
            arrayList.add(button);
            button = (Button) findViewById(R.id.button20);
            arrayList.add(button);
            button = (Button) findViewById(R.id.button22);
            arrayList.add(button);
            button = (Button) findViewById(R.id.button24);
            arrayList.add(button);
            button = (Button) findViewById(R.id.button26);
            arrayList.add(button);
            button = (Button) findViewById(R.id.button28);
            arrayList.add(button);
            button = (Button) findViewById(R.id.button30);
            arrayList.add(button);
            button = (Button) findViewById(R.id.button32);
            arrayList.add(button);
            button = (Button) findViewById(R.id.button34);
            arrayList.add(button);
            button = (Button) findViewById(R.id.button36);
            arrayList.add(button);
            button = (Button) findViewById(R.id.button38);
            arrayList.add(button);
            button = (Button) findViewById(R.id.button40);
            arrayList.add(button);
            button = (Button) findViewById(R.id.button42);
            arrayList.add(button);
            button = (Button) findViewById(R.id.button44);
            arrayList.add(button);
            button = (Button) findViewById(R.id.button46);
            arrayList.add(button);
            button = (Button) findViewById(R.id.button48);
            arrayList.add(button);
            button = (Button) findViewById(R.id.button50);
            arrayList.add(button);
            button = (Button) findViewById(R.id.button52);
            arrayList.add(button);
            button = (Button) findViewById(R.id.button54);
            arrayList.add(button);
            button = (Button) findViewById(R.id.button56);
            arrayList.add(button);
            button = (Button) findViewById(R.id.button58);
            arrayList.add(button);
            button = (Button) findViewById(R.id.button60);
            arrayList.add(button);
            button = (Button) findViewById(R.id.button62);
            arrayList.add(button);
            button = (Button) findViewById(R.id.button64);
            arrayList.add(button);



        }
    }


}
