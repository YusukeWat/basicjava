package ch01.ex01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    private ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(byteArrayOutputStream));
    }

    @Test
    public void testMain() {
        final String expected = "HelloWorld";

        Main.main(new String[]{});

        System.out.flush();
        final String actual = byteArrayOutputStream.toString();

        assertEquals(expected, actual);
    }

    @AfterEach
    public void tearDown() {
        System.setOut(System.out);
    }
}
