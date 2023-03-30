package com.example.myneu;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.myneu.Post.Comment;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class CommentUnitTest {
    @Test
    public void CommentConstructorTest() {
        Comment comment = new Comment("idTest", "commentTest", "publisherTest");
        assertEquals("idTest", comment.getId());
        assertEquals("commentTest", comment.getComment());
        assertEquals("publisherTest", comment.getPublisher());
    }

    @Test
    public void idTest() {
        Comment comment = new Comment();
        comment.setId("idTest");
        assertEquals("idTest", comment.getId());
    }

    @Test
    public void commentTest() {
        Comment comment = new Comment();
        comment.setComment("commentTest");
        assertEquals("commentTest", comment.getComment());
    }

    @Test
    public void publisherTest() {
        Comment comment = new Comment();
        comment.setId("publisherTest");
        assertEquals("publisherTest", comment.getId());
    }
}