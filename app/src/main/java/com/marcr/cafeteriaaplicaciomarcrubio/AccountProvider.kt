package com.marcr.aplicaciologinbdmarcrubio

class AccountProvider {
    companion object {

        private val quotes = mutableListOf<AccountModel>(
            AccountModel(user= "Marc", password = "1234",),
            AccountModel(user= "Dani", password = "1234",),
            AccountModel(user= "Gerard", password = "1234",),
            AccountModel(user= "Santi", password = "1234",),
            AccountModel(user= "Pepe", password = "1234",),
            AccountModel(user= "Carlos", password = "1234",),
        )
        fun getUser(user: String): AccountModel? {
            return quotes.find { it.user == user }
        }

        fun addUser(accountModel: AccountModel) {
            quotes.add(accountModel)
        }
    }
}