package com.denre.employees;

import java.time.LocalDate;

public class Laptop {
    public static void main(String[] args) {
        Dell d1 = new Dell("Roy", "Ram", LocalDate.now(), 35000.0);
        HP hp1 = new HP("Smith", "John", LocalDate.of(2021, 12, 1), 68000.00);
        System.out.println(d1);
        System.out.println(hp1);
    }
}
