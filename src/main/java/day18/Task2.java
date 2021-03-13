package day18;

public class Task2 {
    public static void main(String[] args) {

        int a = 787870077;
        System.out.println(count7(a)); //5
    }
    /*
    787870077 / 10 = 78787007
    78787007  / 10 = 7878700
    7878700   / 10 = 787870
    787870    / 10 = 78787
    78787     / 10 = 7878
    7878      / 10 = 787
    787       / 10 = 78
    78        / 10 = 7
    7         / 10 = 0
     */

    public static int count7(int i){
        if (i == 0){
            return 0;
        }

        if (i % 10 == 7){
            return 1 + count7(i / 10);
        }
        else
            return count7(i / 10);
    }
}