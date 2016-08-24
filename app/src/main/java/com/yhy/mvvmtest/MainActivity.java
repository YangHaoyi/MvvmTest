package com.yhy.mvvmtest;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.yhy.mvvmtest.databinding.ActivityLoginBinding;

public class MainActivity extends AppCompatActivity {
    ActivityLoginBinding binding;
    User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(
                this, R.layout.activity_login);
       user = new User();
        binding.setUser(user);

        Button change = (Button) findViewById(R.id.change);

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                user.firstName.set("yang");
                user.setFirstName("yang");
                user.setLastName("haoyi");
                user.notifyChange();
            }
        });

    }



}
