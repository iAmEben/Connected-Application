package com.iameben.connectedapplication.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import androidx.recyclerview.widget.RecyclerView
import com.iameben.connectedapplication.Model.Name
import com.iameben.connectedapplication.R
import kotlinx.android.synthetic.main.list_model.view.*

class MyNameAdapter(private val context: Context,
                    private val nameList: MutableList<Name>):
    RecyclerView.Adapter<MyNameAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var img_specie: ImageView
        var nameTv: TextView
        var statusTv: TextView
        var specieTv: TextView

        init {
            img_specie = itemView.img_specie
            statusTv = itemView.statusTv
            nameTv = itemView.nameTv
            specieTv = itemView.specieTv
        }

    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.list_model, p0, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(p0: MyViewHolder, p1: Int) {
        Picasso.get().load(nameList[p1].image).into(p0.img_specie)
        p0.specieTv.text = nameList[p1].species
        p0.statusTv.text = nameList[p1].status
        p0.nameTv.text = nameList[p1].name

    }

    override fun getItemCount(): Int {
        return nameList.size
    }
}