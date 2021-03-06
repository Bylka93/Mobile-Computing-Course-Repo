package com.oulu.nabilarhabapp

import androidx.room.*

@Entity(tableName ="reminders")
data class Reminder(
        @PrimaryKey(autoGenerate = true) var uid : Int ?,
        @ColumnInfo(name="time") var time: Long?,
        @ColumnInfo(name="location") var location: String?,
        @ColumnInfo(name="message") var messge: String
)
@Dao
interface ReminderDao {
    @Transaction
    @Insert
    fun insert(reminder: Reminder)
    @Query(value = "SELECT * FROM reminders")
    fun getRemindrs(): List<Reminder>
}
