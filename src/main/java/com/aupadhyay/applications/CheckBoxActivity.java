package com.aupadhyay.applications;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    CheckBox androidCB, cppCB, javaCB;

    public void initCB()
    {
        androidCB = (CheckBox) findViewById(R.id.androidCB);
        cppCB = (CheckBox) findViewById(R.id.cppCB);
        javaCB = (CheckBox) findViewById(R.id.javaCB);

        androidCB.setOnCheckedChangeListener(this);
        javaCB.setOnCheckedChangeListener(this);
        cppCB.setOnCheckedChangeListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        initCB();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton1, boolean b) {

        String str = "You know ";

        switch (compoundButton1.getId())
        {
            case R.id.androidCB:
                str = str+"Android";
                str += b?"isChecked":"isUnchecked";
                break;
            case R.id.cppCB:

                str = str+"C++";
                str += b?"isChecked":"isUnchecked";
                break;

            case R.id.javaCB:

                str = str+"Java";
                str += b?"isChecked":"isUnchecked";
                break;
        }

        Toast.makeText(this, str, Toast.LENGTH_LONG).show();
    }
}
