package com.supri

import org.junit.Test
import org.junit.Assert.*

class UserAuthTest {

    private val auth = UserAuth()

    @Test
    fun testSuccessfulLogin() {
        assertTrue(auth.login("admin", "secure123"))
        assertTrue(auth.login("ADMIN", "secure123"))
    }

    @Test
    fun testInvalidPassword() {
        assertFalse(auth.login("admin", "wrongpassword"))
    }

    @Test
    fun testNullOrEmptyCredentials() {
        assertFalse(auth.login(null, null))
        assertFalse(auth.login("", "secure123"))
    }

    @Test
    fun testShortPassword() {
        assertFalse(auth.login("admin", "123"))
    }
}

    @Test
    fun testPasswordStrength() {
        assertTrue(auth.isPasswordStrong("SecurePass1"))
        assertFalse(auth.isPasswordStrong("weak"))
        assertFalse(auth.isPasswordStrong("12345678"))
    }
}
