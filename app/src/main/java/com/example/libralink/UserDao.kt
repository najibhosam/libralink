package com.example.libralink

import androidx.room.*

@Dao
interface UserDao {
    @Query("SELECT * FROM Users_table")
    fun getAll(): List<Users>

    /* @Query("SELECT * FROM student_table WHERE uid IN (:userIds)")
     fun loadAllByIds(userIds: IntArray): List<Student>*/

    @Query("SELECT * FROM Users_table WHERE first_name ")
    suspend fun findByRoll(first_name: String): Users

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(student: Users)

    @Delete
    suspend fun delete(student: Users)

    @Query("DELETE FROM Users_table")
    suspend fun deleteAll()
}
