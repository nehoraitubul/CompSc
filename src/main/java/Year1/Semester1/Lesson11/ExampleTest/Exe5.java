package Year1.Semester1.Lesson11.ExampleTest;

public class Exe5 {
    public static String encodeSoundex(String name) {
        String upperCaseName = name.toUpperCase();
        char firstChar = upperCaseName.charAt(0);
        char[] oneReplace = {'V', 'P', 'F', 'B'};
        char[] twoReplace = {'C', 'G', 'J', 'K', 'Q', 'S', 'X', 'Z'};
        char[] threeReplace = {'D', 'T'};
        char[] fourReplace = {'L'};
        char[] fiveReplace = {'M', 'N'};
        char[] sixReplace = {'R'};
        for (int j = 0; j < oneReplace.length; j++) {
                upperCaseName = upperCaseName.replace(oneReplace[j], '1');
        }
        for (int j = 0; j < twoReplace.length; j++) {
                upperCaseName = upperCaseName.replace(twoReplace[j], '2');
        }
        for (int j = 0; j < threeReplace.length; j++) {
                upperCaseName = upperCaseName.replace(threeReplace[j], '3');
        }
        for (int j = 0; j < fourReplace.length; j++) {
                upperCaseName = upperCaseName.replace(fourReplace[j], '4');
        }
        for (int j = 0; j < fiveReplace.length; j++) {
                upperCaseName = upperCaseName.replace(fiveReplace[j], '5');
        }
        for (int j = 0; j < sixReplace.length; j++) {
                upperCaseName = upperCaseName.replace(sixReplace[j], '6');
        }
        upperCaseName = firstChar + upperCaseName.substring(2);
        String result = "" + upperCaseName.charAt(0);
        System.out.println(result);
        for (int i = 1; i < upperCaseName.length(); i++) {
            if (upperCaseName.charAt(i - 1) != upperCaseName.charAt(i)){
                result += upperCaseName.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String name = "Jackson";
        System.out.println(encodeSoundex(name));
    }
}
