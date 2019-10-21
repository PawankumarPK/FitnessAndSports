package com.example.fitnessandsports.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.fitnessandsports.R


class SplashScreen : AppCompatActivity() {

    private val SPLASH_DISPLAY_LENGTH = 2000

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        setContentView(R.layout.activity_splash_screen)
        Handler().postDelayed({
            val intent = Intent(this, BaseActivity::class.java)
            startActivity(intent)
            this.finish()
        }, SPLASH_DISPLAY_LENGTH.toLong())
    }
}