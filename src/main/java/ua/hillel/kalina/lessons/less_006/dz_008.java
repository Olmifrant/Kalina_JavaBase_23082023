package ua.hillel.kalina.lessons.less_006;

public class dz_008 {
    public static void main(String[] args) {

        int counter = 0;
        for (int i = 1; counter < 100; i++) {

            if (i < 10) {
                if (i == 4 || i == 9) {
                    continue;

                }
                counter++;
                System.out.println("Шатл номер " + counter + " " +  "получает имя  " + i);
                continue;



            }
            if (i == 10 || i < 100){
                int a = i / 10;
                int b = i % 10;
                if (a == 4 || a == 9 || b == 4 || b == 9){
                    continue;
                }
                counter++;
                System.out.println("Шатл номер " + counter + " " +  "получает имя  " + i);
                continue;


            }
            if (i == 100 || i < 1000){
                int l = (i / 10 ) / 10;
                int n = i /10;
                int m = i / 10 % 10;
                int k = i % 10;
                if (l == 4 || l == 9 || m == 4 || m == 9 || n == 4 || n == 9 || k == 4 || k == 9) {
                    continue;
                }
                counter++;
                System.out.println("Шатл номер " + counter + " " +  "получает имя  " + i);

            }

        }
        System.out.println();
        System.out.println("Удачного полета суеверные китайцы)))");


    }
}



