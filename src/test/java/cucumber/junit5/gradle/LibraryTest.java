package cucumber.junit5.gradle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LibraryTest {
    @Test
    void testLibraryMethod() {
        assertTrue(new Library().someLibraryMethod());
    }
}
