package kyu6;

import org.junit.jupiter.api.Test;



class FilenameGeneratorTest {
    @Test
    public void shouldBeSameName() {
        PhotoManager photoManager = new PhotoManager();
        for (int i = 0; i < 3000; i++) {
            FilenameGenerator.generateName(photoManager);
        }

        System.out.println(photoManager.names);
        System.out.println(photoManager.names.size());
    }

}