package com.example.libralink.DataBase

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

interface BooksDao {
    @Query("SELECT * FROM Books_table")
    fun getAll(): List<Books>
    @Query("SELECT * FROM books_table WHERE book_name")
    suspend fun findByRoll(book_name: String): Books
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(book: Books)
    @Delete
    suspend fun delete(book: Books)
    @Query("DELET FROM Books_table")
    suspend fun deleteAll()
}