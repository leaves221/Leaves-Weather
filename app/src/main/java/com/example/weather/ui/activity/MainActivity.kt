package com.example.weather.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.weather.R
import com.example.weather.app.Constant
import com.example.weather.app.ContextHelper
import com.example.weather.databinding.ActivityMainBinding
import com.example.weather.ui.viewmodel.MainViewModel
import com.qweather.sdk.view.HeConfig


//主启动的activity
class MainActivity : AppCompatActivity() {
    //视图绑定初始化
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    //viewmodel初始化
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
        ContextHelper.context = this.baseContext

        //全局执行一次初始化
        HeConfig.init(Constant.API_PUBLIC_ID, Constant.API_PRIVATE_KEY)
        HeConfig.switchToDevService()
        //切换至免费版本

    }


}