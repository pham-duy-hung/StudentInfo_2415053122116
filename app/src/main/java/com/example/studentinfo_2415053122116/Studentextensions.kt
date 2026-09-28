package com.example.studentinfo_2415053122116

fun Student.formatUppercaseName(): String {
    return this.fullName.uppercase()
}

// Extension function 2: Xếp loại học lực dựa trên điểm
fun Student.getAcademicRank(): String {
    return when {
        score >= 8.5 -> "Giỏi (Đạt)"
        score >= 7.0 -> "Khá (Đạt)"
        score >= 5.0 -> "Trung bình (Đạt)"
        else -> "Chưa đạt"
    }
}