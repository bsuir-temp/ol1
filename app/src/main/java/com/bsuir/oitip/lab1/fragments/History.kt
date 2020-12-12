package com.bsuir.oitip.lab1.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bsuir.oitip.lab1.R
import com.bsuir.oitip.lab1.adapter.HistoryAdapter
import com.bsuir.oitip.lab1.model.Expression

class History : Fragment() {

    companion object {
        var list:ArrayList<Expression> = ArrayList()

        fun newInstance(): History {
            return History()
        }
    }

    lateinit var recyclerView: RecyclerView

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_history, container, false)
        val viewManager = LinearLayoutManager(context)
        recyclerView = view.findViewById<RecyclerView>(R.id.list) .apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = HistoryAdapter(list)
        }
        return view
    }

}