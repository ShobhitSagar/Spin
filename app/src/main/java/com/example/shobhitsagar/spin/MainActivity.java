package com.example.shobhitsagar.spin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    ImageView iv_bottle;
    Random random;
    String[] string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        string = new String[]{"TRUTH", "DARE"};
        iv_bottle = (ImageView) findViewById(R.id.iv_bottle);
        txt = (TextView) findViewById(R.id.txt);
        random = new Random();

        iv_bottle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RotateAnimation rotate = new RotateAnimation(0, random.nextInt(36000) + 360, RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                rotate.setFillAfter(true);
                rotate.setDuration(5000);
                rotate.setInterpolator(new AccelerateDecelerateInterpolator());
                iv_bottle.startAnimation(rotate);
                int rando =(int) (Math.random()*2);
                txt.setText(string[rando]);
                Toast.makeText(MainActivity.this, "SHOBHIT", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void msg(View view) {
        
    }
}
