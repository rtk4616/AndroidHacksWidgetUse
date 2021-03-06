package com.diygreen.widgetuse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_test1:
                overlay(FormDateValidateActivity.class);
                break;
            case R.id.btn_test2:
                overlay(FormatTextActivity.class);
                break;
            case R.id.btn_test3:
                overlay(LedTextActivity.class);
                break;
            case R.id.btn_test4:
                overlay(RoundButtonActivity.class);
                break;
            case R.id.btn_test5:
                overlay(GetViewWHActivity.class);
                break;
            case R.id.btn_test6:
                overlay(VideoViewActivity.class);
                break;
            case R.id.btn_test7:
                overlay(AccelerateBootActivity.class);
                break;
        }
    }

    private void overlay(Class<? extends Activity> clazz) {
        Intent intent = new Intent(this, clazz);
        startActivity(intent);
    }

}
