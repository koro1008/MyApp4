package com.websarva.wings.android.abiityofbaseball

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class SelectOptionActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_option)
    }

    // 選手をつくるボタンクリックで画面遷移
    fun onClickStartMaking(view : View){

        val intent = Intent(this,SelectPlayerTypeActivity::class.java)
        startActivity(intent)

    }
}