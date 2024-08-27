class TernaryExample {
    public static void main(String[] args) {
        int a = 48;
        int b = 32;
        int c = 27;
        System.out.println((a > b) ? ((a > c) ? a : c):((b > c)?b : c));
    }
}
