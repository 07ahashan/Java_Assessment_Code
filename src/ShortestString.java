public class ShortestString {
    public static String shorteststring(String str) {

        String[] arr = str.split(" ");

        int min_length = Integer.MAX_VALUE;
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if (min_length > arr[i].length()) {
                min_length = arr[i].length();
                result = arr[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str="hey i am amir ali";
        System.out.println( shorteststring(str));
    }
}
