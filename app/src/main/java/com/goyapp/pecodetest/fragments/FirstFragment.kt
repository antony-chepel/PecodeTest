package com.goyapp.pecodetest.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.goyapp.pecodetest.databinding.FragmentFirstBinding
import com.goyapp.pecodetest.utils.FragmentManager
import com.goyapp.pecodetest.utils.NotificationManager


class FirstFragment : BaseFragment() {
    private lateinit var binding: FragmentFirstBinding


    override fun NotificationAppear() {
     NotificationManager.showNotification(activity as AppCompatActivity,"Notification 1",true)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        NotificationAppear()

    }

    private  fun init(){
        binding.apply {
            fbPlus.setOnClickListener {
                FragmentManager.setFragment(SecondFragment.newInstance(),
                    activity as AppCompatActivity
                )
            }
            button.setOnClickListener {
                NotificationManager.showNotification(activity as AppCompatActivity, "Number of pages : 3",true)
            }
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = FirstFragment()
    }
}