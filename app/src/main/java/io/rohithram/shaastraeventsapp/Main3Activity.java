package io.rohithram.shaastraeventsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
String code;
    TextView tv_evename;
    TextView tv_locval;
    TextView tv_des;
    TextView tv_timeval;
    TextView tv_prizemoney;
    TextView tv_coordname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main3);
        tv_evename = (TextView)findViewById(R.id.tv_evename);
        tv_locval = (TextView)findViewById(R.id.tv_locval) ;
        tv_timeval = (TextView)findViewById(R.id.tv_timeval);
        tv_des =(TextView)findViewById(R.id.tv_des);
        tv_prizemoney =(TextView)findViewById(R.id.tv_prizemoney);
        tv_coordname =(TextView)findViewById(R.id.tv_cordname);
        Intent i2 = getIntent();
        code = i2.getStringExtra("code");
        switch (code){
            case "11":  tv_evename.setText(i2.getStringExtra("tvhack"));
                        tv_des.setText("Teams battle over to develop an app or website which solves a prevalent issue in society.");
                        tv_locval.setText("CRC 101");
                        tv_timeval.setText("Jan 2,2017 6.00 pm");
                        tv_prizemoney.setText(" Rs.5000 ");
                        tv_coordname.setText("Roshangaul  +919840563641");
                        break;


            case "21": tv_evename.setText(i2.getStringExtra("tvbot"));
                        tv_des.setText("Race Between your dream robots!");
                        tv_locval.setText("KV grounds");
                        tv_timeval.setText("Jan 1,2017 3.00 pm");
                        tv_prizemoney.setText(" Rs.10000 ");
                        tv_coordname.setText("Athian  +919841563641");
                        break;
            case "31": tv_evename.setText(i2.getStringExtra("tvstartup"));
                            tv_des.setText("Teams battle it out to solve a raising issue in soceity by a startup idea!");
                            tv_locval.setText("ICSR");
                            tv_timeval.setText("Jan 1,2017 8.00 pm");
                            tv_prizemoney.setText(" Rs.4000 ");
                            tv_coordname.setText("Nethran  +918755465321");
                            break;
            case "41": tv_evename.setText(i2.getStringExtra("tvmainquiz"));
                        tv_des.setText("The Biggest quiz in Shaastra");
                        tv_locval.setText("CRC 103");
                        tv_timeval.setText("Jan 2,2017 10.00 am");
                        tv_prizemoney.setText(" Rs.8000 ");
                        tv_coordname.setText("Alan  +919841363641");
                        break;
            case "12": tv_evename.setText(i2.getStringExtra("tvreverse"));
                        tv_des.setText("Fix the errors and code in reverse");
                        tv_locval.setText("CRC 205");
                        tv_timeval.setText("Jan 4,2017 1.00 pm");
                        tv_prizemoney.setText(" Rs.1000 ");
                        tv_coordname.setText("GowriShankar  +919040563641");
                        break;
            case "22": tv_evename.setText(i2.getStringExtra("tvwars"));
                        tv_des.setText("Teams battle with their robots!");
                        tv_locval.setText("SAC Lawns");
                        tv_timeval.setText("Jan 3,2017 11.00 am");
                        tv_prizemoney.setText(" Rs.9000 ");
                        tv_coordname.setText("Roshan  +919840745536");
                        break;
            case "32": tv_evename.setText(i2.getStringExtra("tvtid"));
                        tv_des.setText("Solve the problem statment given using the dataset.");
                        tv_locval.setText("CLT Lecture hall");
                        tv_timeval.setText("Jan 1,2017 11.00 am");
                        tv_prizemoney.setText(" Rs.1000 ");
                        tv_coordname.setText("Rahul  +919840563641");
                        break;
            case "42": tv_evename.setText(i2.getStringExtra("tvmaincube"));
                        tv_des.setText("Who can solve the Rubik's cube and its variants the fastest?");
                        tv_locval.setText("CRC 204");
                        tv_timeval.setText("Jan 5,2017 4.00 pm");
                        tv_prizemoney.setText(" Rs.5000 ");
                        tv_coordname.setText("sachin  +919845563641");
                        break;






        }
    }
}
