package kyu5.Predictive_contact_list;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PredictiveContactListTest {

    @Test
    public void testPredictionUsingOneKeystroke() {
        // given
        List<String> inputContacts = Arrays.asList(
                "jones", "thompson", "brown", "taylor",
                "bow", "smith", "cox", "timmons"
        );
        String keystrokes = "2";

        // when
        List<String> outputContacts = PredictiveContactList.predict(inputContacts, keystrokes);

        // then
        List<String> result = Arrays.asList("brown", "bow", "cox");
        assertEquals(result, outputContacts);
    }

    @Test
    public void testPredictionUsingThreeKeystrokes() {
        // given
        List<String> inputContacts = Arrays.asList(
                "jones", "thompson", "brown", "taylor",
                "bow", "smith", "cox", "timmons"
        );
        String keystrokes = "269";

        // when
        List<String> outputContacts = PredictiveContactList.predict(inputContacts, keystrokes);

        // then
        List<String> result = Arrays.asList("bow", "cox");
        assertEquals(result, outputContacts);
    }

}