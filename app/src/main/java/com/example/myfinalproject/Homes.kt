package com.example.myfinalproject

import com.example.myfinalproject.ui.swipeview.SwipeViewViewModel.Home

object Homes {
    operator fun iterator(): Iterator<Home?> {
        TODO("Not yet implemented")
    }

    val HOUSE_1 = Home("House_1", R.drawable.house_1)
    val HOUSE_A = Home("House_a", R.drawable.house_a)
    val HOUSE_B = Home("Hoouse_b", R.drawable.house_b)
    val HOUSE_C = Home("House_c", R.drawable.house_c)
    val HOUSE_D = Home("House_d", R.drawable.house_d)
    val HOUSE_E = Home("House_e", R.drawable.house_e)
    val homes = arrayOf(
        HOUSE_1,
        HOUSE_A,
        HOUSE_B,
        HOUSE_C,
        HOUSE_D,
        HOUSE_E
    )
}