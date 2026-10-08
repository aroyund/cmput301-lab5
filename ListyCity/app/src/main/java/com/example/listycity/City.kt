package com.example.listycity

import com.google.firebase.firestore.DocumentId
data class City(
    val name: String = "",
    val province: String = "",
    @DocumentId val id: String = ""
)