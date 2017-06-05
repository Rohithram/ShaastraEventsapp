package io.rohithram.shaastraeventsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{
    String Eventcag;
    String code;
    TextView tv_eventcag;
    TextView tv_event1;
    TextView tv_event2;
    CardView cv_event1;
    CardView cv_event2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        tv_eventcag = (TextView)findViewById(R.id.tv_eventcag);
        tv_event1 = (TextView)findViewById(R.id.tv_event1);
        tv_event2 = (TextView)findViewById(R.id.tv_event2);
        cv_event1 = (CardView)findViewById(R.id.cv_event1);
        cv_event2 = (CardView)findViewById(R.id.cv_event2);
        cv_event1.setOnClickListener(this);
        cv_event2.setOnClickListener(this);
        Intent event = getIntent();
        code = event.getStringExtra("code");
        switch (code){
            case "1": Eventcag=event.getStringExtra("tvcode");
                        tv_eventcag.setText(Eventcag);
                        tv_event1.setText("Hackathon");
                        tv_event2.setText("Reversecoding");


                        break;
            case "2": Eventcag = event.getStringExtra("tvrob");
                        tv_eventcag.setText(Eventcag);
                        tv_event1.setText("Bot racing");
                        tv_event2.setText("Robowars");
                        break;
            case "3": Eventcag=event.getStringExtra("tvbus");
                        tv_eventcag.setText(Eventcag);
                        tv_event1.setText("Startup wars");
                        tv_event2.setText("Tidbits");
                        break;
            case "4":Eventcag=event.getStringExtra("tvquiz");
                        tv_eventcag.setText(Eventcag);
                        tv_event1.setText("Shaastra Main quiz");
                        tv_event2.setText("Shaastra Cube open");
                        break;

        }


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cv_event1: Intent i2 = new Intent(Main2Activity.this,Main3Activity.class);
                                    switch (code){
                                        case "1": i2.putExtra("tvhack",String.valueOf(tv_event1.getText()));
                                                    i2.putExtra("code",code+"1");
                                                    startActivity(i2);
                                                        break;
                                        case "2": i2.putExtra("tvbot",String.valueOf(tv_event1.getText()));
                                                    i2.putExtra("code",code+"1");
                                                    startActivity(i2);
                                                    break;
                                        case "3": i2.putExtra("tvstartup",String.valueOf(tv_event1.getText()));
                                                    i2.putExtra("code",code+"1");
                                                    startActivity(i2);
                                                    break;
                                        case "4": i2.putExtra("tvmainquiz",String.valueOf(tv_event1.getText()));
                                                        i2.putExtra("code",code+"1");
                                                        startActivity(i2);
                                                        break;
                                    }
                                    break;
            case R.id.cv_event2: i2 = new Intent(Main2Activity.this,Main3Activity.class);
                                        switch (code){
                                            case "1": i2.putExtra("tvreverse",String.valueOf(tv_event2.getText()));
                                                i2.putExtra("code",code+"2");
                                                startActivity(i2);
                                                break;
                                            case "2": i2.putExtra("tvwars",String.valueOf(tv_event2.getText()));
                                                i2.putExtra("code",code+"2");
                                                startActivity(i2);
                                                break;
                                            case "3": i2.putExtra("tvtid",String.valueOf(tv_event2.getText()));
                                                i2.putExtra("code",code+"2");
                                                startActivity(i2);
                                                break;
                                            case "4": i2.putExtra("tvmaincube",String.valueOf(tv_event2.getText()));
                                                i2.putExtra("code",code+"2");
                                                startActivity(i2);
                                                break;
                                        }
                                        break;

        }

    }
}
