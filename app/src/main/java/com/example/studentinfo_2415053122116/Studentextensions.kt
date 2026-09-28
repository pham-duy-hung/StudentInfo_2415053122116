package com.example.studentinfo_2415053122116

fun Student.formatScore(): String {
    return String.format("★ Điểm tổng kết: %.1f / 10.0", this.score)
}

fun Student.getFullInfo(): String {
    return "MSSV: $mssv | Tên: $fullName | Lớp: $className"
}