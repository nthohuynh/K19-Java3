package menu;
import java.util.Scanner;
public class xaydungchuongtrinh {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x[] = new int [5];
		while (true) {
			System.out.println("----Menu----");
			System.out.println("1. Nhap mang");
			System.out.println("2. Xuat mang");
			System.out.println("3. Tim phan tu nho nhat");
			System.out.println("4. Sap xep theo chieu giam dan");
			System.out.println("0. ket thuc CT");
			System.out.println("Chon chuc nang so ? ");
			int n = scanner.nextInt();
			if (n == 1) {
				for (int i = 0; i < 5; i++ ) {
					System.out.println("nhap cac so nguyen cac mang  x["+i+"] = ");
					x[i] = scanner.nextInt();
				}
				System.out.println();				
			}
			else if (n == 2) {
				for (int i = 0; i < 5; i++) {
					System.out.print("\t"+x[i]);
				}
			}
			else if (n == 3) {
				int min = x[1];
				for (int i = 1; i < 5; i++) {
					if (x[i] < min) {
						min = x[i];
					}
				}
				System.out.println(min);
			}
			else if (n == 4) {
				for (int i = 0; i < 4; i++) {
					for (int j = i + 1; j < 5; i++) {
						if (x[i] < x[j]){
							int tam = x[j];
							x[j] = x[i];
							x[i] = tam;
						}
					}
				}
				for (int i = 0; i < 5; i++) {
				System.out.println("\t" +x[i]);
			}
	}
			else break;
}

	}

}

	
