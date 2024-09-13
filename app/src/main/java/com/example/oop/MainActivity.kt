package com.example.oop

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.example.oop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initImage()

        binding.btnGame.setOnClickListener {
            initNav()
        }
    }

    private fun initNav() {
        val intent = Intent(this,GameActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun initImage() {
        Glide.with(this).load("https://upload.wikimedia.org/wikipedia/ru/thumb/3/3f/%D0%93%D1%83%D0%B1%D0%BA%D0%B0_%D0%91%D0%BE%D0%B1_%D0%BF%D0%B5%D1%80%D1%81%D0%BE%D0%BD%D0%B0%D0%B6.png/778px-%D0%93%D1%83%D0%B1%D0%BA%D0%B0_%D0%91%D0%BE%D0%B1_%D0%BF%D0%B5%D1%80%D1%81%D0%BE%D0%BD%D0%B0%D0%B6.png").centerCrop().into(binding.imageOne)
        Glide.with(this).load("https://img.freepik.com/free-vector/bird-colorful-gradient-design-vector_343694-2506.jpg?size=338&ext=jpg&ga=GA1.1.2008272138.1726012800&semt=ais_hybrid").centerCrop().into(binding.imageTwo)
        Glide.with(this).load("https://cdn.ruwiki.ru/commonswiki/files/4/47/PNG_transparency_demonstration_1.png").centerCrop().into(binding.imageThird)
        Glide.with(this).load("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/474e98b6-ffcf-4e0c-a16f-46bc407568d0/d5quznu-ed7f198a-5925-4de0-9351-5f5ddabda16c.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzQ3NGU5OGI2LWZmY2YtNGUwYy1hMTZmLTQ2YmM0MDc1NjhkMFwvZDVxdXpudS1lZDdmMTk4YS01OTI1LTRkZTAtOTM1MS01ZjVkZGFiZGExNmMucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.euy8dy9gzPnwHJjSGCkxyWWomgU-G7Y1OMuG42xVtqg").centerCrop().into(binding.imageFour)
    }
}