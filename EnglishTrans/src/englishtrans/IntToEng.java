package englishtrans;
import java.util.Scanner;

public class IntToEng {
	 // ���C�����\�b�h
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // ���l���p�󂷂�ϊ����郁�\�b�h
    public static String translateEng(int n) {
    	String a[] = {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
        return a[n];
    }
}

