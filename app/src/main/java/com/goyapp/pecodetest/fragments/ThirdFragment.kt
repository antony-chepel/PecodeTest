package com.goyapp.pecodetest.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.goyapp.pecodetest.databinding.FragmentThirdBinding
import com.goyapp.pecodetest.utils.FragmentManager
import com.goyapp.pecodetest.utils.NotificationManager


class ThirdFragment : BaseFragment() {
    private lateinit var binding : FragmentThirdBinding
    override fun NotificationAppear() {
        NotificationManager.showNotification(activity as AppCompatActivity,"Notification 3",true)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirdBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        NotificationAppear()


    }

    private fun init() = with(binding){
        fbMinus.setOnClickListener {
            FragmentManager.setFragment(SecondFragment.newInstance(),activity as AppCompatActivity)
            NotificationManager.showNotification(activity as AppCompatActivity,"Notification 3",false)
        }
        button.setOnClickListener {
            NotificationManager.showNotification(activity as AppCompatActivity, "Number of pages : 3",true)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = ThirdFragment()

    }
}