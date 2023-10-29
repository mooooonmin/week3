package com.example.week3_prac;

import com.example.week3_prac.food.Food;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

    @Autowired
    @Qualifier("pizza")
    Food food;

    @Test
    @DisplayName("Primary & Qualifer 더 높은 우선순위 확인")
    void test1() {
        food.eat();
    }

}
