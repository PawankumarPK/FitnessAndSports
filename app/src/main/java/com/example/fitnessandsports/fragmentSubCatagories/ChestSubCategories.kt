package com.example.fitnessandsports.fragmentSubCatagories


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.fitnessandsports.R
import com.example.fitnessandsports.activity.BaseActivity
import com.example.fitnessandsports.informationFragment.ChestInformation
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_chest_sub_categories.*


class ChestSubCategories : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_chest_sub_categories, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        baseActivity = activity as BaseActivity
        baseActivity.mToolbarTextview.text= "Chest"
        baseActivity.mCoin.visibility = View.GONE
        mRelativeLayoutOne.setOnClickListener { chest() }
    }
    private fun chest(){
        fragmentManager!!.beginTransaction().addToBackStack(null)
            .replace(R.id.mFrameLayout,ChestInformation())
            .commit()
    }



}
