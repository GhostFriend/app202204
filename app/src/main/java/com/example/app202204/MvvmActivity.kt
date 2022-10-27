package com.example.app202204

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider

class MvvmActivity : AppCompatActivity() {

    private lateinit var viewModel : My01ViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvvm)

        viewModel = ViewModelProvider(this).get(My01ViewModel::class.java)
    }





    /*
            <activity
            android:name=".MvvmActivity"
            android:exported="false" />

     */
}