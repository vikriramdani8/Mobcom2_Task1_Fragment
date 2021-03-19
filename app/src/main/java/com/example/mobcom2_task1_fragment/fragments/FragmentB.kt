package com.example.mobcom2_task1_fragment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mobcom2_task1_fragment.R
import kotlinx.android.synthetic.main.fragment_b.view.*

class FragmentB : Fragment() {

    var displayMessage: String? = "Wowowo"

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_b, container, false)
        displayMessage = arguments?.getString("message")

        view.displayMessage.text = displayMessage
        return view
    }
}