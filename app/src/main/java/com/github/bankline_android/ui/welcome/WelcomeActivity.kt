package com.github.bankline_android.ui.welcome

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.bankline_android.databinding.ActivityWelcomeBinding
import com.github.bankline_android.domain.Correntista
import com.github.bankline_android.ui.statement.BankStatementActivity

class WelcomeActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityWelcomeBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btContinue.setOnClickListener {
            val accountHolderId = binding.etAccountHolderId.text.toString().toInt()
            var accountHolder = Correntista(accountHolderId)

            val intent = Intent(this, BankStatementActivity::class.java).apply {
                putExtra(BankStatementActivity.EXTRA_ACCOUNT_HOLDER, accountHolder)
            }
            startActivity(intent)
        }
    }
}

//TODO Melhoria (fácil): validar o preenchimento do ID do Correntista, exibindo um Snackbar em caso de erro.
//TODO Melhoria (difícil): evoluir a API para recuperar um Correntista por ID, permitindo assim o envio de mais informações para a próxima tela.