package com.example.weatherprojecttest.screen.main.login

import android.util.Log
import android.widget.Toast
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableField
import androidx.databinding.ObservableList
import androidx.lifecycle.MutableLiveData
import com.example.weatherprojecttest.screen.base.viewmodel.BaseViewModel
import javax.inject.Inject

class LoginViewModel @Inject constructor() : BaseViewModel() {
    val mEmail: ObservableField<String> = ObservableField()
    val mPass: ObservableField<String> = ObservableField()
    val loading = MutableLiveData<Boolean>()

    init {
        loading.value=false
        loadData()
    }

    private fun loadData() {
        loading.postValue(false)
    }


}