package com.example.examentecnicok.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.examentecnicok.R
import com.example.examentecnicok.contracts.LoginContract
import com.example.examentecnicok.presenters.LoginPresenter

class LoginView(var loginPresenter: LoginPresenter?) : AppCompatActivity(), LoginContract.View {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_view)
    }

    override fun initElements() {

    }

    override fun showMessage(message: String) {
        TODO("Not yet implemented")
    }

    override fun showErrorPassword(message: String) {
        TODO("Not yet implemented")
    }

    override fun showErrorUser(message: String) {
        TODO("Not yet implemented")
    }

    override fun showProgressBar() {
        TODO("Not yet implemented")
    }

    override fun hideProgressBar() {
        TODO("Not yet implemented")
    }

    override fun sessionSuccess() {
        TODO("Not yet implemented")
    }
}