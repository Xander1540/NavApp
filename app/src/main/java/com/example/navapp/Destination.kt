package com.example.navapp

interface Destination{
    val route: String
}

object Home: Destination{
    override val route = "Home"
}

object MenuList: Destination{
    override val route = "MenuList"
}