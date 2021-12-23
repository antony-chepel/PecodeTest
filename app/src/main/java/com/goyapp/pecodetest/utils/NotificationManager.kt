package com.goyapp.pecodetest.utils

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import com.goyapp.pecodetest.databinding.NotificationLayoutBinding
import android.view.Gravity
import android.view.Window


object NotificationManager {
    fun showNotification(context:Context,pageNumber : String,isback : Boolean){
        val dialog : AlertDialog
        val builder = AlertDialog.Builder(context)
        val binding = NotificationLayoutBinding.inflate(LayoutInflater.from(context))
        builder.setView(binding.root)

        binding.apply {
            tvNumber.text = pageNumber
        }

        dialog = builder.create()
        val window: Window? = dialog.window
        window?.setGravity(Gravity.TOP)
        dialog.window?.setBackgroundDrawable(null)
        dialog.setCancelable(true)
        if(isback) dialog.show() else dialog.hide()

    }
}