public class Main {
    // Function for finding the first
    // missing positive number
    static int find(int num[], int n)
    {
        int isExist= 0;
        for (int i = 0; i < n; i++) {
            if (num[i] == 1) {
                isExist = 1;
                break;
            }
        }

        if (isExist == 0)
            return (1);

        for (int i = 0; i < n; i++)
            if (num[i] <= 0 || num[i] > n)
                num[i] = 1;

        for (int i = 0; i < n; i++)
            num[(num[i] - 1) % n] += n;


        for (int i = 0; i < n; i++)
            if (num[i] <= n)
                return (i + 1);


        return (n + 1);
    }

    // Driver Code
    public static void main(String[] args)
    {
        int num[] = { 4,-1,2,1,5 };
        int n = num.length;
        int result = find(num, n);

        System.out.println(result);
    }
}