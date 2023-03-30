package com.example.myneu;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.myneu.Search.User;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class UserUnitTest {
    @Test
    public void userConstructorTest() {
        User user = new User("nameTest", "emailTest", "userNameTest", "bioTest", "imageUrlTest", "idTest");
        assertEquals("nameTest", user.getName());
        assertEquals("emailTest", user.getEmail());
        assertEquals("userNameTest", user.getUsername());
        assertEquals("bioTest", user.getBio());
        assertEquals("imageUrlTest", user.getImageurl());
        assertEquals("idTest", user.getId());
    }

    @Test
    public void getNameTest() {
        User user = new User();
        user.setName("nameTest");
        assertEquals("nameTest", user.getName());
    }

    @Test
    public void getEmailTest() {
        User user = new User();
        user.setEmail("emailTest");
        assertEquals("emailTest", user.getEmail());
    }

    @Test
    public void getUserNameTest() {
        User user = new User();
        user.setUsername("userNameTest");
        assertEquals("userNameTest", user.getUsername());
    }

    @Test
    public void getBioTest() {
        User user = new User();
        user.setBio("bioTest");
        assertEquals("bioTest", user.getBio());
    }

    @Test
    public void getImageUrlTest() {
        User user = new User();
        user.setImageurl("imageUrlTest");
        assertEquals("imageUrlTest", user.getImageurl());
    }

    @Test
    public void getIdTest() {
        User user = new User();
        user.setId("idTest");
        assertEquals("idTest", user.getId());
    }
}
