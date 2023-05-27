package com.dkgtech.whatsapp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.dkgtech.whatsapp.fragments.CallFragment
import com.dkgtech.whatsapp.fragments.ChatFragment
import com.dkgtech.whatsapp.fragments.StatusFragment

class FragmentDataAdapter(val fm: FragmentManager, val lifecycle: Lifecycle) :
    FragmentStateAdapter(fm, lifecycle) {
    override fun getItemCount(): Int {
        return 3 // no. of tabs
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                ChatFragment()
            }

            1 -> {
                StatusFragment()
            }

            else -> {
                CallFragment()
            }
        }
    }
}