package com.compose.streamfx.navigation

import androidx.navigation.NavHostController

class AppNavigator(
    private val navController: NavHostController
) {
    fun navigateToAuth() = navController.navigate("auth")
    fun navigateToCall() = navController.navigate("call")
    fun navigateToContacts() = navController.navigate("contacts")
    fun navigateToSettings() = navController.navigate("settings")

    fun popBack() = navController.popBackStack()
}