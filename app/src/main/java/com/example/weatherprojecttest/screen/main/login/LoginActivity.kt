package com.example.weatherprojecttest.screen.main.login


import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import com.example.weatherprojecttest.R
import com.example.weatherprojecttest.databinding.ActivityLoginBinding
import com.example.weatherprojecttest.screen.base.activity.BaseBindingActivity
import com.example.weatherprojecttest.BR

class LoginActivity : BaseBindingActivity<ActivityLoginBinding, LoginViewModel>() {

    private val TAG = "LoginActivity"

    override val bindingVariable: Int
        get() = BR.login

    override val viewModel: LoginViewModel
        get() = ViewModelProviders.of(this).get(LoginViewModel::class.java)

    override val layoutResource: Int
        get() = R.layout.activity_login

    override fun initVariable(savedInstanceState: Bundle?) {
        viewDataBinding?.btnLogin?.setOnClickListener(this)

    }

    override fun initData(savedInstanceState: Bundle?) {
        changeColorStatusBar()
    }

    override fun onClick(v: View?) {
        when(v?.id){
        }
    }

}