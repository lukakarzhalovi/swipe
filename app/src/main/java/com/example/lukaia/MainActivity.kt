package com.example.lukaia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lukaia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = Adapter(supportFragmentManager)

        adapter.addFragment(FirstFragment(), "First")
        adapter.addFragment(SecondFragment(), "Second")
        adapter.addFragment(ThirdFragment(), "Third")

        binding.ViewPager.adapter=adapter
        binding.TbLayout.setupWithViewPager(binding.ViewPager)
    }
}