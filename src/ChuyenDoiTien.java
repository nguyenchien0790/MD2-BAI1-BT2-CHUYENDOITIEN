import java.util.Scanner;

public class ChuyenDoiTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd,usd;
        int change;
        System.out.println("Chon 1 de chuyen tu Vnd sang USD" + "\n"+"Chon 2 de chuyen tu USD sang");
        System.out.println("Nhap so (chon 1 hoac 2) : ");
        change =scanner.nextInt();
        if (change ==1 ){
            System.out.println("Moi nhap so tien (VND) : ");
            vnd =scanner.nextDouble();
            System.out.println("So tien chuyen doi sang USD la : "+ vnd/23000+ " USD");
        } else if (change ==2) {
            System.out.println("Moi nhap so tien (USD) : ");
            usd = scanner.nextDouble();
            System.out.println("So tien chuyen doi sang VND la : "+ usd*23000 + " VND");
        }else {
            System.out.println("Ban da chon sai");
        }
    }

}
