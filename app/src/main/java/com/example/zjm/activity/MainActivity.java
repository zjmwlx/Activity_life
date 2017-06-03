package com.example.zjm.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private Button btn_strAcivity;
    private Button btn_strDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_strAcivity = (Button) findViewById(R.id.btn_start_scendActivity);
        btn_strDialog = (Button) findViewById(R.id.btn_startdialog);

        btn_strAcivity.setOnClickListener(this);
        btn_strDialog.setOnClickListener(this);


        Log.i("zjm", "onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("zjm", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("zjm", "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("zjm", "onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("zjm", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("zjm", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("zjm", "onDestroy");
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btn_start_scendActivity:
                Intent intent = new Intent(MainActivity.this,ScendActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_startdialog:
                Log.i("zjm", "点击了启动对话框");
                AlertDialog.Builder dialog= new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("对话框");
                dialog.setMessage("弹出了对话框!");
                dialog.setCancelable(true);
                dialog.show();
                break;

        }
    }
}
