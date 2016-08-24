package com.yhy.mvvmtest;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * 作者 : YangHaoyi on 2016/7/25.
 * 邮箱 ：yanghaoyi@neusoft.com
 */
public class User extends BaseObservable{
    private String firstName = "A";
    private String lastName = "B";


    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
//        notifyPropertyChanged(com.yhy.mvvmtest.BR.firstName);
    }
    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
//        notifyPropertyChanged(com.yhy.mvvmtest.BR.lastName);
    }
}
