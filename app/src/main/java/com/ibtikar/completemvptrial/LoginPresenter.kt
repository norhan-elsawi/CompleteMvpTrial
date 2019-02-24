package com.ibtikar.completemvptrial

class LoginPresenter : Contract.Presenter {

    var view: Contract.View
    var model: Contract.Model

    constructor(view: Contract.View, model: Contract.Model) {
        this.view = view
        this.model = model
    }

    override fun onLogin() {
        validateUserName()
    }

    private fun validateUserName() {
        val userName = view.getUserName()
        if (userName.isEmpty())
            view.showErrorMsg("empty string")

    }
}