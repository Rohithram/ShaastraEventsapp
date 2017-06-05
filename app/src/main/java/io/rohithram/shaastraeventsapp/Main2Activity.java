package io.rohithram.shaastraeventsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    String Eventcag;
    TextView tv_eventcag;
    TextView tv_event1;
    TextView tv_event2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        tv_eventcag = (TextView)findViewById(R.id.tv_eventcag);
        tv_event1 = (TextView)findViewById(R.id.tv_event1);
        tv_event2 = (TextView)findViewById(R.id.tv_event2);
        Intent event = getIntent();
        String code = event.getStringExtra("code");
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
}
