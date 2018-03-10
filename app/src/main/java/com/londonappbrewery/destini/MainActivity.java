package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    TextView storytextview;
    Button buttontop;
    Button buttonbottom;

    int mStoryIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mStoryIndex=1;

        storytextview = (TextView) findViewById(R.id.storyTextView);
        buttontop = (Button) findViewById(R.id.buttonTop);
        buttonbottom = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        buttontop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex==1)
                {
                    buttontop.setText(R.string.T3_Ans1);
                    buttonbottom.setText(R.string.T3_Ans2);

                    storytextview.setText(R.string.T3_Story);
                    mStoryIndex=3;
                }
                else if(mStoryIndex==2)
                {
                    buttontop.setText(R.string.T3_Ans1);
                    buttonbottom.setText(R.string.T3_Ans2);

                    storytextview.setText(R.string.T3_Story);
                    mStoryIndex=3;
                }
                else if(mStoryIndex==3)
                {
                    buttontop.setVisibility(View.GONE);
                    buttonbottom.setVisibility(View.GONE);

                    storytextview.setText(R.string.T6_End);
                    mStoryIndex=6;
                }


            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        buttonbottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex==1)
                {
                    buttontop.setText(R.string.T2_Ans1);
                    buttonbottom.setText(R.string.T2_Ans2);

                    storytextview.setText(R.string.T2_Story);
                    mStoryIndex=2;
                }
                else if(mStoryIndex==2)
                {
                    buttontop.setVisibility(View.GONE);
                    buttonbottom.setVisibility(View.GONE);

                    storytextview.setText(R.string.T4_End);
                    mStoryIndex=4;
                }
                else if(mStoryIndex==3)
                {
                    buttontop.setVisibility(View.GONE);
                    buttonbottom.setVisibility(View.GONE);

                    storytextview.setText(R.string.T5_End);
                    mStoryIndex=5;

                }
            }
        });

    }
}
