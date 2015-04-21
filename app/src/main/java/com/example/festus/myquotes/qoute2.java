package com.example.festus.myquotes;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by festus on 4/5/15.
 */
public class qoute2 extends Activity {
    final Context cont = this;
    Button nextbtn2;
   @Override
    protected void onCreate(Bundle savedInstanceState){
       setContentView(R.layout.quote2);
        super.onCreate(savedInstanceState);
        nextbtn2 =(Button)findViewById(R.id.button);
       nextbtn2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent in = new Intent (cont,qoute3.class);
               startActivity(in);
           }
       });

   }
}
