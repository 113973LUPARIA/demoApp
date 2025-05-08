package org.example.demoapp.junit;

import org.example.demoapp.junit.concepto10.TagFilterTest;
import org.example.demoapp.junit.concepto9.SmartphoneParameterizedTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)

// paquetes
//@SelectPackages("com.example.demo")
//@SelectPackages({"com.example.demo.service.concepto1", "com.example.demo.service.concepto2"})

// clases
//@SelectClasses(TagFilterTest.class)
//@SelectClasses({TagFilterTest.class, SmartphoneParameterizedTest.class})

// tags
//@IncludeTags("database")
public class Suite2Test {
}
