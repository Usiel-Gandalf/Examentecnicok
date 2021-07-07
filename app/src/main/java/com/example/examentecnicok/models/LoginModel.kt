package com.example.examentecnicok.models

import android.content.Context
import com.example.examentecnicok.contracts.LoginContract
import com.google.firebase.auth.FirebaseAuth

class LoginModel: LoginContract.Model {

    override fun sesionFBase(email: String, password: String, listener: LoginContract.Presenter, auth: FirebaseAuth, context: Context) {

    }

    override fun createFBaseUser(email: String, password: String, listener: LoginContract.Presenter, auth: FirebaseAuth, context: Context) {

    }
}