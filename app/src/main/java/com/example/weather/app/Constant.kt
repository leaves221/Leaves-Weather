package com.example.weather.app


import com.qweather.sdk.view.HeConfig


//存放常量的类
object Constant {
    // api id
    const val API_PUBLIC_ID = "HE2210311349181928"
    //api key
    const val API_PRIVATE_KEY = ""

    init {
        //全局执行一次初始化
        HeConfig.init(API_PUBLIC_ID,  API_PRIVATE_KEY)
        HeConfig.switchToDevService() //切换至免费版本
    }

}