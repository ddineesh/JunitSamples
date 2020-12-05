package com.dinesh.junit.helper;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ArraysCompareTest.class, QuickTestBeforeAfter.class, StringHelperRunWithParameterizedTest.class })
public class AllTests {

}
