package com.example.fitnessandsports.fragmentSubCatagories


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.fitnessandsports.R
import com.example.fitnessandsports.activity.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_categories.*

class CategoriesFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_categories, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        baseActivity = activity as BaseActivity
        baseActivity.mToolbarTextview.text= "Categories"

        mRelativeLayoutChest.setOnClickListener { chest() }
        mRelativeLayoutBack.setOnClickListener { back() }
        mRelativeLayoutBiceps.setOnClickListener { biceps() }
        mRelativeLayoutLegs.setOnClickListener { legs() }
        mRelativeLayoutAbs.setOnClickListener { abs() }

    }
    private fun chest(){
        fragmentManager!!.beginTransaction().addToBackStack(null)
            .replace(R.id.mFrameLayout,ChestSubCategories())
            .commit()
    }


    private fun biceps(){
        fragmentManager!!.beginTransaction().addToBackStack(null)
            .replace(R.id.mFrameLayout,BicepsSubCatagories())
            .commit()
    }


    private fun back(){
        fragmentManager!!.beginTransaction().addToBackStack(null)
            .replace(R.id.mFrameLayout,BackSubCatagories())
            .commit()
    }


    private fun abs(){
        fragmentManager!!.beginTransaction().addToBackStack(null)
            .replace(R.id.mFrameLayout,AbsSubCategories())
            .commit()
    }

    private fun legs(){
        fragmentManager!!.beginTransaction().addToBackStack(null)
            .replace(R.id.mFrameLayout,LegsSubCatagories())
            .commit()
    }



}
