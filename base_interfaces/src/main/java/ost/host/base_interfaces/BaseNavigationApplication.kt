package ost.host.base_interfaces

import androidx.navigation.NavController

interface BaseNavigationApplication {
    fun navigateToSharedModule(controller: NavController,param:String)
}