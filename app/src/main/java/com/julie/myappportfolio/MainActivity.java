package com.julie.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private Toast mAppToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void startSpotifyStreamer(View view) {
        displayPlaceholderToast(R.string.spotify_streamer);
    }

    public void startFootballScoresApp(View view) {
        displayPlaceholderToast(R.string.football_scores);
    }

    public void startLibraryApp(View view) {
        displayPlaceholderToast(R.string.library);
    }

    public void startBuildItBigger(View view) {
        displayPlaceholderToast(R.string.build_it_bigger);
    }

    public void startXYZReader(View view) {
        displayPlaceholderToast(R.string.xyz_reader);
    }

    public void startCapstone(View view) {
        displayPlaceholderToast(R.string.capstone);
    }

    private void displayPlaceholderToast(int resourceID)
    {
        CharSequence appName = getString(resourceID);
        if (mAppToast != null) {
            mAppToast.cancel();
        }
        CharSequence text = "This button will launch the " + appName + " App!";
        mAppToast = Toast.makeText(this, text, Toast.LENGTH_SHORT);
        mAppToast.show();
    }
}
