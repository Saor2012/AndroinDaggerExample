package com.example.androiddaggerexample.presentation.base;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.databinding.ViewDataBinding;

import dagger.android.support.DaggerAppCompatActivity;


public abstract class BaseActivity<Binding extends ViewDataBinding> extends DaggerAppCompatActivity {
    private Binding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutRes());
        initView(savedInstanceState);
    }

    protected abstract void initView(Bundle savedInstanceState);

    @LayoutRes
    protected abstract int getLayoutRes();

    @Override
    protected void onStart() {
        super.onStart();
        onStartView();
    }

    protected Binding getBinding(){
        return binding;
    }

    @Override
    public void onDestroy() {
        if (getPresenter() != null) {
            onDestroyView();
            getPresenter().stopView();
        }
        super.onDestroy();
    }

    protected abstract void onStartView();

    protected abstract void onDestroyView();

    protected abstract IBasePresenter getPresenter();

    protected void toast(String message){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }



}
