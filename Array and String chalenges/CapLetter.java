public class CapLetter {

    public void capitalize(String line) {

        line = line.strip();
        String[] words = line.split(" ");

        for (int i = 0; i < words.length; i++) {
            StringBuilder newWord = new StringBuilder();

            String currentWord = words[i];
            char[] letters = currentWord.toCharArray();

            char firstLetter = letters[0];
            char capFirstLetter = Character.toUpperCase(firstLetter);
            letters[0] = capFirstLetter;

            for (int j = 0; j < letters.length; j++) {
                newWord.append(letters[j]);
            }

            words[i] = newWord.toString();
        }

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

    }
}