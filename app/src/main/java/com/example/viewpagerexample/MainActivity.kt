package com.example.viewpagerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpagerexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val photoList = ArrayList<Photos>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        //generate the data source
        initPhotoList()
        //configure the viewpager
        val adapter = PhotoAdapter(photoList)
        binding.viewPager.adapter = adapter
        //set the swipe direction
        //binding.viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL
    }

    private fun initPhotoList() {
        photoList.add(Photos("長春祠",R.drawable.photo1_0))
        photoList.add(Photos("燕子口",R.drawable.photo1_1))
        photoList.add(Photos("慈母橋",R.drawable.photo1_2))
    }
}