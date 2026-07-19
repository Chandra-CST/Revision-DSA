if (n % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Not even");
}

for (int i = 0; i <= 10; i++) {
    System.out.println(i);
}

for (int i = 10; i >= 1; i--) {
    System.out.println(i);
}

for (int i = 0; i <= 10; i += 2) {
    System.out.println(i);
}

for (int i = 10; i >= 1; i -= 2) {
    System.out.println(i);
}

for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}

int[] arr = {1, 2, 3, 4, 5};

for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}

System.out.println(arr[2]);
