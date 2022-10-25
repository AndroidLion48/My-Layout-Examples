package com.eaglewarrior.layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.eaglewarrior.layouts.constraintlayouts.FbConstraintLayoutActivity
import com.eaglewarrior.layouts.constraintlayouts.IgConstraintLayoutActivity
import com.eaglewarrior.layouts.gridlayouts.FbGridLayoutActivity
import com.eaglewarrior.layouts.gridlayouts.IgGridLayoutActivity
import com.eaglewarrior.layouts.linearlayouts.FbLinearLayoutActivity
import com.eaglewarrior.layouts.linearlayouts.IgLinearLayoutActivity
import com.eaglewarrior.layouts.relativelayouts.FbRelativeLayoutActivity
import com.eaglewarrior.layouts.relativelayouts.IgRelativeLayoutActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.igBtnDefault)
        button.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, LoginActivity::class.java )
            startActivity(intent)
        })

        val igLinearLayoutBtn = findViewById<Button>(R.id.igBtnLinearLayout)
        igLinearLayoutBtn.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, IgLinearLayoutActivity::class.java )
            startActivity(intent)
        })

        val igGridLayoutBtn = findViewById<Button>(R.id.igBtnGridLayout)
        igGridLayoutBtn.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, IgGridLayoutActivity::class.java)
            startActivity(intent)
        })

        val igRelativeLayoutBtn = findViewById<Button>(R.id.igBtnRelativeLayout)
        igRelativeLayoutBtn.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, IgRelativeLayoutActivity::class.java)
            startActivity(intent)
        })

        val igConstraintLayoutBtn = findViewById<Button>(R.id.igBtnConstraintLayout)
        igConstraintLayoutBtn.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, IgConstraintLayoutActivity::class.java)
            startActivity(intent)
        })

        val fbConstraintLayoutButton = findViewById<Button>(R.id.fbBtnConstraintLayout)
        fbConstraintLayoutButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, FbConstraintLayoutActivity::class.java)
            startActivity(intent)
        })

        val fbGridLayoutButton = findViewById<Button>(R.id.fbBtnGridLayout)
        fbGridLayoutButton.setOnClickListener(View.OnClickListener{
            val intent = Intent(this, FbGridLayoutActivity::class.java)
            startActivity(intent)
        })

        val fbLinearlayoutButton = findViewById<Button>(R.id.fbBtnLinearLayout)
        fbLinearlayoutButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, FbLinearLayoutActivity::class.java)
            startActivity(intent)
        })

        val fbRelativeLayoutButton = findViewById<Button>(R.id.fbBtnRelativeLayout)
        fbRelativeLayoutButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, FbRelativeLayoutActivity::class.java)
            startActivity(intent)
        })
    }
}
