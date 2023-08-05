package Socrative_05092023;

public class C03_05092023 {


        int x = 1;

        static int y;

    C03_05092023(int i){

            x = x + i;

            y = y + i;

        }

        public static void main(String[] args) {

            C03_05092023 obj1 = new C03_05092023(5);

            System.out.println(obj1.x + ", " + obj1.y);

            C03_05092023 obj2 = new C03_05092023(7);

            System.out.println(obj2.x + ", " + obj2.y);

        }

    }

