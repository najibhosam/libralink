package com.example.libralink.dataBase

class BookRepository(private val booksDao : BooksDao) {

    val readAll : List<Books> = booksDao.readAll()

    suspend fun addBooks(book : Books){
        booksDao.insert(book)
    }

}