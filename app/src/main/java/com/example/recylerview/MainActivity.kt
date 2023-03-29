package com.example.recylerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.recylerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //data student berupa arraylist
        val listStudentData = arrayListOf(
            ListStudent("Nanda", 20, R.drawable.ic_person_foreground),
            ListStudent("Andika", 21, R.drawable.ic_person_foreground),
            ListStudent("Faisal", 23, R.drawable.ic_person_foreground),
            ListStudent("Abdul", 24, R.drawable.ic_person_foreground),
            ListStudent("Budi", 30, R.drawable.ic_person_foreground),
            ListStudent("Jey", 21, R.drawable.ic_person_foreground)
        )

        //panggil class adapter lalu isi data berupa arraylist
        val adapterStudent = StudentAdapter(listStudentData)

        //mengatur tata letak dari recyclerviewnya
        val lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
//        val gl = GridLayout(this)
        binding.rvStudent.layoutManager = lm
        binding.rvStudent.adapter = adapterStudent
    }
}