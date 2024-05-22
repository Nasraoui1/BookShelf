package com.example.bookshelf.data

import BooksApiService
import com.example.bookshelf.model.BookShelf


interface BookRepository {
    suspend fun searchBooks(query: String): List<BookShelf>
}

class DefaultBookRepository(private val apiService: BooksApiService) : BookRepository {
    override suspend fun searchBooks(query: String): List<BookShelf> {
        val response = apiService.searchBooks(query)
        return response.body()?.books ?: emptyList()
    }
}