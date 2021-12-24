package com.allure.report;

import io.qameta.allure.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

@Epic("Allure Report")
@Feature("Allure Test")
public class AllureTest {
  private static final Logger LOGGER = LoggerFactory.getLogger(AllureTest.class.getName());

  @Test
  @Owner("Kislaya")
  @Severity(SeverityLevel.BLOCKER)
  @Description("Test Description")
  @Story("Story Description")
  public void test1() throws Exception {
    Assert.assertTrue(true);
    LOGGER.info("My Test 1");
  }

  @Test
  @Owner("Kislaya")
  @Severity(SeverityLevel.BLOCKER)
  @Description("Test Description")
  @Story("Story Description")
  public void test2() throws Exception {
    Assert.assertTrue(true);
    LOGGER.info("My Test 1");
  }

  @Test
  @Owner("Kislaya")
  @Severity(SeverityLevel.BLOCKER)
  @Description("Test Description")
  @Story("Story Description")
  public void test3() throws Exception {
    Assert.assertTrue(true);
    LOGGER.info("My Test 1");
  }

  @Test
  @Owner("Kislaya")
  @Severity(SeverityLevel.BLOCKER)
  @Description("Test Description")
  @Story("Story Description")
  public void test4() throws Exception {
    Assert.assertTrue(true);
    LOGGER.info("My Test 1");
  }

  @Test
  @Owner("Kislaya")
  @Severity(SeverityLevel.BLOCKER)
  @Description("Test Description")
  @Story("Story Description")
  public void test5() throws Exception {
    Assert.assertTrue(true);
    LOGGER.info("My Test 1");
  }

  @Test
  @Owner("Kislaya")
  @Severity(SeverityLevel.BLOCKER)
  @Description("Test Description")
  @Story("Story Description")
  public void test6() throws Exception {
    Assert.assertTrue(true);
    LOGGER.info("My Test 1");
  }

  @Test
  @Owner("Kislaya")
  @Severity(SeverityLevel.BLOCKER)
  @Description("Test Description")
  @Story("Story Description")
  public void test7() throws Exception {
    Assert.assertTrue(true);
    LOGGER.info("My Test 1");
  }

  @Test
  @Owner("Kislaya")
  @Severity(SeverityLevel.BLOCKER)
  @Description("Test Description")
  @Story("Story Description")
  public void test8() throws Exception {
    Assert.assertTrue(true);
    LOGGER.info("My Test 1");
  }

  @Test
  @Owner("Kislaya")
  @Severity(SeverityLevel.BLOCKER)
  @Description("Test Description")
  @Story("Story Description")
  public void test9() throws Exception {
    Assert.assertTrue(true);
    LOGGER.info("My Test 1");
  }

  @Test
  @Owner("Kislaya")
  @Severity(SeverityLevel.BLOCKER)
  @Description("Test Description")
  @Story("Story Description")
  public void test10() throws Exception {
    Assert.assertTrue(true);
    LOGGER.info("My Test 1");
  }

  @Test
  @Owner("Kislaya")
  @Severity(SeverityLevel.BLOCKER)
  @Description("Test Description")
  @Story("Story Description")
  public void test11() throws Exception {
    Assert.assertTrue(true);
    LOGGER.info("My Test 1");
  }

  @Test
  @Owner("Kislaya")
  @Severity(SeverityLevel.BLOCKER)
  @Description("Test Description")
  @Story("Story Description")
  public void test12() throws Exception {
    Assert.assertTrue(true);
    LOGGER.info("My Test 1");
  }

  @Test
  @Owner("Kislaya")
  @Severity(SeverityLevel.BLOCKER)
  @Description("Test Description")
  @Story("Story Description")
  public void test13() throws Exception {
    Assert.assertTrue(true);
    LOGGER.info("My Test 1");
  }
}
