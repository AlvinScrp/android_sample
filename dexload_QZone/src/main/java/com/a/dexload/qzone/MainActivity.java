package com.a.dexload.qzone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.a.fix.M;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_qzone);
        String str = M.a();
        ((TextView) findViewById(R.id.tvText)).setText(str);
    }
}