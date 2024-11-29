package com.example.zheleznayamebeldiplom

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.zheleznayamebeldiplom.databinding.ActivityLoginUserBinding
import com.example.zheleznayamebeldiplom.databinding.ActivitySignUpUserBinding

class SignUpUserActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySignUpUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySignUpUserBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.goLoginUserPage.setOnClickListener{
            val intent = Intent(this@SignUpUserActivity,LoginUserActivity :: class.java)
            startActivity(intent)
        }
        binding.button2.setOnClickListener{
            val intent = Intent(this@SignUpUserActivity,LocationActivity :: class.java)
            startActivity(intent)
            finish()
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}