package com.reptil.panda.euphoria.Module

import dagger.Module
import android.content.Context
import dagger.Provides
import javax.inject.Singleton


@Module
class AppModule(private val context: Context) {
    @Provides
    @Singleton
    fun providesContext(): Context {
        return context
    }
}