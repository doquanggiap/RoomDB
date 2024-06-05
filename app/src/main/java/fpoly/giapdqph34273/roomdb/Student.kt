package fpoly.giapdqph34273.roomdb

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Student")
data class Student(
    @PrimaryKey(autoGenerate = true) var uid: Int = 0,
    @ColumnInfo(name = "hoten") var hoten: String?,
    @ColumnInfo(name = "mssv") var mssv: String?,
    @ColumnInfo(name = "diemTB") var diemTB: Float?,
    @ColumnInfo(name = "daTotNghiep") var daTotNghiep: Boolean?,
)