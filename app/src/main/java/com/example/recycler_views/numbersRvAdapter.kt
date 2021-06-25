package com.example.recycler_views

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class numbersRvAdapter(var numberList: List<BigInteger>):RecyclerView.Adapter<numbersViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): numbersViewHolder {
       var itemView=LayoutInflater.from(parent.context).inflate(R.layout.number_list,parent,false)
        return numbersViewHolder(itemView)
    }
//
    override fun onBindViewHolder(holder: numbersViewHolder, position: Int) {
    //get element from that data set with this position and replace the view with that element
       holder.tvNumbers.text=numberList.get(position).toString()
    }
//recycler view uses this to determine when there are no more items to be displayed
    override fun getItemCount(): Int {
        return numberList.size
    }
}
class numbersViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvNumbers=itemView.findViewById<TextView>(R.id.tvNumbers)
}