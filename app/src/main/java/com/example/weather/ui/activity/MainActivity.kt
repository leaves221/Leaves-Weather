package com.example.weather.ui.activity

import android.Manifest
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.weather.app.Constant
import com.example.weather.databinding.ActivityMainBinding
import com.example.weather.ui.viewmodel.MainViewModel
import com.qweather.sdk.view.HeConfig


//主启动的activity
class MainActivity : AppCompatActivity() {


    //视图绑定初始化
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    //viewModel初始化
    private val viewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        firstInitialize()

        setContentView(binding.root)
    }





    /**
     * 初始化一系列内容
     * */
    private fun firstInitialize() {
        //获取权限
        checkPermission()

        //全局执行一次初始化
        HeConfig.init(Constant.API_PUBLIC_ID, Constant.API_PRIVATE_KEY)

        //切换至免费版本
        HeConfig.switchToDevService()

    }



    private fun checkPermission() {
        val permissions = arrayOf(Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.INTERNET)

        requestPermissions(permissions, 100)
    }


}