package com.demo.build_exe;

import org.junit.jupiter.api.Test;

//@SpringBootTest
class BuildExeApplicationTests {

    @Test
    void contextLoads() {

        System.getenv().forEach(
                (key, value) -> System.out.println(key + "" + value)
        );

    }

}
