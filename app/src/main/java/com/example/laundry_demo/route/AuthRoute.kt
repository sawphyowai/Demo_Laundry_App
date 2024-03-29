package com.example.laundry_demo.route

sealed class AuthRoute(val route:String) {
    companion object{
        const val Auth="/Auth"
        const val Login="/Login"
        const val Register="/Register"
    }
}