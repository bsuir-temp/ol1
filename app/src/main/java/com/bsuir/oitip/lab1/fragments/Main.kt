package com.bsuir.oitip.lab1.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bsuir.oitip.lab1.R
import com.bsuir.oitip.lab1.ui.CalcVH

class Main : Fragment() {

    companion object {
        fun newInstance(): Main {
            return Main()
        }
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_main, container, false)
        val holder = CalcVH()
        holder.map(view,fragmentManager!!)
        return view
    }



}