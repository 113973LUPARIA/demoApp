package org.example.demoapp.junit;


import org.example.demoapp.junit.concepto1.AssertionsTest;
import org.junit.platform.suite.api.*;

/**
 * Versión nueva JUNIT 5
 * @Suite
 */
@Suite
@SuiteDisplayName("JUnit Platform Suite Demo")
// @SelectPackages("com.example.demo.service.concepto1")
// @IncludeClassNamePatterns(".*Test")
@SelectClasses(AssertionsTest.class)
public class SuiteTest {
}
