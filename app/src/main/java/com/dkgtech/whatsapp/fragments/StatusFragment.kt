package com.dkgtech.whatsapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.dkgtech.whatsapp.R
import com.dkgtech.whatsapp.adapters.RecyclerStatusAdapter
import com.dkgtech.whatsapp.databinding.FragmentStatusBinding
import com.dkgtech.whatsapp.models.StatusModel


class StatusFragment : Fragment() {

    lateinit var binding: FragmentStatusBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentStatusBinding.inflate(inflater, container, false)

        val arrStatus = ArrayList<StatusModel>().apply {
            add(StatusModel(R.drawable.user_1, "Dipesh", "Today 01:30 PM"))
            add(StatusModel(R.drawable.user_2, "Saurabh", "Today 11:05 AM"))
            add(StatusModel(R.drawable.user_3, "Ankita", "Yesterday 12:05 PM"))
            add(StatusModel(R.drawable.user_4, "Omkar", "Today 01:30 PM"))
            add(StatusModel(R.drawable.user_5, "Radhika", "Today 11:05 AM"))
            add(StatusModel(R.drawable.user_6, "Aadarsh", "Today 12:05 PM"))
            add(StatusModel(R.drawable.user_7, "Prasad", "Today 01:30 PM"))
            add(StatusModel(R.drawable.user_8, "Pranit", "Yesterday 11:05 AM"))
            add(StatusModel(R.drawable.user_9, "Akshay", "Yesterday 12:05 PM"))
            add(StatusModel(R.drawable.user_10, "Uttam", "Today 11:05 AM"))
            add(StatusModel(R.drawable.user_11, "Prafull", "Today 12:05 PM"))

        }

        binding.StatusRecyclerView.layoutManager = LinearLayoutManager(context)
        binding.StatusRecyclerView.adapter = context?.let { RecyclerStatusAdapter(it, arrStatus) }

        return binding.root
    }

}