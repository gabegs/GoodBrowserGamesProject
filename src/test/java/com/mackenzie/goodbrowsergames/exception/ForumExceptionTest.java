package com.mackenzie.goodbrowsergames.exception;

import static org.junit.Assert.assertEquals;

import com.mackenzie.goodbrowsergames.UnitsTestCase;
import com.mackenzie.goodbrowsergames.exception.ForumException;
import com.mackenzie.goodbrowsergames.exception.ForumException.ErrorCode;

import org.junit.Test;

public class ForumExceptionTest extends UnitsTestCase {

    @Test
    public void testShouldGetMessageBasedOnErrorCode() {
        ForumException exception = new ForumException(ErrorCode.INTERNAL_ERROR);
        assertEquals("Internal server error", exception.getMessage());
    }

}
