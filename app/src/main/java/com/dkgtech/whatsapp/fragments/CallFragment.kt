package com.dkgtech.whatsapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.dkgtech.whatsapp.R
import com.dkgtech.whatsapp.adapters.RecyclerCallAdapter
import com.dkgtech.whatsapp.databinding.FragmentCallBinding
import com.dkgtech.whatsapp.models.CallModel


class CallFragment : Fragment() {
    lateinit var binding: FragmentCallBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCallBinding.inflate(inflater, container, false)

        val arrCalls = ArrayList<CallModel>().apply {
            add(
                CallModel(
                    R.drawable.user_1,
                    "Dipesh",
                    R.drawable.icon_arrow_inward,
                    "Today 10:00 AM"
                )
            )
            add(
                CallModel(
                    R.drawable.user_2,
                    "Saurabh",
                    R.drawable.icon_arrow_outward,
                    "Today 11:20 AM"
                )
            )
            add(
                CallModel(
                    R.drawable.user_3,
                    "Ankita",
                    R.drawable.icon_arrow_inward,
                    "Yesterday 10:30 PM"
                )
            )
            add(
                CallModel(
                    R.drawable.user_4,
                    "Omkar",
                    R.drawable.icon_arrow_inward,
                    "Today 12:30 PM"
                )
            )
            add(
                CallModel(
                    R.drawable.user_5,
                    "Radhika",
                    R.drawable.icon_arrow_outward,
                    "Today 02:00 AM"
                )
            )
            add(
                CallModel(
                    R.drawable.user_6,
                    "Akshay",
                    R.drawable.icon_arrow_inward,
                    "Today 03:20 PM"
                )
            )
        }

        binding.callRecyclerView.layoutManager = LinearLayoutManager(context)
        binding.callRecyclerView.adapter = context?.let { RecyclerCallAdapter(it, arrCalls) }

        return binding.root

    }

}