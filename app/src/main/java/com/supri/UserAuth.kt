package com.supri

class UserAuth {
    fun login(username: String?, password: String?): Boolean {
        if (username.isNullOrBlank() || password.isNullOrBlank()) {
            return false
        }
        if (password.length < 6) {
            return false
        }
        return username.trim() == "admin" && password == "secure123"
    }
}
