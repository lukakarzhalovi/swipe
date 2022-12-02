package com.example.lukaia

import android.icu.text.CaseMap.Title
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class Adapter(Fm: FragmentManager): FragmentStatePagerAdapter(Fm) {
    private val mFragmentList = ArrayList<Fragment>()
    private val mFragmentTitleList = ArrayList<String>()


    override fun getCount() = mFragmentList.size

    override fun getItem(position: Int) = mFragmentList[position]

    override fun getPageTitle(position: Int) = mFragmentTitleList[position]


    fun  addFragment(fragment: Fragment, title: String){
        mFragmentList.add(fragment)
        mFragmentTitleList.add(title)


    }

}