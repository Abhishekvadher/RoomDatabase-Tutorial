package com.example.contactapp.db.entity;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ContactDAO {

    @Insert
    public long addContact(Contact contact);

    @Update
    public void upadteContact(Contact contact);

    @Delete
    public void deleteContact(Contact contact);

    @Query("select * from contacts")
    public List<Contact> getContact();

    @Query("select * from contacts where contact_id ==:contact_id")
    public Contact getContact(long contact_id);
}
