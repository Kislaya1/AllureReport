package com.allure.report;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class AllureTest {
  private static final Logger LOGGER = LoggerFactory.getLogger(AllureTest.class.getName());

  @Test
  public void test1() throws Exception {
    LOGGER.info("My Test 1");
  }
}
