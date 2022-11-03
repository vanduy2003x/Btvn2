import java.util.Scanner;

public class Btvn2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("±--------------------------------------------------+");
        System.out.println("1.Giải phương trình bậc nhất \n2.Giải phương trình bậc 2 \n3.Tính tiền điện \n4.Kết thúc");
        System.out.println("±--------------------------------------------------+");
        System.out.println("Chọn chức năng: ");
        int number = scanner.nextInt();
        switch (number){
            case 1:
                System.out.println("Tính phương trình bậc nhất");
                System.out.println("a = ");
                int a = scanner.nextInt();
                System.out.println("b = ");
                int b = scanner.nextInt();
                System.out.println("c = ");
                int c = scanner.nextInt();
                System.out.println(a+ "x + " + b + " = " + c);
                System.out.println((c - b) /a);
                break;
            case 2:
                System.out.println("Tính phương trình bậc hai");
                System.out.println("a = ");
                int a1 = scanner.nextInt();
                System.out.println("b = ");
                int b1 = scanner.nextInt();
                System.out.println("c = ");
                int c1 = scanner.nextInt();
                System.out.println(a1 + "x^2+"+ b1 +"x+" + c1 + " = 0 ");
                int d =(-b1^2) - (4*a1*c1);
                System.out.println(d);
                if (d<0){
                    System.out.println("Phương trình vô nghiệm");
                }
                else if (d==0){
                    System.out.println("x1 = x2="+(-b1/2*a1));
                }
                else if (d>0){
                    System.out.println("x1="+ (-b1 + Math.sqrt(d))/(2*a1));
                    System.out.println("x2="+ (-b1 - Math.sqrt(d))/(2*a1));
                }
            else {
                    System.out.println("Phương trình vô nghiệm");
                }
            break;
            case 3:
                System.out.println("Tính tiền điện");
                System.out.println("Nhập số điện");
                int electricNumber = scanner.nextInt();
                if (electricNumber<1000){
                    System.out.println(electricNumber*50);
                }
                else if (electricNumber>=1000){
                    System.out.println((electricNumber-1000)*55 + (1000*50));
                }
            case 4:
                System.out.println("Kết chương trình");
        }
    }
}
