package com.example.weather.app

import com.google.gson.Gson


//gson的单例
object GsonInstance {
     var gson: Gson? = null
         get() {
            if(field == null) gson = Gson()
            return field
        }
}