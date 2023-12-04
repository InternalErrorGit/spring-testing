package net.internalerror.springtesting;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SpringTestingApplicationTests {

  @Test
  void contextLoads() {
    assertFalse(Boolean.parseBoolean("1"));
  }

}
