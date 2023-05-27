package com.dkgtech.whatsapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dkgtech.whatsapp.R
import com.dkgtech.whatsapp.models.CallModel

class RecyclerCallAdapter(val context: Context, val arrCall: ArrayList<CallModel>) :
    RecyclerView.Adapter<RecyclerCallAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgUserProfileImage = itemView.findViewById<ImageView>(R.id.imgUserProfileImage)
        val txtUsername = itemView.findViewById<TextView>(R.id.txtUsername)
        val imgCallStatus = itemView.findViewById<ImageView>(R.id.imgCallStatus)
        val txtCallTime = itemView.findViewById<TextView>(R.id.txtCallTime)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.call_row, parent, false))
    }

    override fun getItemCount(): Int {
        return arrCall.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imgUserProfileImage.setImageResource(arrCall[position].userImage)
        holder.imgCallStatus.setImageResource(arrCall[position].userCallStatus)
        holder.txtUsername.text = arrCall[position].username
        holder.txtCallTime.text = arrCall[position].userCallTime
    }
}