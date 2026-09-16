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
        // Виправлено: перевірка логіну без урахування регістру
        return cleanUser.equals("admin", ignoreCase = true) && password == "secure123"
    }
}
