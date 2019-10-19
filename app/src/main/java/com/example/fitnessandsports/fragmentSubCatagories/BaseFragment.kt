package com.example.fitnessandsports.fragmentSubCatagories


import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fitnessandsports.activity.BaseActivity

open class BaseFragment : Fragment() {

    lateinit var baseActivity: BaseActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        baseActivity = activity as BaseActivity

    }

}
