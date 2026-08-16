package com.phoneboost.ai.data.local

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

private val Context.dataStore by preferencesDataStore(name = "phoneboost_settings")

class SettingsDataStore(private val context: Context) {

    private object Keys {
        val DARK_THEME = booleanPreferencesKey("dark_theme")
        val LANGUAGE = stringPreferencesKey("language")
        val NOTIFICATIONS = booleanPreferencesKey("notifications_enabled")
        val ANIMATIONS = booleanPreferencesKey("animations_enabled")
    }

    val isDarkTheme: Flow<Boolean> = context.dataStore.data.map { it[Keys.DARK_THEME] ?: true }
    val language: Flow<String> = context.dataStore.data.map { it[Keys.LANGUAGE] ?: "ar" }
    val notificationsEnabled: Flow<Boolean> = context.dataStore.data.map { it[Keys.NOTIFICATIONS] ?: true }
    val animationsEnabled: Flow<Boolean> = context.dataStore.data.map { it[Keys.ANIMATIONS] ?: true }

    suspend fun setDarkTheme(enabled: Boolean) { context.dataStore.edit { it[Keys.DARK_THEME] = enabled } }
    suspend fun setLanguage(code: String) { context.dataStore.edit { it[Keys.LANGUAGE] = code } }
    suspend fun setNotificationsEnabled(enabled: Boolean) { context.dataStore.edit { it[Keys.NOTIFICATIONS] = enabled } }
    suspend fun setAnimationsEnabled(enabled: Boolean) { context.dataStore.edit { it[Keys.ANIMATIONS] = enabled } }
}
