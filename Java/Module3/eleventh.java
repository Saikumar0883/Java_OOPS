import java.util.Scanner;

class Products {
    int pid;
    int quantity;
    String pName;
    double price;

    Products() {
    }

    Products(int id, double p) {
        this.pid = id;
        this.price = p;
    }
}

public class eleventh {
    public static void main(String[] args) {
        Products products[] = new Products[5];
        products[0] = new Products(1, 99.9);
        products[1] = new Products(2, 20.2);
        products[2] = new Products(3, 6.87);
        products[3] = new Products(4, 45.5);
        products[4] = new Products(5, 40.49);

        double sum = 0;
        for (int i = 0; i < 3; i++) {
            int id, q;
            Scanner cin = new Scanner(System.in);
            id = cin.nextInt();
            q = cin.nextInt();
            switch (id) {
                case 1:
                    sum += products[0].price * q;
                    break;
                case 2:
                    sum += products[1].price * q;
                    break;
                case 3:
                    sum += products[2].price * q;
                    break;
                case 4:
                    sum += products[3].price * q;
                    break;
                case 5:
                    sum += products[4].price * q;
                    break;

                default:
                    break;
            }
        }
        System.out.println(sum);
    }
}
