package com.user.test;

import com.user.model.User;
import com.user.service.UserService;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceTest {

    UserService service = new UserService();

    @Test
    public void testGreetUser() {
        User user = new User("Zara", 30);
        String message = service.greetUser(user);
        assertEquals("Welcome, Zara!", message);
    }

    @Test
    public void testCanRegisterTrue() {
        User adultUser = new User("Rahul", 20);
        assertTrue(service.canRegister(adultUser));
    }

    @Test
    public void testCanRegisterFalse() {
        User minorUser = new User("Ayan", 14);
        assertFalse(service.canRegister(minorUser));
    }
}
