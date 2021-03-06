package com.example.fitnessandsports.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fitnessandsports.R
import com.example.fitnessandsports.fragmentSubCatagories.BaseFragment
import android.widget.Toast
import com.example.fitnessandsports.activity.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_auth.*


/**
 * A simple [Fragment] subclass.
 */
class AuthFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_auth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        baseActivity = activity as BaseActivity
        baseActivity.mToolbarTextview.text= "Authenticatiion"
        baseActivity.mCoin.visibility = View.GONE

        mDone.setOnClickListener { homeCat() }
    }

    private fun homeCat(){
        fragmentManager!!.beginTransaction().addToBackStack(null)
            .replace(R.id.mFrameLayout,HomeCategory())
            .commit()
    }


/*

    fun SignIn(view: View) {

        val username = usernameET.getText().toString()
        val password = passwordET.getText().toString()

        if (username == "cake" && password == "robot") {
            Toast.makeText(this, "You Signed In", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Invalid Login", Toast.LENGTH_SHORT).show()
        }
    }
*/


}
