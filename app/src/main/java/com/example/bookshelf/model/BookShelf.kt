package com.example.bookshelf.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BookShelf(
    val id: String,
    @SerialName("volumeInfo")
    val volumeInfo: VolumeInfo
)

@Serializable
data class VolumeInfo(
    val title: String,
    @SerialName("imageLinks")
    val imageLinks: ImageLinks
)

@Serializable
data class ImageLinks(
    val smallThumbnail: String,
    val thumbnail: String
)
