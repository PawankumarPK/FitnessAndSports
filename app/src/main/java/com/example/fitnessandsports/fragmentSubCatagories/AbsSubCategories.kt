package com.example.fitnessandsports.fragmentSubCatagories


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.fitnessandsports.R

/**
 * A simple [Fragment] subclass.
 */
class AbsSubCategories : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_abs_sub_categories, container, false)
    }


}
