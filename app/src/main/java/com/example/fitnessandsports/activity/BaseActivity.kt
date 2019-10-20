package com.example.fitnessandsports.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fitnessandsports.R
import com.example.fitnessandsports.fragment.AuthFragment
import com.example.fitnessandsports.fragment.WalletFragment
import com.example.fitnessandsports.fragmentSubCatagories.CategoriesFragment
import kotlinx.android.synthetic.main.activity_main.*

class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadFragment()
        mCoin.setOnClickListener { coinFragment() }
    }

    private fun loadFragment(){
        supportFragmentManager.beginTransaction().addToBackStack(null)
            .replace(R.id.mFrameLayout,AuthFragment())
            .commit()
    }


    private fun coinFragment(){
        supportFragmentManager.beginTransaction().addToBackStack(null)
            .replace(R.id.mFrameLayout,WalletFragment())
            .commit()
    }
}
