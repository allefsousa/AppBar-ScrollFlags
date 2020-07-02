package com.developer.allef.boilerplateapp

import android.app.Application
import timber.log.Timber

/**
 * @author allef.santos on 2019-11-21
 */
class appApplication :Application(){

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())

    }
}