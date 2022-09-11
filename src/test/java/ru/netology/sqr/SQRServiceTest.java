package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {

    @Test
    public void test() {
        SQRService service = new SQRService();

        int actual = service.calculate(10, 99);
        int expected = 6;

        assertEquals(expected, actual);
    }
}
