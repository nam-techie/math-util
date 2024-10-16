package com.namtechie.mathutil.core;

// tạo bộ thư viện cung cấp các hàm tiện ích liên quan tóan học
//vì là đồ tiện ích dùng chung, tool cho nhiều nơi sử dụng -> hàm static
public class MathUtility {

    //hàm tính n! = 1.2.3....n
    //ko tính giai thừa âm
    //0! = 1! = 1
    // 20! vừa đủ kiểu long, 18 con số 0
    // bài này ko chơi với 21!
    public static long getFactorial(int n) {

        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid number. Number must be between 0 to 20");
        if (n == 0 || n == 1)
            return 1; // 0! = 1! = 1
        //sống sót đến chỗ này, n = 2 3 4 .... 20
        // vòng for nhân dồn - nguyên lí con heo đất
        long result = 1;//tích ban đầu là 1
        for (int i = 2; i <= n; i++)
            result *= i;

        return result;
    }
}
