package test_suite.com.wipro.test;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Presence.class,SortingValues.class,Concatination.class})
public class AllTests {

}
