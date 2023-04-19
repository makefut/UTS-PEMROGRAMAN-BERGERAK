package com.example.utspraktikum

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var recycle: RecyclerView
    lateinit var recycleAdapter: AdapterData
    lateinit var listData: ArrayList<dataclass>

    @SuppressLint("MissingInflatedId")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycle = findViewById(R.id.idrecycle)
        listData = ArrayList()

        val layoutManager = GridLayoutManager(this, 2)
        recycle.layoutManager = layoutManager
        recycleAdapter = AdapterData(listData, this)

        recycle.adapter = recycleAdapter
        listData.add(dataclass("Jordi Alba", "210441100006", "20 Tahun", R.drawable.alba))
        listData.add(dataclass("Ansu Fati", "210441100017", "21 tahun", R.drawable.ansu))
        listData.add(dataclass("Yohan Fadhila", "210441100067", "22 tahun", R.drawable.araujo))
        listData.add(dataclass("Sergio Busquest", "210441100124", "23 tahun", R.drawable.busquest))
        listData.add(dataclass("Otsman Dembele", "210441100066", "24 tahun", R.drawable.dembele))
        listData.add(dataclass("Frankie De Jong", "210441100023", "25 Tahun", R.drawable.frankie))
        listData.add(dataclass("Robert Lewandolski", "210441100606", "26 tahun", R.drawable.lewandolski))
        listData.add(dataclass("Pedri", "210441100012", "27 tahun", R.drawable.pedri))
        listData.add(dataclass("Rapinha", "210441100011", "28 tahun", R.drawable.rapinha))
        listData.add(dataclass("Ter Stegen", "210441100009", "29 tahun", R.drawable.stegen))

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.list ->{
                startActivity(Intent(this@MainActivity, MainActivity2::class.java))
                true
            }
            else ->return super.onOptionsItemSelected(item)
        }
        return super.onOptionsItemSelected(item)
    }
}
