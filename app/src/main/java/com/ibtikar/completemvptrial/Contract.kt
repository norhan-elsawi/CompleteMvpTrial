package com.ibtikar.completemvptrial

interface Contract {

    interface View {
        fun getUserName(): String
        fun getPassword(): String
        fun showErrorMsg(msg: Int)

        fun showErrorMsg(msg: String)

    }

    interface Model {

    }

    interface Presenter {
        fun onLogin()
    }
}