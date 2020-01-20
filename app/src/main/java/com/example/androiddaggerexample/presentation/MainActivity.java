package com.example.androiddaggerexample.presentation;


import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.example.androiddaggerexample.R;
import com.example.androiddaggerexample.databinding.ActivityMainBinding;
import com.example.androiddaggerexample.presentation.base.BaseActivity;
import com.example.androiddaggerexample.presentation.base.IBasePresenter;

import javax.inject.Inject;


public class MainActivity extends BaseActivity<ActivityMainBinding> implements MainPresenterContr.View {

    @Inject Context context;

    @Inject MainPresenterContr.Presenter presenter;

    @Override
    protected void initView(Bundle savedInstanceState) {
        Log.e("Main","context isNull " + (context == null));
        Log.e("Main","presenter isNull " + (presenter == null));
        presenter.init();
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected void onStartView() {
        presenter.startView(this);
        presenter.init();
    }

    @Override
    protected void onDestroyView() {
        if (this.presenter != null) presenter = null;
    }

    @Override
    protected IBasePresenter getPresenter() {
        return presenter;
    }
}
