package com.example.libralink

import androidx.room.*

@Dao
interface UserDao {
    @Query("SELECT * FROM Users_table")
    fun getAll(): List<Users>

    /* @Query("SELECT * FROM student_table WHERE uid IN (:userIds)")
     fun loadAllByIds(userIds: IntArray): List<Student>*/

    @Query
        ("SELECT * FROM Users_table WHERE id ")
    suspend fun findByRoll(id: Int): Users// User ist die Rückgabe hier

    @Insert
        (onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(User: Users)

    @Delete
    suspend fun delete(User: Users)

    @Query
        ("DELETE FROM Users_table")
    suspend fun deleteAll()
}
