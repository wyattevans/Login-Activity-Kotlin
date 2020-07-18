package com.app.loginactivitykotlin.ui.login

data class LoginResult(
        val success: LoggedInUserView? = null,
        val error: Int? = null
)
