package com.example.libralink.DataBase

import androidx.lifecycle.LiveData

class BookRepository(private val booksDao : BooksDao) {

    val readAll : LiveData<List<Books>> = booksDao.readAll()

    suspend fun addBooks(book : Books){
        booksDao.insert(book)
    }

}