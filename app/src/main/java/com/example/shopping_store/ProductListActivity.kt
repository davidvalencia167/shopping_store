package com.example.shopping_store

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProductListActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ProductAdapter
    private lateinit var viewCartButton: Button
    private val productList = mutableListOf<Product>()
    private val cartItems = mutableListOf<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_list)

        recyclerView = findViewById(R.id.recyclerView)
        viewCartButton = findViewById(R.id.view_cart_button)

        recyclerView.layoutManager = LinearLayoutManager(this)

        // Crear el adaptador
        adapter = ProductAdapter(productList) { product ->
            addToCart(product)
        }
        recyclerView.adapter = adapter

        loadProducts()

        // Configurar el botón de "Ver carrito" para navegar a CartActivity
        viewCartButton.setOnClickListener {
            navigateToCart()
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun loadProducts() {
        // Agregar productos a la lista
        productList.add(Product("Producto 1", 100, "https://www.mancru.com/imgs/productos/productos31_51657.jpg"))
        productList.add(Product("Producto 2", 200, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTb3C3KrwjjHndXZ3e9zB9MYDfLrCO9gfc8Wg&s"))
        productList.add(Product("Producto 3", 300, "https://www.regalar.com.uy/imgs/productos/productos31_4076.jpg"))
        productList.add(Product("Producto 4", 400, "https://www.sumicell.com.uy/imgs/productos/productos31_4146.jpg"))
        productList.add(Product("Producto 5", 250, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSjUszwJZcnDkhT9pPYn53uujOxalstd2LiDw&s"))

        adapter.notifyDataSetChanged()
    }

    private fun addToCart(product: Product) {
        cartItems.add(product)
        Toast.makeText(this, "${product.name} añadido al carrito", Toast.LENGTH_SHORT).show()
    }

    private fun navigateToCart() {
        val intent = Intent(this, CartActivity::class.java)

        // Pasar la lista de productos seleccionados al carrito
        intent.putParcelableArrayListExtra("cartItems", ArrayList(cartItems))

        startActivity(intent)
    }
}
