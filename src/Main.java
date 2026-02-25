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
        System.out.print(number[0] + ",");
        System.out.print(number[1] + ",");
        System.out.println(number[2]);
        float[] number2 = new float[]{1.57f, 7.654f, 9.986f};
        System.out.print(number2[0] + ",");
        System.out.print(number2[1] + ",");
        System.out.println(number2[2]);
    }
    {
        System.out.println("Задание 3");
        int[] number = new int[]{1, 2, 3};
        System.out.print(number[2] + ",");
        System.out.print(number[1] + ",");
        System.out.println(number[0]);
        float[] number2 = new float[]{1.57f, 7.654f, 9.986f};
        System.out.print(number2[2] + ",");
        System.out.print(number2[1] + ",");
        System.out.println(number2[0]);
    }
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
