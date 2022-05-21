package com.chadbyers.lifecycledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.chadbyers.lifecycledemo.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

    private ActivityHomeBinding binding;

    // Listener
    private View.OnClickListener button_submit_clickListener = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            Intent theIntent = new Intent(HomeActivity.this, AwayActivity.class);
            startActivity(theIntent);
        }
    };

    public static int callNum = 0;

    public static void writeToLog(String activityName, String methodName){
        callNum += 1;
        Log.d("CSC398",String.valueOf(callNum) + ": " + activityName + " - " + methodName);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        writeToLog("HomeActivity","onCreate");
        binding.buttonSubmit.setOnClickListener(button_submit_clickListener);
    }

    @Override
    protected void onStart() {
        super.onStart();
        writeToLog("HomeActivity","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        writeToLog("HomeActivity","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        writeToLog("HomeActivity","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        writeToLog("HomeActivity", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        writeToLog("HomeActivity", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        writeToLog("HomeActivity", "onDestroy");
    }
}