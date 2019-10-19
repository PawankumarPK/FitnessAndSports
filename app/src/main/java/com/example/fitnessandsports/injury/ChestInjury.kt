package com.example.fitnessandsports.injury


import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fitnessandsports.R
import com.example.fitnessandsports.fragmentSubCatagories.BaseFragment
import com.example.fitnessandsports.utils.Data
import kotlinx.android.synthetic.main.fragment_chest_injury.*
import java.util.*
import kotlin.collections.ArrayList

/**
 * A simple [Fragment] subclass.
 */
class ChestInjury : BaseFragment() {


    var horizontal_recycler_view: RecyclerView? = null
    var horizontalAdapter: HorizontalAdapter? = null
    private var data: List<Data>? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_chest_injury, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        data = fill_with_data()

        horizontalAdapter = HorizontalAdapter(data!!, baseActivity)
        val horizontalLayoutManager =
            LinearLayoutManager(baseActivity, LinearLayoutManager.HORIZONTAL, false)
        mRecyclerview!!.layoutManager = horizontalLayoutManager
        mRecyclerview!!.adapter = horizontalAdapter


    }

    fun fill_with_data(): List<Data> {

        val data = ArrayList<Data>()!!

        data.add(Data(R.drawable.neck))
        data.add(Data(R.drawable.shoulder))


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




}

