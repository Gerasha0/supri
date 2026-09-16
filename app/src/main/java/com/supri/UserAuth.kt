package com.supri

class UserAuth {
    fun login(username: String?, password: String?): Boolean {
        if (username.isNullOrBlank() || password.isNullOrBlank()) {
            return false
        }
        val cleanUser = username.trim()
        if (cleanUser.isEmpty() || password.length < 6) {
            return false
        }
        return cleanUser.equals("admin", ignoreCase = true) && password == "secure123"
    }

    // Нова фіча: перевірка надійності пароля
    fun isPasswordStrong(password: String?): Boolean {
        if (password == null || password.length < 8) return false
        val hasDigit = password.any { it.isDigit() }
        val hasLetter = password.any { it.isLetter() }
        return hasDigit && hasLetter
    }
}
