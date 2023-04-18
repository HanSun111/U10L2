public class Evens {
    public static void main(String[] args) {
        int[] i = {1, 2, 3, 4};
        System.out.println(countEvens(i, i.length - 1));
    }

    public static int countEvens(int[] array, int i) {

        if (i == 0 && array[0] % 2 == 0) {
            return array[0];
        }
        if (i == 0) {
            return 0;
        } else {
            if (array[i] % 2 == 0) {
                return 1 + countEvens(array, i - 1);
            } else return countEvens(array, i - 1);
        }
    }

    public static boolean isPalindrome(String p) {
        if (p.length() == 0 || p.length() == 1) {
            return true;
        }
        if (p.charAt(0) != p.charAt(p.length() - 1)){
            return false;
        }
        else return (isPalindrome(p.substring(1, p.length() - 1)));
    }
    public static int findMaximum(int[] array, int i) {
        if (i == array.length - 1)
        {
            return array[i];
        }
        int val = findMaximum(array, i + 1);
        if (val > array[i])
        {
            return val;
        }
        else
        {
            return array[i];
        }
    }

}