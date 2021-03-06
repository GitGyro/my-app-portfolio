package com.goempoweryourself.projectzero.projectzero;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button spotifyButton = (Button)findViewById(R.id.app1Button);
        Button scoresButton = (Button)findViewById(R.id.app2Button);
        Button libButton = (Button)findViewById(R.id.app3Button);
        Button buildBigButton = (Button)findViewById(R.id.app4Button);
        Button xyzReaderButton = (Button)findViewById(R.id.app5Button);
        Button capsButton = (Button)findViewById(R.id.capstonButton);


        spotifyButton.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"This button will launch my spotify streamer app!",Toast.LENGTH_SHORT).show();
            }
        });
        scoresButton.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"This button will launch my scores app!",Toast.LENGTH_SHORT).show();
            }
        });
        libButton.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"This button will launch my lib app!",Toast.LENGTH_SHORT).show();
            }
        });
        buildBigButton.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"This button will launch my build it bigger app!",Toast.LENGTH_SHORT).show();
            }
        });
        xyzReaderButton.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"This button will launch my xyz reader app!",Toast.LENGTH_SHORT).show();
            }
        });


        capsButton.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"This button will launch my capstone app!",Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
