package com.example.expandedrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.expandedrecyclerview.adapter.MainAdapter
import com.example.expandedrecyclerview.databinding.ActivityMainBinding
import com.example.expandedrecyclerview.databinding.SubListItemBinding
import com.example.expandedrecyclerview.model.SampleData

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.rvMain.adapter = MainAdapter(SampleData.collectios)
    }
}