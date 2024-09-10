class RepetationOfValue {
    public static void main(String[] args) {
        int madhan[] = {1,1,1,2,2,3,4,4,4};
        int maadhav[] = new int[9];
        
        for(int i = 0;i < 9;i++) {
            maadhav[madhan[i]]++;
        }
        
        for(int i = 0;i < 9;i++) {
            if(maadhav[i] > 0)
            {
                System.out.print(i + " -> " + maadhav[i]);
                System.out.println();
            }
        }
    }
}
