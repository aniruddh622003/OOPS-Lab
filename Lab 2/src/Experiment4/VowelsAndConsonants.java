package Experiment4;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        int vowelCount = 0;
        int consonantcount = 0;
        String str = "Lets count the number of Vowels and Consonants";
        str = str.toLowerCase();
        System.out.println("Lowercase sentence: " + str);
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                if(str.charAt(i) == 'a' || str.charAt(i) == 'i' || str.charAt(i) == 'e' || str.charAt(i) == 'o' ||
                        str.charAt(i) == 'u'){
                    vowelCount += 1;
                }
                else {
                    consonantcount += 1;
                }
            }
        }
        System.out.println("Vowel count: " + vowelCount);
        System.out.println("Consonant count: " + consonantcount);
    }
}





