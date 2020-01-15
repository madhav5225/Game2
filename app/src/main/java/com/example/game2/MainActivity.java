package com.example.game2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int activeplayer;
    int[] a = {2,2,2,2,2,2,2,2,2};
int win=0;

public void PlayAgain(View view){
    activeplayer=0;
    win=0;
    TextView text=(TextView)findViewById(R.id.textView1);
    for(int i=0;i<=8;i++){
        a[i]=2;}
        android.support.v7.widget.GridLayout Grid=(android.support.v7.widget.GridLayout)findViewById(R.id.gridLayout);
        for(int i=0;i<=8;i++){
            ((ImageView)Grid.getChildAt(i)).setImageResource(0);
        }
    text.setVisibility(View.INVISIBLE);




}

    public void dropin(View view) {
        String[] s = {"0", "X"};
        TextView text = (TextView) findViewById(R.id.textView1);
        ImageView counter = (ImageView) view;
        int position = Integer.parseInt(counter.getTag().toString());
        if (win == 0) {
            if (activeplayer == 0 && a[position] == 2) {

                a[position] = activeplayer;

                counter.setImageResource(R.drawable.download2);
                for (int i = 0; i <= 6; i += 3) {
                    if ((a[i] == a[i + 1]) && (a[i + 1] == a[i + 2]) && a[i] != 2) {
                       win=1;
                        text.setVisibility(View.VISIBLE);
                        text.setText(s[activeplayer] + "Has Won");
                    }
                }
                for (int i = 0; i <= 2; i++) {
                    if (a[i] == a[i + 3] && a[i + 3] == a[i + 6] && a[i] != 2) {
                        win=1;
                        text.setVisibility(View.VISIBLE);
                        text.setText(s[activeplayer] + "Has Won");
                    }
                }
                if (a[0] == a[4] && a[4] == a[8] && a[0] != 2) {

                    win=1;text.setVisibility(View.VISIBLE);
                    text.setText(s[activeplayer] + "Has Won");
                }
                if (a[2] == a[4] && a[4] == a[6] && a[2] != 2) {
                    text.setVisibility(View.VISIBLE);
                    win=1;text.setText(s[activeplayer] + "Has Won");
                }
                activeplayer = 1;
            } else if (activeplayer == 1 && a[position] == 2) {
                a[position] = activeplayer;

                for (int i = 0; i <= 6; i += 3) {
                    if ((a[i] == a[i + 1]) && (a[i + 1] == a[i + 2]) && a[i] != 2) {
                        text.setVisibility(View.VISIBLE);
                        win=1;text.setText(s[activeplayer] + "Has Won");
                    }
                }
                for (int i = 0; i <= 2; i++) {
                    if (a[i] == a[i + 3] && a[i + 3] == a[i + 6] && a[i] != 2) {
                        text.setVisibility(View.VISIBLE);
                        win=1;text.setText(s[activeplayer] + "Has Won");
                    }
                }
                if (a[0] == a[4] && a[4] == a[8] && a[0] != 2) {
                    win=1;text.setVisibility(View.VISIBLE);
                    text.setText(s[activeplayer] + "Has Won");
                }
                if (a[2] == a[4] && a[4] == a[6] && a[2] != 2) {
                    win=1; text.setVisibility(View.VISIBLE);
                    text.setText(s[activeplayer] + "Has Won");
                }

                activeplayer = 0;
                counter.setImageResource(R.drawable.download);
            }
            if ((a[0] != 2 && a[1] != 2 && a[2] != 2 && a[3] != 2 && a[4] != 2 && a[5] != 2 && a[6] != 2 && a[7] != 2 && a[8] != 2)&&win==0) {
                win=1;text.setVisibility(View.VISIBLE);
                text.setText("Draw");
            }

        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
