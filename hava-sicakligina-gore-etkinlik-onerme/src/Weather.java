import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int heat;

        System.out.print("Sıcaklık değerini giriniz: ");
        heat = inp.nextInt();

        if (heat < 5) {
            System.out.println("Hava Sıcaklığı: " + heat + " Derece");
            System.out.println("Kayak'a gidebilirsiniz!!");

        } else if (heat >= 5 && heat < 15) {
            System.out.println("Hava Sıcaklığı: " + heat + " Derece");
            System.out.println("Sinema'ya gidebilirsiniz!!");

        } else if (heat >= 15 && heat < 25) {
            System.out.println("Hava Sıcaklığı: " + heat + " Derece");
            System.out.println("Piknik'e gidebilirsiniz!!");

        } else if (heat >= 25) {
            System.out.println("Hava Sıcaklığı: " + heat + " Derece");
            System.out.println("Yüzme'ye gidebilirsiniz!!");

        }


        System.out.println("---------Diğer Yazım Şekli---------");


        int heat1;
        System.out.print("Sıcaklık değerini giriniz: ");
        heat1 = inp.nextInt();


        if (heat1 < 5) {
            System.out.println("Hava Sıcaklığı: " + heat1 + " Derece");
            System.out.println("Kayak'a gidebilirsiniz!!");

        } else if (heat1 >= 5 && heat1 <= 25) {
            if (heat1 <= 15) {
                System.out.println("Sinema'ya gidebilirsiniz!!");

            }
            if (heat1 >= 10) {
                System.out.println("Piknik'e gidebilirsiniz!!");

            }
        } else {
            System.out.println("Hava Sıcaklığı: " + heat1 + " Derece");
            System.out.println("Yüzme'ye gidebilirsiniz!!");
        }


    }
}
