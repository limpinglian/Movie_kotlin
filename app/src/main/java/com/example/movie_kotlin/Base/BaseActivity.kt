package com.example.movie_kotlin.Base

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

abstract class  BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(setLayoutResourceId())
    }

    protected abstract fun setLayoutResourceId(): Int
}
