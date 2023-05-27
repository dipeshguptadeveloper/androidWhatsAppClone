package com.dkgtech.whatsapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.dkgtech.whatsapp.R
import com.dkgtech.whatsapp.adapters.RecyclerChatAdapter
import com.dkgtech.whatsapp.databinding.FragmentChatBinding
import com.dkgtech.whatsapp.models.ChatModel


class ChatFragment : Fragment() {

    lateinit var binding: FragmentChatBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentChatBinding.inflate(inflater, container, false)

        val arrChats = ArrayList<ChatModel>().apply {
            add(ChatModel(R.drawable.user_1, "Dipesh", "Hi", "01:30 PM"))
            add(ChatModel(R.drawable.user_2, "Saurabh", "Hello", "11:05 AM"))
            add(ChatModel(R.drawable.user_3, "Ankita", "Hey", "12:05 PM"))
            add(ChatModel(R.drawable.user_4, "Omkar", "Hi", "01:30 PM"))
            add(ChatModel(R.drawable.user_5, "Radhika", "Hello", "11:05 AM"))
            add(ChatModel(R.drawable.user_6, "Aadarsh", "Hey", "12:05 PM"))
            add(ChatModel(R.drawable.user_7, "Prasad", "Hi", "01:30 PM"))
            add(ChatModel(R.drawable.user_8, "Pranit", "Hello", "11:05 AM"))
            add(ChatModel(R.drawable.user_9, "Akshay", "Hey", "12:05 PM"))
            add(ChatModel(R.drawable.user_10, "Uttam", "Hello", "11:05 AM"))
            add(ChatModel(R.drawable.user_11, "Prafull", "Hey", "12:05 PM"))

            add(ChatModel(R.drawable.user_1, "Dipesh", "Hi", "01:30 PM"))
            add(ChatModel(R.drawable.user_2, "Saurabh", "Hello", "11:05 AM"))
            add(ChatModel(R.drawable.user_3, "Ankita", "Hey", "12:05 PM"))
            add(ChatModel(R.drawable.user_4, "Omkar", "Hi", "01:30 PM"))
            add(ChatModel(R.drawable.user_5, "Radhika", "Hello", "11:05 AM"))
            add(ChatModel(R.drawable.user_6, "Aadarsh", "Hey", "12:05 PM"))
            add(ChatModel(R.drawable.user_7, "Prasad", "Hi", "01:30 PM"))
            add(ChatModel(R.drawable.user_8, "Pranit", "Hello", "11:05 AM"))
            add(ChatModel(R.drawable.user_9, "Akshay", "Hey", "12:05 PM"))
            add(ChatModel(R.drawable.user_10, "Uttam", "Hello", "11:05 AM"))
            add(ChatModel(R.drawable.user_11, "Prafull", "Hey", "12:05 PM"))
        }
        binding.chatRecyclerView.layoutManager = LinearLayoutManager(context)
        binding.chatRecyclerView.adapter = context?.let { RecyclerChatAdapter(it, arrChats) }
        return binding.root
    }

}