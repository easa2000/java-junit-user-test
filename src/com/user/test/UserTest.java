package com.user.test;

import org.junit.Test;
import com.user.model.User;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void testUserCreation() {
        User user = new User("Ali", 25);
        assertEquals("Ali", user.getName());
        assertEquals(25, user.getAge());
        assertTrue(user.isAdult());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUserWithEmptyName() {
        new User("", 22);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUserWithWhitespaceOnlyName() {
        new User("   ", 22);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUserWithNullName() {
        new User(null, 22);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUserWithNegativeAge() {
        new User("Ali", -5);
    }

    @Test
    public void testIsAdultFalse() {
        User user = new User("Sam", 15);
        assertFalse(user.isAdult());
    }
}
