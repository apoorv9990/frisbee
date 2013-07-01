package org.gdg.frisbee.android.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.github.rtyley.android.sherlock.roboguice.activity.RoboSherlockActivity;
import org.gdg.frisbee.android.Const;

/**
 * Created with IntelliJ IDEA.
 * User: maui
 * Date: 02.07.13
 * Time: 00:03
 * To change this template use File | Settings | File Templates.
 */
public class StartActivity extends RoboSherlockActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences mPreferences = getSharedPreferences("gdg", MODE_PRIVATE);

        if(mPreferences.getBoolean(Const.SETTINGS_FIRST_START, true)) {
            Intent firstStartIntent = new Intent(StartActivity.this, FirstStartActivity.class);
            startActivity(firstStartIntent);
        } else {
            Intent mainIntent = new Intent(StartActivity.this, MainActivity.class);
            startActivity(mainIntent);
        }

        finish();
    }
}