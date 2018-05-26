package com.reptil.panda.euphoria.Component

import dagger.Component
import com.reptil.panda.euphoria.MainActivity
import com.reptil.panda.euphoria.Module.AppModule
import com.reptil.panda.euphoria.Module.CryptoNetworkModule
import com.reptil.panda.euphoria.ui.home.HomeActivity //checkout
import com.reptil.panda.euphoria.ui.splash.SplashActivity //checkout
import javax.inject.Singleton


@Singleton
@Component(modules = [
    (AppModule::class),
    (CryptoNetworkModule::class)
])
interface CryptoTrackerDeps {
    fun inject(mainActivity: MainActivity)

    fun inject(splashActivity: SplashActivity)

    fun inject(homeActivity: HomeActivity)
}