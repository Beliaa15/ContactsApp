package com.belia.contactsapp

import androidx.annotation.DrawableRes

data class Contact(
    val name:String,
    val number: String,
    @DrawableRes val pic:Int
)