package com.allure.report;

import io.qameta.allure.Allure;

public final class LogUtils {
  private LogUtils() {}

  public static void allureLogging(final String logs) {
    Allure.addAttachment("Logging", logs);
  }
}
