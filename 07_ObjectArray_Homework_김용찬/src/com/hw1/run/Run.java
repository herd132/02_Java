package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {
    public static void main(String[] args) {
       
        Employee[] emp = new Employee[3];
        emp[0] = new Employee(0, "김말똥", "영업부", "팀장", 30, 'M', 3000000, 0.2, "01055559999", "전라도 광주");
        emp[1] = new Employee(1, "홍길동", "기획부", "부장", 19, 'M', 4000000, 0.3, "01022223333", "서울 잠실");
        emp[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");

       for(int i = 0; i < emp.length; i++) {
    	   System.out.println(emp[i]);
       }

    
    }
}