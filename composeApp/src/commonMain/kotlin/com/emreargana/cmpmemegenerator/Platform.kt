package com.emreargana.cmpmemegenerator

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform