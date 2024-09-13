package com.example.oop

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.example.oop.databinding.ActivityGameAvctivity2Binding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class GameActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGameAvctivity2Binding
    private val CORRECT_WORD = "МАШИНА"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityGameAvctivity2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.second)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initImage()
        initListener()
        initBtnClear()
        initClearLetter()
        initBtnCheck()
    }

    private fun initBtnCheck() {
        binding.btnCheck.setOnClickListener {
            if (binding.etGame.text.toString() == CORRECT_WORD) {
                alertDialog()
            } else if (binding.etGame.text.toString().isEmpty()) {
                Toast.makeText(this, "Поле пустое", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "верно!!!!!!", Toast.LENGTH_SHORT).show()
                binding.etGame.setText("")

                binding.letter1.visibility = View.VISIBLE
                binding.letter2.visibility = View.VISIBLE
                binding.letter3.visibility = View.VISIBLE
                binding.letter4.visibility = View.VISIBLE
                binding.letter5.visibility = View.VISIBLE
                binding.letter6.visibility = View.VISIBLE
                binding.letter7.visibility = View.VISIBLE
                binding.letter8.visibility = View.VISIBLE
                binding.letter9.visibility = View.VISIBLE
                binding.letter10.visibility = View.VISIBLE
                binding.letter11.visibility = View.VISIBLE
                binding.letter12.visibility = View.VISIBLE
            }
        }
    }

    private fun alertDialog() {
        val alertDialog = MaterialAlertDialogBuilder(this)
        alertDialog.setTitle("Вы угадали слово !")
        alertDialog.setMessage("Переходим на следующий экран ?")
        alertDialog.setNegativeButton("В главное меню !") { dialogInterface, i ->
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        alertDialog.show()
    }

    private fun initClearLetter() {
        binding.btnGame.setOnClickListener {
            val text = binding.etGame.text.toString()
            binding.etGame.setText(text.substring(0, text.length - 1))
            val letter = text[text.length - 1]

            if (letter.toString() == binding.letter1.text.toString()) {
                binding.letter1.visibility = View.VISIBLE
            }
            if (letter.toString() == binding.letter2.text.toString()) {
                binding.letter2.visibility = View.VISIBLE
            }
            if (letter.toString() == binding.letter3.text.toString()) {
                binding.letter3.visibility = View.VISIBLE
            }
            if (letter.toString() == binding.letter4.text.toString()) {
                binding.letter4.visibility = View.VISIBLE
            }
            if (letter.toString() == binding.letter5.text.toString()) {
                binding.letter5.visibility = View.VISIBLE
            }
            if (letter.toString() == binding.letter6.text.toString()) {
                binding.letter6.visibility = View.VISIBLE
            }
            if (letter.toString() == binding.letter7.text.toString()) {
                binding.letter7.visibility = View.VISIBLE
            }
            if (letter.toString() == binding.letter8.text.toString()) {
                binding.letter8.visibility = View.VISIBLE
            }
            if (letter.toString() == binding.letter9.text.toString()) {
                binding.letter9.visibility = View.VISIBLE
            }
            if (letter.toString() == binding.letter10.text.toString()) {
                binding.letter10.visibility = View.VISIBLE
            }
            if (letter.toString() == binding.letter11.text.toString()) {
                binding.letter11.visibility = View.VISIBLE
            }
            if (letter.toString() == binding.letter12.text.toString()) {
                binding.letter12.visibility = View.VISIBLE
            }
        }
    }

    private fun initBtnClear() {
        binding.etGame.addTextChangedListener(@SuppressLint("AppCompatCustomView")
        object : TextWatcher {
            override fun beforeTextChanged(
                charSequence: CharSequence,
                i: Int,
                i1: Int,
                i2: Int
            ) {
            }

            override fun onTextChanged(text: CharSequence?, i: Int, i1: Int, i2: Int) {
            }

            override fun afterTextChanged(editable: Editable?) {
                if (editable?.length!! > 0) {
                    binding.btnGame.visibility = View.VISIBLE
                } else {
                    binding.btnGame.visibility = View.GONE
                }
            }

        })
    }

    private fun initListener() {
        binding.letter1.setOnClickListener {
            binding.etGame.append(binding.letter1.text.toString())
            binding.letter1.visibility = View.VISIBLE
        }
        binding.letter2.setOnClickListener {
            binding.etGame.append(binding.letter2.text.toString())
            binding.letter2.visibility = View.VISIBLE
        }
        binding.letter3.setOnClickListener {
            binding.etGame.append(binding.letter3.text.toString())
            binding.letter3.visibility = View.VISIBLE
        }
        binding.letter4.setOnClickListener {
            binding.etGame.append(binding.letter4.text.toString())
            binding.letter4.visibility = View.VISIBLE
        }
        binding.letter5.setOnClickListener {
            binding.etGame.append(binding.letter5.text.toString())
            binding.letter5.visibility = View.VISIBLE
        }
        binding.letter6.setOnClickListener {
            binding.etGame.append(binding.letter6.text.toString())
            binding.letter6.visibility = View.VISIBLE
        }
        binding.letter7.setOnClickListener {
            binding.etGame.append(binding.letter7.text.toString())
            binding.letter7.visibility = View.VISIBLE
        }
        binding.letter8.setOnClickListener {
            binding.etGame.append(binding.letter8.text.toString())
            binding.letter8.visibility = View.VISIBLE
        }
        binding.letter9.setOnClickListener {
            binding.etGame.append(binding.letter9.text.toString())
            binding.letter9.visibility = View.VISIBLE
        }
        binding.letter10.setOnClickListener {
            binding.etGame.append(binding.letter10.text.toString())
            binding.letter10.visibility = View.VISIBLE
        }
        binding.letter11.setOnClickListener {
            binding.etGame.append(binding.letter11.text.toString())
            binding.letter11.visibility = View.VISIBLE
        }
        binding.letter12.setOnClickListener {
            binding.etGame.append(binding.letter12.text.toString())
            binding.letter12.visibility = View.VISIBLE
        }
    }

    private fun initImage() {
        Glide.with(this)
            .load("https://adsboard-static.spectrumdata.tech/files/blogs_content/fe2a89919d8aa9a/v7f79c8.jpg")
            .centerCrop().into(binding.imageOne)
        Glide.with(this)
            .load("https://avatars.mds.yandex.net/get-vertis-journal/3934100/2021-01-19-2c5996d983f64716bbd554e321b49db8.jpg_1622737068729/orig")
            .centerCrop().into(binding.imageTwo)
        Glide.with(this)
            .load("https://habrastorage.org/getpro/habr/upload_files/741/73b/ac4/74173bac4ae562f46fd359b5ac2d2c43.jpg")
            .centerCrop().into(binding.imageThird)
        Glide.with(this)
            .load("https://daily-motor.ru/wp-content/uploads/2022/04/9cef02fc84b44b545de632dda897d7d4-flying-car-weird-cars.jpg")
            .centerCrop().into(binding.imageFour)
    }
}