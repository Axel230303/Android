package com.example.application_tp3

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform