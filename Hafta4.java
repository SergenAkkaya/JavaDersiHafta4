public class Hafta4 {
    public static void main(String[] args) {
        //for (int i = 0; i <=10; i++) {
        //    System.out.println(i);
        //}
        int i=0;
        while (i<10) {
            System.out.println(i);
            i++;
        }
        System.out.println("---------------------------------");
        int toplam=0;
        int j=0;
        int N=10;
        while (j<=N) {
            toplam+=j;
            j++;
        }
        System.out.println(toplam);
    }
}