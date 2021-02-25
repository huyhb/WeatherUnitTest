package com.example.weatherprojecttest.screen.base.viewmodel

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

abstract class BaseViewModel : ViewModel() {
    val compoDisposable = CompositeDisposable() //Thư viện RxAndroid

    fun addDisposable(disposable: Disposable) {
        compoDisposable.add(disposable)
    }

    fun activityDestroyed() {
        compoDisposable.clear()
    }
}