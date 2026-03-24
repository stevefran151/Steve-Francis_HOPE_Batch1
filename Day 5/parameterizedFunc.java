class parameterizedFunc {
    static int add(int a, int b) {
        return a + b;
    }

    static void greet(String name) {
        System.out.println("Hello " + name);
    }

    static void display(int age, String name) {
        System.out.println(name + " " + age);
    }

    static int sum(int... nums) {
        int total = 0;
        for (int n : nums) total += n;
        return total;
    }

    static void printArray(int[] arr) {
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(add(2, 3));
        greet("Steve");
        display(22, "John");
        System.out.println(sum(1, 2, 3, 4));
        printArray(new int[]{10, 20, 30});
        System.out.println(add(1, 2, 3));
    }
}