package com.bsuir.oitip.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bsuir.oitip.lab1.fragments.Main
import com.bsuir.oitip.lab1.ui.CalcVH

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.content, Main.newInstance(), "dogList")
                .commit()
        }
    }

}