package br.com.alura.aluraesporte.repository

import android.content.SharedPreferences
import androidx.core.content.edit

private const val CHAVE_LOGADO = "LOGADO"

class LoginRepository(private val preferences: SharedPreferences) {

    fun logar() =   salvar(true)

    fun estaLogado(): Boolean = preferences.getBoolean(CHAVE_LOGADO, false)

    fun deslogar() =  salvar(false)

    private fun salvar(estado: Boolean) {
        preferences.edit {
            putBoolean("LOGADO", estado)
        }
    }

}
