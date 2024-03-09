package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemCatalogBinding
import com.example.myapplication.model.Catalog
import java.text.NumberFormat
import java.util.Locale

class CatalogAdapter : RecyclerView.Adapter<CatalogAdapter.CatalogViewHolder>() {

    private val data = mutableListOf<Catalog>()

    fun submitData(items: List<Catalog>) {
        data.addAll(items)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatalogViewHolder {
        return CatalogAdapter.CatalogViewHolder(
            ItemCatalogBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = data.size
    override fun onBindViewHolder(holder: CatalogViewHolder, position: Int) {
        holder.bind(data[position])
    }
    class CatalogViewHolder(private val binding : ItemCatalogBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Catalog) {
            binding.ivImageCatalog.setImageResource(item.image)
            binding.tvCatalogName.text = item.name
            binding.tvCatalogPrice.text = "Rp" + item.price.toInt().toString() + ",00"
        }
    }

}