package com.example.examentecnicok.presenters

import android.content.Context
import com.example.examentecnicok.contracts.LoginContract
import com.example.examentecnicok.models.LoginModel
import com.example.examentecnicok.views.LoginView
import com.google.firebase.auth.FirebaseAuth

class LoginPresenter(var loginView: LoginView?, var loginModel: LoginModel): LoginContract.Presenter {

    override fun showMessage(message: String) {
        TODO("Not yet implemented")
    }

    override fun validatePasswordLenght(password: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun validateAlphaPassword(password: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun validateTypeUserEmail(email: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun isUserEmpty(email: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun isPasswordEmpty(password: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun sessionSuccess() {
        TODO("Not yet implemented")
    }

    override fun session(email: String, password: String, auth: FirebaseAuth, context: Context) {
        TODO("Not yet implemented")
    }

    override fun createUser(email: String, password: String, auth: FirebaseAuth, context: Context) {
        TODO("Not yet implemented")
    }
}