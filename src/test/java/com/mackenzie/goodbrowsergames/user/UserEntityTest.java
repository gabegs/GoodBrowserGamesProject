package com.mackenzie.goodbrowsergames.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.mackenzie.goodbrowsergames.UnitsTestCase;
import com.mackenzie.goodbrowsergames.exception.ForumException;
import com.mackenzie.goodbrowsergames.exception.ForumException.ErrorCode;
import com.mackenzie.goodbrowsergames.user.Gender;
import com.mackenzie.goodbrowsergames.user.Role;
import com.mackenzie.goodbrowsergames.user.User;

import org.junit.Test;

public class UserEntityTest extends UnitsTestCase {

    @Test
    public void testCreateUserWithGender() {
        User user = new User();
        user.setGender(Gender.MALE);
        assertEquals(Gender.MALE, user.getGender());
    }

    @Test
    public void testParseMaleGender() {
        assertEquals(Gender.MALE, Gender.parse("m"));
        assertEquals(Gender.MALE, Gender.parse("M"));
        assertEquals(Gender.MALE, Gender.parse("male"));
        assertEquals(Gender.MALE, Gender.parse("Male"));
        assertEquals(Gender.MALE, Gender.parse("MALE"));
        assertNotEquals(Gender.MALE, Gender.parse("FEMALE"));
        assertNotEquals(Gender.MALE, Gender.parse("F"));
        assertNotEquals(Gender.MALE, Gender.parse("f"));
    }

    @Test
    public void testParseFemaleGender() {
        assertEquals(Gender.FEMALE, Gender.parse("f"));
        assertEquals(Gender.FEMALE, Gender.parse("F"));
        assertEquals(Gender.FEMALE, Gender.parse("Female"));
        assertEquals(Gender.FEMALE, Gender.parse("female"));
        assertEquals(Gender.FEMALE, Gender.parse("FEMALE"));
        assertEquals(Gender.FEMALE, Gender.parse("f   "));
        assertNotEquals(Gender.FEMALE, Gender.parse("m"));
        assertNotEquals(Gender.FEMALE, Gender.parse("M"));
        assertNotEquals(Gender.FEMALE, Gender.parse("Male"));
        assertNotEquals(Gender.FEMALE, Gender.parse("MALE"));
    }

    @Test
    public void testParseInvalidGenderShouldThrowException() {
        String[] invalidValues = {"", " ", "123", "-m", "fm", "mm", "male male"};
        for (String value : invalidValues) {
            try {
                Gender.parse(value);
                fail();
            } catch (Exception e) {
                assertTrue(e instanceof ForumException);
                assertEquals(ErrorCode.INVALID_GENDER, ((ForumException) e).getErrorCode());
            }
        }
    }

    @Test
    public void testUserDefaultRoleShouldBeUndefined() {
        User user = new User();
        assertEquals(Role.UNDEFINED, user.getRole());
    }
}
