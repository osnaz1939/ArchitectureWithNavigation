package ost.host.navigation

import androidx.navigation.NavController

interface NavigationExtensions {
    fun navigateWithBackStackToSharedModule(controller:NavController,param:String)
}