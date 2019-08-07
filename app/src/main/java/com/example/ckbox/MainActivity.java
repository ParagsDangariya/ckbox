package com.example.ckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox ckapple, ckmango;
    RadioGroup rg;
    RadioButton rb;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);

        ckapple= findViewById(R.id.apple);
        ckmango = findViewById(R.id.mango);
        rg = findViewById(R.id.gen_group);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ckapple.isChecked() && !ckmango.isChecked()){
                    Toast.makeText(getApplicationContext(),"apple is selected",Toast.LENGTH_LONG).show();
                }else if (ckmango.isChecked() && !ckapple.isChecked()){
                    Toast.makeText(getApplicationContext(),"mango is selected",Toast.LENGTH_LONG).show();
                }else if (ckapple.isChecked() && ckmango.isChecked()){
                    Toast.makeText(getApplicationContext(),"both is selected",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(getApplicationContext(),"Nothing is selected",Toast.LENGTH_LONG).show();
                }
            }
        });

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb = findViewById(checkedId);

                Toast.makeText(getApplicationContext(),rb.getText(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
