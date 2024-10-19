package com.namtechie.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
    //@Test là 1 phần annotation của framework, biến cái hàm của ta thành hàm main
    // để có thể run, hàm bình thường chỉ có thể trong main() chạy
    //@Tét biến hàm bất kì thành main()

    //Kĩ thuật DDT - Data Driven Testing: là kĩ thuật tách bộ data kiểm thử ra
    //khỏi các câu lệnh kiểm thử, mục đích giúp developer nhìn nhanh được xem
    // bộ test case còn thiếu case nào hay không
    // kĩ thuật này được gọi tên khác là tham số hóa bộ data kiểm thử
    //                                                      parameterized testing

    //ta làm riêng một hàm, phải là static, để lưu bô data kiểm thử
    public static Object[] initTestData() {
        return new Object[][]
                {
                        {0, 1},
                        {1, 1},
                        {2, 2},
                        {3, 6},
                        {4, 24},
                        {5, 120},
                        {6, 7200}
                };
    }

    @ParameterizedTest
    @MethodSource("initTestData")
    void testFactorialGivenRightArgumentRunsWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }

    public static Integer[] initTestDataForCheckingException(){
        return new Integer[] {-1, -2, -3, -4, -5, -6, -100, 21, 22, 23, 24, 100};
    }

    @ParameterizedTest
    @MethodSource("initTestDataForCheckingException")
    void testFactorialGivenRWrongArgumentThrowsException(int n) {
        assertThrows(IllegalArgumentException.class,
                () -> MathUtility.getFactorial(n));// biểu thức lamda
    }


}