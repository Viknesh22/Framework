package org.testdependency;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({JavaUnit.class, Mozilla.class, Microsoft.class})
public class RunnerClass {

}
