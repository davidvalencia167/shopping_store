package com.example.shopping_store
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CartActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: CartAdapter
    private val cartItems = mutableListOf<Product>()

    @Suppress("DEPRECATION")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        recyclerView = findViewById(R.id.cartRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Obtener los productos del carrito
        cartItems.addAll(intent.getParcelableArrayListExtra("cartItems") ?: emptyList())

        // Configurar el adaptador
        adapter = CartAdapter(cartItems)
        recyclerView.adapter = adapter

        // Botón de pagar
        findViewById<Button>(R.id.checkout_button).setOnClickListener {
            Toast.makeText(this, "Pagar no implementado", Toast.LENGTH_SHORT).show()
        }

    }
}
