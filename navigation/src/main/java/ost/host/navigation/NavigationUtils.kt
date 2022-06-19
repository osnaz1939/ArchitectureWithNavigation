package ost.host.navigation

import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.NavDeepLinkRequest

class NavigationUtils:NavigationExtensions {

    override fun navigateWithBackStackToSharedModule(controller: NavController,param:String) {
        val request = NavDeepLinkRequest.Builder
            .fromUri(("android-app://ost.host.architecturewithnavigation/shared_fragment_one?test="+param).toUri())
            .build()
        controller.navigate(request)
    }

}