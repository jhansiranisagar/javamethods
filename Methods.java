public class Methods {

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double cToF(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static int countVowels(String str) {
        if (str == null) {
            return 0;
        }

        int count = 0;

        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static String format(double salary) {
        return "$" + salary;
    }

    public static String format(double salary, String currencySymbol) {
        return currencySymbol + salary;
    }

    public static int getMax(int a, int b) {
        return Math.max(a, b);
    }

    public static int getMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void reverse(int[] arr) {
        if (arr == null) {
            return;
        }

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static int getMinIndex(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static int[] merge(int[] a, int[] b) {
        if (a == null) {
            a = new int[0];
        }

        if (b == null) {
            b = new int[0];
        }

        int[] result = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            result[a.length + i] = b[i];
        }

        return result;
    }

    public static boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }

        text = text.toLowerCase();

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static int getFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }
}
