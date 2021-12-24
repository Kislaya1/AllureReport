package com.allure.report;

import io.qameta.allure.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

@Epic("Allure Report")
@Feature("Allure Test")
public class AllureTest {
  private static final Logger LOGGER = LoggerFactory.getLogger(AllureTest.class.getName());

  @Test
  @Severity(SeverityLevel.BLOCKER)
  @Description("Test Description")
  @Story("Story Description")
  public void test1() throws Exception {
    LOGGER.info("My Test 1");
  }
}
