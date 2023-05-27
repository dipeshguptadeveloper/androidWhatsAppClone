package com.dkgtech.whatsapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dkgtech.whatsapp.R
import com.dkgtech.whatsapp.models.StatusModel

class RecyclerStatusAdapter(val context: Context, val arrStatus: ArrayList<StatusModel>) :
    RecyclerView.Adapter<RecyclerStatusAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgUserProfileImage = itemView.findViewById<ImageView>(R.id.imgUserProfileImage)
        val txtUsername = itemView.findViewById<TextView>(R.id.txtUsername)
        val txtUserStatusTime = itemView.findViewById<TextView>(R.id.txtUserStatusTime)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.status_row, parent, false))
    }

    override fun getItemCount(): Int {
        return arrStatus.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imgUserProfileImage.setImageResource(arrStatus[position].userImage)
        holder.txtUsername.text = arrStatus[position].username
        holder.txtUserStatusTime.text = arrStatus[position].userStatusTime
    }
}