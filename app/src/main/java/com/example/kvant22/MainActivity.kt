package com.example.kvant22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    var group: Group = Group("IT2")
    lateinit var student: Student

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun Detail(v: View){
        var Login : EditText = findViewById(R.id.editText)
        student = Student(Login.text.toString(),group, R.drawable.ic_launcher_background)
        studentShow(student)
    }

    fun studentShow(student: Student){
        Name.setText(student.name)
        Photo.setImageResource(student.phot)
        Group.setText(student.group.num_group)
    }

}
