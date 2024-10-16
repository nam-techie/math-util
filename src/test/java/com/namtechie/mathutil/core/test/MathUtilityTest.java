package com.namtechie.mathutil.core.test;

import static com.namtechie.mathutil.core.MathUtility.*;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {
    // Test case #3: Check getFactorial() with n = -5 to see the exception
    //tôi muốn thấy có ngoại lệ xuất hiện trong tình huống n âm hoặc n > 20
    // ngoại lệ có xuất hiện như dự kiến hay không.. nếu có thì phải là màu xanh!!!
    // NGHE KĨ: CÓ NGOẠI LỆ, NHƯNG LÀ MÀU XANH, VÌ NGOẠI LỆ XUẤT HIỆN NHƯ DỰ KIẾN
    @Test
    void testFactorialGivenWrongArgumentThrowsException() {
//        getFactorial(-5);
        assertThrows(IllegalArgumentException.class, () -> {getFactorial(-5);});
        assertThrows(IllegalArgumentException.class, () -> {getFactorial(22);});

    }



    // Test case #2: Check getFactorial() with n = 5 to see the result of 120
    @Test
    void testFactorialGivenRightArgument5RunsWell() {
        assertEquals(1, getFactorial(1));
        assertEquals(2, getFactorial(2));
        assertEquals(6, getFactorial(3));
        assertEquals(24, getFactorial(4));
        assertEquals(120, getFactorial(5));
        assertEquals(720, getFactorial(6));

    }

    //Structure test case: ID, Description, Steps/ Procedures, Expected Result, Actual Result, Status: Passed, Failed
    // Test Date, Bug# (bug id) Bugzilla (Bug DB)
    //                          Jira
    // Test case #1: Check getFactorial() with n - 0 to see the result of 1
    //
    @Test
    void testFactorialGivenRightArgument0RunsWell() {
        long expectedValue = 1; // hope 0! = 1
        long actualValue = getFactorial(0);
        //model: plus tool, library, unit testing framework JUnit
        // help me view the right result by two colors: red and green

        assertEquals(expectedValue, actualValue);
    }
}