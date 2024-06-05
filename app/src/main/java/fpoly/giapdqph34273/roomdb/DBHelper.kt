package fpoly.giapdqph34273.roomdb

import androidx.room.Dao
import androidx.room.Database
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.RoomDatabase
import androidx.room.Update

@Database(entities = arrayOf(Student::class), version = 1)
abstract class StudentDB : RoomDatabase() {
    abstract fun studentDAO(): StudentDAO
}

@Dao
interface StudentDAO {
    @Query("SELECT * FROM Student")
    fun getAll(): List<Student>

    @Query("SELECT * FROM Student WHERE uid IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<Student>

    @Insert
    fun insert(vararg user: Student)

    @Delete
    fun delete(user: Student)

    @Update
    fun update(user: Student)
}