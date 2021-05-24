package com.iameben.connectedapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.iameben.connectedapplication.Adapter.MyNameAdapter
import com.iameben.connectedapplication.Common.Common
import com.iameben.connectedapplication.Interface.RetrofitService
import com.iameben.connectedapplication.Model.Name
import dmax.dialog.SpotsDialog
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Callback
import retrofit2.Response
import java.util.jar.Attributes

class MainActivity : AppCompatActivity() {
    lateinit var mService: RetrofitService
    lateinit var layoutManager: LinearLayoutManager
    lateinit var adapter: MyNameAdapter
    lateinit var dialog: android.app.AlertDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mService = Common.retrofitService

        contactsRV.setHasFixedSize(true)
        layoutManager = LinearLayoutManager(this)
        contactsRV.layoutManager = layoutManager
        dialog = SpotsDialog.Builder().setCancelable(false).setContext(this).build()
        getAllNameList()


    }

    private fun getAllNameList() {
        dialog.show()
        mService.getNameList().enqueue(object : Callback<MutableList<Name>>{
            override fun onResponse(
                p0: retrofit2.Call<MutableList<Name>>,
                p1: Response<MutableList<Name>>
            ) {
                adapter = MyNameAdapter(baseContext, p1.body() as MutableList<Name>)
                adapter.notifyDataSetChanged()
                contactsRV.adapter = adapter

                dialog.dismiss()
            }

            override fun onFailure(p0: retrofit2.Call<MutableList<Name>>, p1: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }

}