package com.warmup.warmup;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import com.warmup.warmup.controllers.GreetingService;

/* 
 * FOR UNIT TESTING A SERVICE
*/
@ExtendWith(MockitoExtension.class)
public class AnotherTest {

    @InjectMocks
    GreetingService gs;

    // @Test
    // public void SaysHi() {
    //     assertEquals("Hello, World", gs.greet());
    // }
}
