package testng.listener;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testng.dataprovider.DataProviderFactory;
import testng.listeners.MyAnnotationTransformer;

import java.util.Map;

/**
 * Annotations are static in nature by design, so any change in the values require recompilation of source files.
 * IAnnotationTransformer allows to add/remove annotation at run time
 * here we add a data provider at run time to the test using class MyAnnotationTransformer which has implemented
 * IAnnotationTransformer listener interface
 */

public class AnnotationTransformerTest {

    @Test
    public void add_data_provider_run_time_test(Map<String,Object> village) {
        System.out.println("Method 'add_data_provider_run_time_test'" + " Village : " + village.get("village").toString());
    }


    @Test
    public void disable_run_time_test() {
        System.out.println("Disable test_run_time");
    }
}
