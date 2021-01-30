package com.example.lab1;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    // Defining variables to count and show counter.
    private int mCount = 0;
    private TextView mShowCount;

    /**
     * OnCreate method is called when the activity starts.
     *
     * @param savedInstanceState is used to save the most recently supplied data to the app.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
    }

    /**
     * This method is called when the user presses the toast button.
     *
     * @param view responsible for drawing and event handling. Used here to set the text to
     *             hello toast.
     */
    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    /**
     * A method to increment the counter when the button is pressed.
     *
     * @param view responsible for drawing and event handling.
     */
    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}