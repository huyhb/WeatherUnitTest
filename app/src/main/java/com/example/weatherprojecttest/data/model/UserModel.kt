package com.example.weatherprojecttest.data.model

class UserModel {
    var _email : String? = null
    var _pass : String? = null
    var _phone : String? = null

    constructor(email: String, pass: String, phone: String){
        this._email = email
        this._pass = pass
        this._phone = phone
    }

    var email: String?
        get() = this._email
        set(value) {
            this._email = value
        }

    var pass: String?
        get() = this._pass
        set(value) {
            this._pass = value
        }

    var phone: String?
        get() = this._phone
        set(value) {
            this._pass = value
        }

}