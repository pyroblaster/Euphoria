package com.reptil.panda.euphoria.Component

import dagger.Component
import com.reptil.panda.euphoria.MainActivity
import com.reptil.panda.euphoria.Module.AppModule
import com.reptil.panda.euphoria.Module.CryptoNetworkModule
import javax.inject.Singleton


@Singleton
@Component(modules = [
    (AppModule::class),
    (CryptoNetworkModule::class)
])
interface CryptoTrackerDeps {

    fun inject(mainActivity: MainActivity)
}