package kyu6;

import java.util.Random;

public class FilenameGenerator {
    public static String generateName(PhotoManager photoManager) {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 6;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return photoManager.nameExists(generatedString) ? generateName(photoManager) : generatedString;
    }
}
