/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.congthanh.mathutil.main;

import com.congthanh.mathutil.core.MathUtil;

/**
 *
 * @author PC
 */
public class Main {
    
    public static void main(String[] args) {
        
        //thử nghiệm hàm tính giai thừa coi chạy đúng như thiết kế hay ko
        //ta phải đưa ra các tình huống sử dụng hàm trong thực tế
        //ví dụ: -5 coi tính đc hok
        //        0 coi tính mấy
        //        20 coi tính mấy
        //        21 coi tính ra mấy?
        //TEST CASE: 1 tình huống hàm/app/màn hình/tính năng đc đưa vào sử dụng
        //giả lập hành vi xài của ai đó!!!
        
        //TEST CASE: là 1 tình huống sử dụng, xài APP hay xài Hàm mà nó bao gồm:
        //INPUT: DATA đầu vào cụ thể nào đó
        //OUTPUT đầu ra ứng với xử lí của hàm/chức năng của app, dĩ nhiên dùng đầu vào để xử lí
        //KÌ VỌNG: Mong hàm sẽ trả về Value nào đó ứng với input ở trên
        //SO SÁNH để xem kết quả có như kì vọng hay ko 
        
        long expected = 120; //tao kì vọng hàm trả vè 120 nếu tính 5!
        int n = 5;           //input
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected + " expected");
        System.out.println("5! = " + actual + " actual");
    }
}
