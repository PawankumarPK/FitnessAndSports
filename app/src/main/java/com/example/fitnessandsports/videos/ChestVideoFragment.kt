package com.example.fitnessandsports.videos


import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import androidx.fragment.app.Fragment
import com.example.fitnessandsports.R
import com.example.fitnessandsports.fragmentSubCatagories.BaseFragment
import kotlinx.android.synthetic.main.fragment_chest_video.*

/**
 * A simple [Fragment] subclass.
 */
class ChestVideoFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_chest_video, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        playVideo()
    }

    private fun playVideo() {
        val mc = MediaController(baseActivity)
        videoView.setMediaController(mc)
        val path = "android.resource://" + baseActivity!!.packageName + "/" + R.raw.chestvdo
        val uri = Uri.parse(path)
        videoView.setVideoURI(uri)
        videoView.start()

    }


}
