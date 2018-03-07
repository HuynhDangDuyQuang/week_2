package com.duyquang.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_ACT_SETTING=1234;
    public TextView txt;
    public String clr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt=(TextView)findViewById(R.id.textView);
        clr="pink";
        txt.setTextColor(getResources().getColor(R.color.pink));
        Button btnsetting =(Button) findViewById(R.id.button1);
        btnsetting.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent SettingAct=new Intent(MainActivity.this,SettingTitleActivity.class);

                    SettingAct.putExtra("textFromMain",txt.getText().toString());
                    SettingAct.putExtra("colorFromMain",clr);
                    startActivityForResult(SettingAct,REQUEST_ACT_SETTING);

                }

            }

        );


    }
    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode==REQUEST_ACT_SETTING){
            if(resultCode==RESULT_OK){
                String color=data.getStringExtra("colorFromSetting");
                String text=data.getStringExtra("textFromSetting");
//                if(text!=null )
                    txt.setText(text);

                if(color.equals("pink")) {
                    txt.setTextColor(getResources().getColor(R.color.pink));
                    clr="pink";
                }
                if(color.equals("purple")) {
                    txt.setTextColor(getResources().getColor(R.color.purple));
                    clr="purple";
                }
                if(color.equals("indigo")) {
                    txt.setTextColor(getResources().getColor(R.color.indigo));
                    clr="indigo";
                }
                if(color.equals("blue")) {
                    txt.setTextColor(getResources().getColor(R.color.blue));
                    clr="blue";
                }
                if(color.equals("teal")) {
                    txt.setTextColor(getResources().getColor(R.color.teal));
                    clr="teal";
                }
                if(color.equals("green")) {
                    txt.setTextColor(getResources().getColor(R.color.green));
                    clr="green";
                }


            }
        }
    }
}
