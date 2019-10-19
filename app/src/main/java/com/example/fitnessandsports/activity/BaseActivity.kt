package com.example.fitnessandsports.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fitnessandsports.R
import com.example.fitnessandsports.fragmentSubCatagories.CategoriesFragment

class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadFragment()
    }

    private fun loadFragment(){
        supportFragmentManager.beginTransaction().addToBackStack(null)
            .replace(R.id.mFrameLayout,CategoriesFragment())
            .commit()
    }
}
