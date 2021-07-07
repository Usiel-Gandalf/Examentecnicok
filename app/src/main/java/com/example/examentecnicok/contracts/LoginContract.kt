package com.example.examentecnicok.contracts

import android.content.Context
import com.google.firebase.auth.FirebaseAuth

interface LoginContract {

    interface View{

        fun initElements()

        fun showMessage(message: String)

        fun showErrorPassword(message: String)

        fun showErrorUser(message: String)

        fun showProgressBar()

        fun hideProgressBar()

        fun sessionSuccess()
    }

    interface Presenter{

        fun showMessage(message: String)

        fun validatePasswordLenght(password: String): Boolean

        fun validateAlphaPassword(password: String): Boolean

        fun validateTypeUserEmail(email: String): Boolean

        fun isUserEmpty(email: String): Boolean

        fun isPasswordEmpty(password: String): Boolean

        fun sessionSuccess()

        fun session(email: String, password: String, auth: FirebaseAuth, context: Context)

        fun createUser(email: String, password: String, auth: FirebaseAuth, context: Context)

    }

    interface Model{
        fun sesionFBase(email: String, password: String, listener: LoginContract.Presenter, auth: FirebaseAuth, context: Context)

        fun createFBaseUser(email: String, password: String, listener: LoginContract.Presenter, auth: FirebaseAuth, context: Context)
    }

}