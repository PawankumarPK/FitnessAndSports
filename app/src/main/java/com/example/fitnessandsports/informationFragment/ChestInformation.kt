package com.example.fitnessandsports.informationFragment


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.fitnessandsports.fragmentSubCatagories.BaseFragment
import androidx.recyclerview.widget.RecyclerView
import com.example.fitnessandsports.R

import com.example.fitnessandsports.utils.Data
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fitnessandsports.activity.BaseActivity
import com.example.fitnessandsports.injury.ChestInjury
import com.example.fitnessandsports.videos.ChestVideoFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_chest_information.*
import java.util.*
import kotlin.collections.ArrayList
import android.os.CountDownTimer
import com.example.fitnessandsports.informationFragment.ChestInformation.MyCounter


/**
 * A simple [Fragment] subclass.
 */
class ChestInformation : BaseFragment() {

    var horizontal_recycler_view: RecyclerView? = null
    var horizontalAdapter: HorizontalAdapter? = null
    private var data: List<Data>? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_chest_information, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        baseActivity = activity as BaseActivity
        baseActivity.mToolbarTextview.text= "Workout"

        data = fill_with_data()

        val timer = MyCounter(60000, 1000)

        horizontalAdapter = HorizontalAdapter(data!!, baseActivity)
        val horizontalLayoutManager = LinearLayoutManager(baseActivity, LinearLayoutManager.HORIZONTAL, false)
        mRecyclerview!!.layoutManager = horizontalLayoutManager
        mRecyclerview!!.adapter = horizontalAdapter

        mStartTimer.setOnClickListener {
            timer.start()
            mStartTimer.visibility = View.GONE
            mTimer.visibility = View.VISIBLE
            mSetComplete.visibility = View.GONE

        }

        videoFB.setOnClickListener {
            fragmentManager!!.beginTransaction().addToBackStack(null)
                .replace(R.id.mFrameLayout,ChestVideoFragment())
                .commit()
        }

        injuryFB.setOnClickListener {
            fragmentManager!!.beginTransaction().addToBackStack(null)
                .replace(R.id.mFrameLayout,ChestInjury())
                .commit()
        }


    }


    fun fill_with_data(): List<Data> {

        val data = ArrayList<Data>()
        data.add(Data(R.drawable.bench))
        data.add(Data(R.drawable.benchpresses))
        data.add(Data(R.drawable.benchpressestwo))
        data.add(Data(R.drawable.benchpressesthree))

        return data
    }

    class HorizontalAdapter(horizontalList: List<Data>, internal var context: Context) :
        RecyclerView.Adapter<HorizontalAdapter.MyViewHolder>() {

        private var horizontalList = Collections.emptyList<Data>()
        init {
            this.horizontalList = horizontalList
        }

        inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

            internal var imageView: ImageView

            init {
                imageView = view.findViewById(R.id.mImageView) as ImageView
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            val itemView =
                LayoutInflater.from(parent.context).inflate(R.layout.view_holder, parent, false)

            return MyViewHolder(itemView)
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

            holder.imageView.setImageResource(horizontalList.get(position).imageId)


        }

        override fun getItemCount(): Int {
            return horizontalList.size
        }
    }


    inner class MyCounter(millisInFuture: Long, countDownInterval: Long) :
        CountDownTimer(millisInFuture, countDownInterval) {

        override fun onFinish() {
            println("Timer Completed.")
            mTimer.text = "Set Complete 2 more sets left.."
            mStartTimer.visibility = View.VISIBLE
            mTimer.visibility = View.GONE
            mSetComplete.visibility = View.VISIBLE

        }

        override fun onTick(millisUntilFinished: Long) {
            mTimer.text = (millisUntilFinished / 1000).toString() + ""
            println("Timer  : " + millisUntilFinished / 1000)
        }
    }

}
