package com.belia.contactsapp


class Data {
    fun getContactsData(): List<Contact> {
        val contacts = listOf(
            Contact("Auntie", "+20123456789", R.drawable.auntie),
            Contact("Brother", "+20123456789", R.drawable.brother),
            Contact("Daughter", "+20123456789", R.drawable.daughter),
            Contact("Friend 1", "+20123456789", R.drawable.friend_1),
            Contact("Friend 2", "+20123456789", R.drawable.friend_2),
            Contact("Grandfather", "+20123456789", R.drawable.grandfather),
            Contact("Granny", "+20123456789", R.drawable.granny),
            Contact("Neighbour", "+20123456789", R.drawable.neigbour),
            Contact("Sister", "+20123456789", R.drawable.sister),
            Contact("Son", "+20123456789", R.drawable.son),
            Contact("Uncle", "+20123456789", R.drawable.uncle),
            Contact("Omar", "+20123456789", R.drawable.son),
            Contact("Emad", "+20123456789", R.drawable.grandfather),
            Contact("Abdo", "+20123456789", R.drawable.brother),
        )
        return contacts
    }
}