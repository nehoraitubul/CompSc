package Year1.Semester1.TestPrep.ShaiFile;

public class Exe17 {
    public static String func17(String str){
        String[] arr = str.split(" ");
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            char tempUp = arr[i].toUpperCase().charAt(0);
            char tempDown = arr[i].toLowerCase().charAt(0);
            if (result.length() == 0){
                result += arr[i].charAt(0);
            }
            boolean isExist = false;
            for (int j = 0; j < result.length(); j++) {
                char temp = result.charAt(j);
                if (temp == tempDown || temp == tempUp){
                    isExist = false;
                    break;
                } else {
                    isExist = true;
                }
            }
            if (isExist){
                result += arr[i].charAt(0);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "I want it, I got it";
        System.out.println("func:" + func17(str));
    }
}
