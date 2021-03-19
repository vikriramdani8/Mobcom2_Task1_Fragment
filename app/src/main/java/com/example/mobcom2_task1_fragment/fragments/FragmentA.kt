package com.example.mobcom2_task1_fragment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mobcom2_task1_fragment.Communicator
import com.example.mobcom2_task1_fragment.R
import kotlinx.android.synthetic.main.fragment_a.view.*

class FragmentA : Fragment() {

    private lateinit var communicator: Communicator

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_a, container, false)
        communicator = activity as Communicator
        view.sendBtn.setOnClickListener {
            communicator.passDataCom(view.messageInput.text.toString())
        }

        return view
    }
}