package CodingChallange.hacker_rank;

class MyBook extends Book {
    public static void main(String[] args) {
        int res = divisor_sum(20);
        System.out.println(res);
    }

    public static int divisor_sum(int n) {
        int sum = 0;
        int num = n;
        while (num > 0) {
            if (n % num == 0) {
                sum += num;
            }
            num--;
        }
        return sum;
    }

        @Override
    void setTitle(String name) {
        super.title = name;
//        System.out.print(name);
    }
}
