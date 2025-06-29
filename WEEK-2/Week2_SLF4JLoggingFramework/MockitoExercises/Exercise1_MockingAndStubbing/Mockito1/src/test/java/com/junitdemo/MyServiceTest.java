package com.junitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Step 1: Mock ExternalApi
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Step 2: Stub the getData method to return "Mock Data"
        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: Inject mock into MyService and test
        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        // Step 4: Assert the result
        assertEquals("Mock Data", result);
    }
}
