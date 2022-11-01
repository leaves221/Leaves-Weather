package com.example.weather.service

import android.annotation.SuppressLint
import android.content.Context
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager

/**
 * 定位服务
 * */
object LocationService: LocationListener {

    var location: Location? = null
        private set

    private var locationManager: LocationManager? = null

    /**
     * 初始化locationManager
     * */
    fun init(context: Context) {

        locationManager = context.getSystemService(LocationManager::class.java)
    }

    /**
     * 开始定位
     * */
    @SuppressLint("MissingPermission")
    fun beginLocation() {
        if(locationManager == null) throw Exception("未初始化LocationManager")

        locationManager?.requestLocationUpdates(LocationManager.PASSIVE_PROVIDER, 0, 0f, this)
    }


    override fun onLocationChanged(location: Location) {
        this.location = location
    }
}