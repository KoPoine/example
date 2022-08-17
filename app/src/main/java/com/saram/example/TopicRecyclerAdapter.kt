package com.saram.example

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.saram.example.databinding.ActivityEditBinding
import com.saram.example.databinding.ActivityMainBinding

class TopicRecyclerAdapter(
    val mContext : Context, var id : Int
) : RecyclerView.Adapter<TopicRecyclerAdapter.MyViewHolder>() {

    inner class MyViewHolder (view : View) : RecyclerView.ViewHolder(view) {
        fun bind(textView: TextView){

            val titleTxt = itemView.findViewById<TextView>(R.id.text12)
            val Btn = itemView.findViewById<Button>(R.id.Btn12)

            titleTxt.visibility = textView.visibility
            Log.d("테스트",titleTxt.toString())

               Btn.setOnClickListener {
                val myIntent = Intent(mContext, MainActivity::class.java)
                myIntent.putExtra("", titleTxt.toString())
                mContext.startActivity(myIntent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val row = LayoutInflater.from(mContext).inflate(R.layout.activity_main, parent, false)
        return MyViewHolder(row)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView
    }

    override fun getItemCount(): Int {
        return id++
    }

}