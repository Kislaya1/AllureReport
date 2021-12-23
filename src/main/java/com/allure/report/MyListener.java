package com.allure.report;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {
  private static final Logger LOGGER = LoggerFactory.getLogger(MyListener.class.getName());

  @Override
  public void onTestSuccess(ITestResult iTestResult) {
    LOGGER.info("Test Passed");
  }

  @Override
  public void onTestFailure(ITestResult iTestResult) {
    LOGGER.info("Test Failed");
  }

  @Override
  public void onTestSkipped(ITestResult iTestResult) {
    LOGGER.info("Test Skipped");
  }
}
