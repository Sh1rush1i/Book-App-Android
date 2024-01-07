package com.example.riansyahsetiawan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.ncorti.slidetoact.SlideToActView

class OthersActivity  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.other)

        WindowCompat.setDecorFitsSystemWindows(
            window, false
        )

        val contactBtn = findViewById<Button>(R.id.contatcBtn)
        contactBtn.setOnClickListener {
            val dialog = BottomSheetDialog(this)
            val view = layoutInflater.inflate(R.layout.bottomsheetview, null)
            dialog.setContentView(view)
            dialog.show()
        }

        val backBtn = findViewById<ImageView>(R.id.backBtn)
        backBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        val namanama = arrayOf<String>(
            "Layered Design for Ruby on Rail Applications",
            "Complete Python Course with 10 Real World Projects",
            "50 Algorithms Programmer should know",
            "Solutions Architect Book",
            "Building Low Latency Applications with C++",
            "Learn Microsoft Power Apps"
        )
        val desc = arrayOf<String>(
            "Ruby",
            "Python",
            "Other",
            "Architect",
            "C++",
            "Mc Power Apps"
        )
        val fotofoto = arrayOf<Int>(
            R.drawable.book1,
            R.drawable.book_2,
            R.drawable.book_3,
            R.drawable.book_4,
            R.drawable.book_5,
            R.drawable.book_6
        )

        val list = findViewById<ListView>(R.id.listview)
        list.adapter = listAdapter(this, namanama, fotofoto, desc)
        list.setOnItemClickListener { adapterView, view, position, id ->

        }

        val slide = findViewById<SlideToActView>(R.id.sliderbro)
        slide.animDuration = 600
        slide.bumpVibration = 500
        slide.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener {
            override fun onSlideComplete(view: SlideToActView) {
                // Start the TabLayoutActivity
                val intent = Intent(this@OthersActivity, TabLayoutActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.book1, "Book 1", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.book_2, "Book 2", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.book_3, "Book 3", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.book_4, "Book 4", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.book_5, "Book 5", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.book_6, "Book 6", ScaleTypes.CENTER_CROP))

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)
    }
}