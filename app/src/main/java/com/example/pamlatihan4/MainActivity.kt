package com.example.pamlatihan4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.net.Uri
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Menavigasi ke FragmentA melalui deep link saat aplikasi pertama kali dijalankan
        val uri = Uri.parse("https://example.com/fragmentA")
        val navDeepLink = NavDeepLinkRequest.Builder.fromUri(uri).build()
        val navController = findNavController(R.id.nav_host_fragment)
        navController.navigate(navDeepLink)
    }
}