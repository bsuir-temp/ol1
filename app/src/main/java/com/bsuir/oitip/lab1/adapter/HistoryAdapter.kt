package com.bsuir.oitip.lab1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bsuir.oitip.lab1.R
import com.bsuir.oitip.lab1.model.Expression

class HistoryAdapter(private val list: ArrayList<Expression>) :
    RecyclerView.Adapter<HistoryAdapter.ExpressionVH>() {

    class ExpressionVH(root: View) : RecyclerView.ViewHolder(root)
    {
        val expression = root.findViewById<TextView>(R.id.expression)
        val result = root.findViewById<TextView>(R.id.result)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryAdapter.ExpressionVH {
        val root = LayoutInflater.from(parent.context).inflate(R.layout.fragment_history_item, parent, false)
        return ExpressionVH(root)
    }

    override fun onBindViewHolder(holder: ExpressionVH, position: Int) {
        holder.expression.text = list[position].expression
        holder.result.text = list[position].result
    }

    override fun getItemCount() = list.size
}