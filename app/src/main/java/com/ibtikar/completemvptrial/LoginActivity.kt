package com.ibtikar.completemvptrial

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), Contract.View {

    lateinit var presenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        presenter = LoginPresenter(this, LoginModel())

        initClickListeners()
    }

    private fun initClickListeners() {
        btn_login.setOnClickListener {
            presenter.onLogin()
        }
    }

    override fun getUserName(): String {
        return et_user_name.text.toString()
    }

    override fun getPassword(): String {
        return et_password.text.toString()
    }

    override fun showErrorMsg(msg: Int) {
        tv_msg.text = getString(msg)
    }

    override fun showErrorMsg(msg: String) {
        tv_msg.text = msg
    }
}
