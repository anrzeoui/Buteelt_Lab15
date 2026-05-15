package lab;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    // --- reverse ---

    @Test
    @DisplayName("Хоосон мөр урвуулах нь хоосон буцаана")
    void reverse_emptyString() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    @DisplayName("Нэг тэмдэгт урвуулах нь өөрөө буцаана")
    void reverse_singleChar() {
        assertEquals("a", StringUtils.reverse("a"));
    }

    @Test
    @DisplayName("ASCII мөр зөв урвуулна")
    void reverse_ascii() {
        assertEquals("olleh", StringUtils.reverse("hello"));
    }

    @Test
    @DisplayName("Юникод тэмдэгт зөв урвуулна")
    void reverse_unicode() {
        assertEquals("сайн", StringUtils.reverse("йнас"));
    }

    @Test
    @DisplayName("null оруулбал null буцаана")
    void reverse_null() {
        assertNull(StringUtils.reverse(null));
    }

    // --- isBlank ---

    @Test
    @DisplayName("null мөр blank мөн")
    void isBlank_null() {
        assertTrue(StringUtils.isBlank(null));
    }

    @Test
    @DisplayName("Хоосон мөр blank мөн")
    void isBlank_empty() {
        assertTrue(StringUtils.isBlank(""));
    }

    @Test
    @DisplayName("Зайтай мөр blank мөн")
    void isBlank_whitespace() {
        assertTrue(StringUtils.isBlank("   "));
    }

    @Test
    @DisplayName("Агуулгатай мөр blank биш")
    void isBlank_nonEmpty() {
        assertFalse(StringUtils.isBlank("hello"));
    }

    // --- capitalize ---

    @Test
    @DisplayName("Эхний үсгийг том болгоно")
    void capitalize_simple() {
        assertEquals("Hello", StringUtils.capitalize("hello"));
    }

    @Test
    @DisplayName("null capitalize хийвэл null буцаана")
    void capitalize_null() {
        assertNull(StringUtils.capitalize(null));
    }

    @Test
    @DisplayName("Хоосон мөр capitalize хийвэл хоосон буцаана")
    void capitalize_empty() {
        assertEquals("", StringUtils.capitalize(""));
    }
}
