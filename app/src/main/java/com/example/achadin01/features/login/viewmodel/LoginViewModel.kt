package com.example.achadin01.features.login.viewmodel

import androidx.lifecycle.ViewModel
import com.example.achadin01.features.login.action.LoginActions
import com.example.achadin01.features.login.state.LoginState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class LoginViewModel: ViewModel() {

    private val _state = MutableStateFlow(LoginState())
    var state: StateFlow<LoginState> = _state

    init {

    }

    fun Action (action: LoginActions) {

    }
}