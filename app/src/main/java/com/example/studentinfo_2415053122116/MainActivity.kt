package com.example.studentinfo_2415053122116

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.studentinfo_2415053122116.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val student = Student(
            mssv = "2415053122116",
            fullName = "Phạm Duy Hưng",
            className = "24T1",
            age = 21,
            score = 8.5
        )

        binding.tvMssv.text = "Mã sinh viên: ${student.mssv}"
        binding.tvName.text = "Họ tên gốc: ${student.fullName}"
        binding.tvClass.text = "Lớp: ${student.className}"
        binding.tvAge.text = "Tuổi: ${student.age}"
        binding.tvScore.text = "Điểm: ${student.score}"

        val rank = student.getAcademicRank()

    }
}