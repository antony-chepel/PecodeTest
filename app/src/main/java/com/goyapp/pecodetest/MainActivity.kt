package com.goyapp.pecodetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.goyapp.pecodetest.adapter.ViewPagerFrag
import com.goyapp.pecodetest.databinding.ActivityMainBinding
import com.goyapp.pecodetest.fragments.FirstFragment
import com.goyapp.pecodetest.utils.FragmentManager

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewadapter :ViewPagerFrag
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()

    }

    private fun init() = with(binding){
        viewadapter = ViewPagerFrag(this@MainActivity)
        viewPager.adapter = viewadapter
        FragmentManager.currentFragment?.NotificationAppear()
    }


}