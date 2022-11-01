package com.example.weather.app

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class App : Application(){

    companion object {
        private var instance: App? = null

        /**
         * 返回 Application 实例
         * */
        fun getInstance(): App? = instance


        /**
         * 返回 Context
         * */
        fun getContext(): Context? = instance?.applicationContext
    }


    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}