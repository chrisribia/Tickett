package co.ke.tickett.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import co.ke.tickett.data.db.entity.Sell


@Dao
interface SellDao  {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveAllEvents(event : List<Sell>)


    @Query("SELECT * FROM Events WHERE qr_code = :qr_code")
    fun findEvent(qr_code: String): LiveData<Sell>


    @Query("SELECT * FROM Events WHERE ticket_code = :ticket_code")
    fun findEventByCode(ticket_code: String): LiveData<Sell>
}