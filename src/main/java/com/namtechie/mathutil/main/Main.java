package com.namtechie.mathutil.main;

import static com.namtechie.mathutil.core.MathUtility.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        testFactorialGivenWrongArgumentMinus5ThrowsException();
    }
    // Về lý thuyết ta phải test với data n = 1, 2, 3, 4,... 20
    //TEST CASE #4
    //DESCRIPTION: TEST FACTORIAL WITH INVALID ARGUMENT, E.G N = -1
    //STEPS:
    //  CALL GETFACTORIAL(-5)
    //EXPECTED RESULT:
    //   AN EXPECTED IS THROWN - KÌ VỌNG 1 NGOẠI LỆ XH

    //DIỄN GIẢI THÊM: HÀM CỦA TA THIẾT KẾ RẰNG NẾU ĐƯA N - HÀM SẼ CHỬI
    //NẾU TA TEST N ÂM, TA SẼ NHẬN VỀ CHỬI -> HÀM TA CHẠY ĐÚNG NHƯ THIẾT KẾ
    //THẤY NGOẠI LỆ MỪNG RƠI NƯỚC MẮT
    static void testFactorialGivenWrongArgumentMinus5ThrowsException() {
        getFactorial(-5);

    }

    //TEST CASE #3
    static void testFactorialGivenRightArgument5RunsWell() {
        System.out.println("5! expected 120 \n actual: " + getFactorial(5));

    }

    //TEST CASE #2
    // Description: check getFactorial() method with argument (n = 1)
    // Step/ Procedures: (cách test, các bước verify hàm, chức năng
    // Call function/ method with n = 1 getFactorial(1)
    // Expected Result: (hy vọng gọi 1! giá trị trả về là mấy
    // To have 1 á the result ò 1!
    // Status (passed/ failed - bug): mình phải run hàm và nhìn giá trị trả về mới biết hàm chạy đúng hay sai
    //          PASSED!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    //CHẠY TEST CASE/ LÀM CÁC BƯỚC Ở TRÊN ĐỂ XÁC ĐỊNH ĐƯỢC HÀM ĐÚNG HAY SAU
    // -> GỌI LÀ TEST RUN
    static void testFactorialGivenRightArgument1RunsWell() {
        int n = 1;// data đưa vào
        long expectedValue = 1;
        long actualValue = getFactorial(1);
        // SO SÁNH BẰNG MẮT ĐỂ LUẬN KẾT QUẢ ĐÚNG SAI
        System.out.println("Expected result: " + expectedValue);
        System.out.println("Actual result: " + actualValue);
        System.out.println("Test case #2 passed: " + (expectedValue == actualValue));
    }


    //CÁC TEST CASE ĐỂ DƯỚI ĐÂY, LÁT HỒI RUN TRONG MAIN()
    static void testFactorialGivenRightArgument0RunsWell() {
        // TEST CASE #1:
        // Description: Check getFactorial() function with valid argument (n = 0)
        //Step:
        //      Call function/ method with n = 0 getFactorial(0)
        //Expected result:
        //      Get 1 as the result of 0!
        //Actual result/status (passed/ failed) (waiting for run):
        //

        //TEST RUN: RUN test case
        long expectedResult = 1;
        long actualResult = getFactorial(0);//named-argument
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result: " + actualResult);
        System.out.println("Test case #1 passed: " + (expectedResult == actualResult));
    }

}