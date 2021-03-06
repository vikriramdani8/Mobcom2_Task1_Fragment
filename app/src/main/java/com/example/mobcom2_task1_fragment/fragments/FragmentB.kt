package com.example.mobcom2_task1_fragment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mobcom2_task1_fragment.Communicator
import com.example.mobcom2_task1_fragment.R
import kotlinx.android.synthetic.main.fragment_b.*
import kotlinx.android.synthetic.main.fragment_b.view.*

class FragmentB : Fragment() {

    var displayMessage: String? = "Wowowo"
    private lateinit var communicator: Communicator

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_b, container, false)
        displayMessage = arguments?.getString("message")
        communicator = activity as Communicator
        view.back.setOnClickListener {
            communicator.back()
        }

        view.displayMessage.text = displayMessage
        return view
    }
}