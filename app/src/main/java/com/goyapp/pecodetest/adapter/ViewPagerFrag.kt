package com.goyapp.pecodetest.adapter
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

import com.goyapp.pecodetest.fragments.FirstFragment
import com.goyapp.pecodetest.fragments.SecondFragment
import com.goyapp.pecodetest.fragments.ThirdFragment


class ViewPagerFrag(activity : FragmentActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int) : Fragment {
        when(position){
          0 ->  return FirstFragment.newInstance()
            1-> return SecondFragment.newInstance()
            2-> return ThirdFragment.newInstance()
        }
        return createFragment(itemCount)
    }
}