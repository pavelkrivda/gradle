package com.example.gradle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GradleApplicationTests {

    @Test
    void contextLoads() {
        Assertions.assertTrue(true);
    }

    @Test
    void contextLoads2() {
        Assertions.assertTrue(false);
    }
}
