package com.example.weather

import com.qweather.sdk.view.HeConfig
import com.qweather.sdk.view.QWeather
import kotlinx.coroutines.flow.flow

object Constant {
    // api id
    const val API_PUBLIC_ID = "HE2210311349181928"
    //api key
    const val API_PRIVATE_KEY = ""

    init {
        //全局执行一次初始化
        HeConfig.init("PublicId", "PrivateKey")
        
    }

}