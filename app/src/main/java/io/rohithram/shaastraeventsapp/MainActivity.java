package io.rohithram.shaastraeventsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tv_code;
    TextView tv_rob;
    TextView tv_bus;
    TextView tv_quiz;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main1);

        CardView cv_code = (CardView)findViewById(R.id.cv_cod);
        CardView cv_rob=(CardView)findViewById(R.id.cv_rob);
        CardView cv_quiz=(CardView)findViewById(R.id.cv_involve);
        CardView cv_bus=(CardView)findViewById(R.id.cv_bus);

        tv_code=(TextView)findViewById(R.id.tv_cod_text);
        tv_rob=(TextView)findViewById(R.id.tv_rob_text);
        tv_bus=(TextView)findViewById(R.id.tv_bus_text);
        tv_quiz=(TextView)findViewById(R.id.tv_quiz_text);

        cv_code.setOnClickListener(this);
        cv_rob.setOnClickListener(this);
        cv_bus.setOnClickListener(this);
        cv_quiz.setOnClickListener(this);
    }

        @Override
        public void onClick(View v) {
            int code;
            switch (v.getId()){
                case R.id.cv_cod :  code=1;
                                    Intent i = new Intent(MainActivity.this,Main2Activity.class);
                                    i.putExtra("tvcode",String.valueOf(tv_code.getText()));
                                    i.putExtra("code",String.valueOf(code));
                                    startActivity(i);
                                    break;
                case R.id.cv_rob:   code = 2;
                                    i = new Intent(MainActivity.this,Main2Activity.class);
                                    i.putExtra("tvrob",String.valueOf(tv_rob.getText()));
                                    i.putExtra("code",String.valueOf(code));
                                    startActivity(i);
                                    break;
                case R.id.cv_bus:   code=3;i = new Intent(MainActivity.this,Main2Activity.class);
                                    i.putExtra("tvbus",String.valueOf(tv_bus.getText()));
                                    i.putExtra("code",String.valueOf(code));
                                    startActivity(i);
                                    break;
                case R.id.cv_involve:  code=4;  i = new Intent(MainActivity.this,Main2Activity.class);
                                        i.putExtra("tvquiz",String.valueOf(tv_quiz.getText()));
                                        i.putExtra("code",String.valueOf(code));
                                        startActivity(i);
                                        break;
            }


        }

}
