package com.example.belajarrecycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list.view.*

class Adapter(private val ds_users:ArrayList<Users>) : RecyclerView.Adapter<Adapter.Holder>() {

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.list, parent, false))
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount(): Int = ds_users.size

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.myview.lbList.text = ds_users.get(position).name

        holder.myview.setOnClickListener{
            Toast.makeText(holder.myview.context, "Halo " + ds_users.get(position).name, Toast.LENGTH_SHORT).show()
        }
    }

    class Holder(val myview: View) : RecyclerView.ViewHolder(myview)

}