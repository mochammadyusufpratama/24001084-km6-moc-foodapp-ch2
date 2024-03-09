package com.example.myapplication

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.adapter.CatalogAdapter
import com.example.myapplication.adapter.CategoryAdapter
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.model.Catalog
import com.example.myapplication.model.Category

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val categoryAdapter = CategoryAdapter()
    private val catalogAdapter = CatalogAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setListCategory()
        setListCatalog()
    }

    private fun setListCategory() {
        val data = listOf(
            Category(image = R.drawable.img_food, name = "Food"),
            Category(image = R.drawable.img_drink, name = "Drink"),
            Category(image = R.drawable.img_snack, name = "Snack"),
            Category(image = R.drawable.bg_banner, name = "Fruit"),
            Category(image = R.drawable.img_vagetable, name = "Vagetables")
        )
        binding.layoutCategory.apply {
            adapter = this@MainActivity.categoryAdapter
        }
        categoryAdapter.submitData(data)
    }

    private fun setListCatalog() {
        val data = listOf(
            Catalog(image = R.drawable.img_food, name = "Pancakes", price = 50000.0),
            Catalog(image = R.drawable.img_drink, name = "Orage Juice", price = 20000.0),
            Catalog(image = R.drawable.img_pop_corn, name = "Pop Corn", price = 40000.0),
            Catalog(image = R.drawable.bg_banner, name = "Fruit Bag", price = 100000.0),
            Catalog(image = R.drawable.img_burger, name = "Burger", price = 60000.0),
            Catalog(image = R.drawable.img_bread, name = "Minyak", price = 25000.0)
        )
        binding.layoutCatalog.apply {
            adapter = this@MainActivity.catalogAdapter
        }
        catalogAdapter.submitData(data)
    }

}