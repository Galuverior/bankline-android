package com.github.bankline_android.ui.statement

import androidx.lifecycle.ViewModel
import com.github.bankline_android.data.BanklineRepository

class BankStatementViewModel : ViewModel() {

    fun findBankStatement(accountHolderId: Int) =
        BanklineRepository.findBankStatement(accountHolderId)
}