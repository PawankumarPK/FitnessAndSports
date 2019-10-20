package com.example.fitnessandsports.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.fitnessandsports.R
import com.example.fitnessandsports.activity.BaseActivity
import com.example.fitnessandsports.fragmentSubCatagories.BaseFragment
import com.example.fitnessandsports.fragmentSubCatagories.CategoriesFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home_category.*

/**
 * A simple [Fragment] subclass.
 */
class HomeCategory : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home_category, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        baseActivity = activity as BaseActivity
        baseActivity.mToolbarTextview.text= "Select Exercise Type"
        baseActivity.mCoin.visibility = View.GONE

        mGym.setOnClickListener { homeCat() }

    }

    private fun homeCat(){
        fragmentManager!!.beginTransaction().addToBackStack(null)
            .replace(R.id.mFrameLayout,CategoriesFragment())
            .commit()
    }

}
