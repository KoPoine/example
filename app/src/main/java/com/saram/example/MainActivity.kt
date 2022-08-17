package com.saram.example

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.saram.example.databinding.ActivityEditBinding
import com.saram.example.databinding.ActivityMainBinding
import org.json.JSONObject
import java.util.Collections.list

class MainActivity : BaseActivity() {
    var i = 0
    lateinit var binding: ActivityMainBinding

    lateinit var mTopicData: UserData
    lateinit var mReplyAdapter: TopicRecyclerAdapter
    val mReplyList = ArrayList<UserData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
        binding.addReplyBtn.setOnClickListener {
            Log.d("테스트-2",i.toString())
            val myIntent = Intent(mContext, Edit::class.java)
            startActivity(myIntent)


//        내 정보 화면으로 이동 (커스텀 액션바의 icon 클릭이벤트 활용)
        }

    }
        override fun setValues() {


            mReplyAdapter = TopicRecyclerAdapter(mContext,i)
            binding.rvProfile.adapter = mReplyAdapter
            binding.rvProfile.layoutManager = LinearLayoutManager(mContext)
        }
    }




