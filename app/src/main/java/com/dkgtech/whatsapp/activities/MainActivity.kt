package com.dkgtech.whatsapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import com.dkgtech.whatsapp.R
import com.dkgtech.whatsapp.adapters.FragmentDataAdapter
import com.dkgtech.whatsapp.databinding.ActivityMainBinding
import com.dkgtech.whatsapp.models.FragmentModel
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tabDetails = ArrayList<FragmentModel>().apply {
            add(FragmentModel("Chats", R.drawable.icon_chat))
            add(FragmentModel("Status", R.drawable.icon_status))
            add(FragmentModel("Calls", R.drawable.icon_call))
        }

        binding.viewPager.adapter = FragmentDataAdapter(supportFragmentManager, lifecycle)
        binding.viewPager.currentItem = 0 // for default
        binding.viewPager.isUserInputEnabled = false

        TabLayoutMediator(binding.tabLayout, binding.viewPager, object : TabConfigurationStrategy {
            override fun onConfigureTab(tab: TabLayout.Tab, position: Int) {
                tab.text = tabDetails[position].title
                tab.icon = ResourcesCompat.getDrawable(resources, tabDetails[position].icon, null)
            }

        }).attach()

    }
}