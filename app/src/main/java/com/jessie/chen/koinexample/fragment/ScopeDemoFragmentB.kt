package com.jessie.chen.koinexample.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jessie.chen.koinexample.R
import com.jessie.chen.koinexample.model.Dog
import kotlinx.android.synthetic.main.fragment_scope_demo.*
import org.koin.android.ext.android.inject


class ScopeDemoFragmentB : Fragment() {

    private val dog: Dog by inject()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_scope_demo, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        fragmentTextView.text = "Fragment B \n$dog"
    }


}
