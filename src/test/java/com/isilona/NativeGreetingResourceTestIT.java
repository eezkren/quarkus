package com.isilona;

import com.isilona.resource.GreetingResourceTest;
import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeGreetingResourceTestIT extends GreetingResourceTest {

    // Execute the same tests but in native mode.
}