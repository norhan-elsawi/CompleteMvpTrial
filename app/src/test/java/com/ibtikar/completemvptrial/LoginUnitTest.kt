package com.ibtikar.completemvptrial

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class LoginUnitTest {

    @Mock
    lateinit var loginView: Contract.View

    @Mock
    lateinit var loginPresenter: Contract.Presenter

    @Mock
    lateinit var loginModel: Contract.Model

    @Before
    fun setUp() {
        loginPresenter = LoginPresenter(loginView, loginModel)
    }


    @Test
    fun testEmptyUserName() {
        Mockito.doReturn("").`when`(loginView).getUserName()
        loginPresenter.onLogin()
        Mockito.verify(loginView).showErrorMsg("mahmoud")
    }
}