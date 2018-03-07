package com.duyquang.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class SettingTitleActivity extends AppCompatActivity {

    public View viewSample;
    public EditText txt;

    public Button btnSave;

//    public Intent main;
    public ImageView iv1;
    public ImageView iv2;
    public ImageView iv3;
    public ImageView iv4;
    public ImageView iv5;
    public ImageView iv6;

    public String clr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_title);
        viewSample=(View)findViewById(R.id.viewSample);
        txt=(EditText)findViewById(R.id.edt);
        btnSave=(Button)findViewById(R.id.btnSave);
        iv1= (ImageView) findViewById(R.id.iv1);
        iv2= (ImageView) findViewById(R.id.iv2);
        iv3= (ImageView) findViewById(R.id.iv3);
        iv4= (ImageView) findViewById(R.id.iv4);
        iv5= (ImageView) findViewById(R.id.iv5);
        iv6= (ImageView) findViewById(R.id.iv6);

        Bundle data= getIntent().getExtras();
        if(data!=null) {
            String text = data.getString("textFromMain");
            String color = data.getString("colorFromMain");
            txt.setText(text);
            if(color.equals("pink")) viewSample.setBackgroundColor(getResources().getColor(R.color.pink));
            if(color.equals("purple")) viewSample.setBackgroundColor(getResources().getColor(R.color.purple));
            if(color.equals("indigo")) viewSample.setBackgroundColor(getResources().getColor(R.color.indigo));
            if(color.equals("blue")) viewSample.setBackgroundColor(getResources().getColor(R.color.blue));
            if(color.equals("teal")) viewSample.setBackgroundColor(getResources().getColor(R.color.teal));
            if(color.equals("green")) viewSample.setBackgroundColor(getResources().getColor(R.color.green));
        }


        iv1.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       viewSample.setBackgroundColor(getResources().getColor(R.color.pink));
                                       clr="pink";
                                   }
                               }

        );
        iv2.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       viewSample.setBackgroundColor(getResources().getColor(R.color.purple));
                                       clr="purple";
                                   }
                               }

        );
        iv3.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       viewSample.setBackgroundColor(getResources().getColor(R.color.indigo));
                                       clr="indigo";
                                   }
                               }

        );
        iv4.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       viewSample.setBackgroundColor(getResources().getColor(R.color.blue));
                                       clr="blue";
                                   }
                               }

        );
        iv5.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       viewSample.setBackgroundColor(getResources().getColor(R.color.teal));
                                       clr="teal";
                                   }
                               }

        );
        iv6.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       viewSample.setBackgroundColor(getResources().getColor(R.color.green));
                                       clr="green";
                                   }
                               }

        );

        btnSave.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           Intent main=new Intent();
                                           main.putExtra("colorFromSetting",clr);
                                           main.putExtra("textFromSetting",txt.getText().toString());
                                           setResult(RESULT_OK,main);
                                           finish();
                                       }
                                   }
        );
    }
}
