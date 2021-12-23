package com.goyapp.pecodetest.utils
import androidx.appcompat.app.AppCompatActivity
import com.goyapp.pecodetest.R
import com.goyapp.pecodetest.fragments.BaseFragment


object FragmentManager {
   var currentFragment : BaseFragment? = null


    fun setFragment(newFrag: BaseFragment, activity: AppCompatActivity){
        val transaction = activity.supportFragmentManager.beginTransaction()
        transaction.replace(R.id.placeholder,newFrag)
        transaction.commit()
        currentFragment = newFrag

    }
}