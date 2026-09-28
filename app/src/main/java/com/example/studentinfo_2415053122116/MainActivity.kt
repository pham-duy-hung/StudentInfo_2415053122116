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
            score = 8.5,
            gender = "Nam" // thêm do có yêu cầu 6
        )

        binding.tvExtensionInfo.text = student.getFullInfo()

        binding.tvAge.text = "Tuổi: ${student.age}"

        binding.tvGender.text = "Giới tính: ${student.gender}"

        binding.tvFormattedScore.text = student.formatScore()
    }
}