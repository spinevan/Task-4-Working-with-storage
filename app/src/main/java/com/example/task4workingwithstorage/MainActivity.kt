package com.example.task4workingwithstorage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.task4workingwithstorage.interfaces.IServiceRequestListener
import com.example.task4workingwithstorage.ui.main.MainFragment

class MainActivity : AppCompatActivity(), IServiceRequestListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }

    override fun delete() {
        TODO("Not yet implemented")
    }

    override fun add() {
        TODO("Not yet implemented")
    }
}