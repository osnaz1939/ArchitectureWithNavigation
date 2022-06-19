package ost.host.architecturewithnavigation

import android.app.Application
import androidx.navigation.NavController
import ost.host.base_interfaces.BaseNavigationApplication
import ost.host.navigation.NavigationExtensions
import ost.host.navigation.NavigationUtils

class App: Application(), BaseNavigationApplication {

    private lateinit var baseNavigator: NavigationExtensions

    override fun onCreate() {
        super.onCreate()
        baseNavigator = NavigationUtils()
    }


    override fun navigateToSharedModule(controller: NavController,param:String) {
        baseNavigator.navigateWithBackStackToSharedModule(controller,param)
    }


}