void main() {
    {
        System.out.println("Задание 1");
        int[] number = new int[]{1, 2, 3};
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        float[] number2 = new float[]{1.57f, 7.654f, 9.986f};
        System.out.println(number2[0]);
        System.out.println(number2[1]);
        System.out.println(number2[2]);
    }
    {
        System.out.println("Задание 2");
        int[] number = new int[]{1, 2, 3};
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
            if (i < number.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        float[] number2 = new float[]{1.57f, 7.654f, 9.986f};
        for (int i = 0; i < number2.length; i++) {
            System.out.print(number2[i]);
            if (i < number2.length - 1) {
                System.out.print(",");
            }
        }
    }
    System.out.println();
    {
        System.out.println("Задание 3");
        int[] number = new int[]{1, 2, 3};
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        float[] number2 = new float[]{1.57f, 7.654f, 9.986f};
        for (int i = number2.length - 1; i >= 0; i--) {
            System.out.print(number2[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        int[] symbol = new int[]{13, 12, 23};
        for (int i = symbol.length - 1; i >= 0; i--) {
            System.out.print(symbol[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
    }
    System.out.println();
    {
        System.out.println("Задание 4");
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
