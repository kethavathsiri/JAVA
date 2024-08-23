import java.util.*;

/*class Week3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Book 1:");
        System.out.print("Book Name: ");
        String bookName1 = scanner.nextLine();
        System.out.print("Author Name: ");
        String author1 = scanner.nextLine();
        System.out.print("Initial Count: ");
        int count1 = scanner.nextInt();
        Book b1 = new Book(bookName1, author1, count1);

        System.out.println("\nEnter details for Book 2:");
        System.out.print("Book Name: ");
        scanner.nextLine(); // Consume the newline character left by nextInt()
        String bookName2 = scanner.nextLine();
        System.out.print("Author Name: ");
        String author2 = scanner.nextLine();
        System.out.print("Initial Count: ");
        int count2 = scanner.nextInt();
        Book b2 = new Book(bookName2, author2, count2);

        System.out.println("\nEnter customer details:");
        System.out.print("Customer Name: ");
        String customerName = scanner.next();
        
        customer c1 = new customer(customerName, author1, 0);
        c1.buy(b1);

        customer c2 = new customer(customerName, author2, 0);
        c2.buy(b2);
    }
}

class Book {
    String name, author;
    int count;

    public Book(String name, String author, int count) {
        this.name = name;
        this.author = author;
        this.count = count;
    }

    public void sell(int n) {
        if (n <= count) {
            count = count - n;
            System.out.println("Sold " + n + " copies of book " + name);
            System.out.println("Remaining copies = " + count);
        } else {
            System.out.println("Stock not available");
        }
    }
}

class customer {
    String name, address;
    int copiesToBuy;

    public customer(String name, String address, int copiesToBuy) {
        this.name = name;
        this.address = address;
        this.copiesToBuy = copiesToBuy;
    }

    public void buy(Book b) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(name + " is buying a book " + b.name);
        System.out.print("Enter the number of copies to buy: ");
        copiesToBuy = scanner.nextInt();
        b.sell(copiesToBuy);
    }
}*/
import java.util.*;

class Week3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store 5 books
        Book[] books = new Book[5];

        // Input details for 5 books
        for (int i = 0; i < 2; i++) {
            System.out.println("\nEnter details for Book " + (i + 1) + ":");
            System.out.print("Book Name: ");
            String bookName = scanner.nextLine();
            System.out.print("Author Name: ");
            String author = scanner.nextLine();
            System.out.print("Initial Count: ");
            int count = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left by nextInt()

            // Create a new Book object and store it in the array
            books[i] = new Book(bookName, author, count);
        }

        System.out.println("\nEnter customer details:");
        System.out.print("Customer Name: ");
        String customerName = scanner.next();
        System.out.print("Customer address :");
        String address=scanner.nextLine();
        scanner.nextLine();
        System.out.print("Customer Id :");
        int id=scanner.nextInt();

        // Create a customer object
        customer customer = new customer(customerName, address, id);

        // Allow the customer to buy books
        for (int i = 0; i < 2; i++) {
            customer.buy(books[i]);
        }
        
        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}

class Book {
    String name, author;
    int count;

    public Book(String name, String author, int count) {
        this.name = name;
        this.author = author;
        this.count = count;
    }

    public void sell(int n) {
        if (n <= count) {
            count = count - n;
            System.out.println("Sold " + n + " copies of book " + name);
            System.out.println("Remaining copies = " + count);
        } else {
            System.out.println("Stock not available");
        }
    }
}

class customer {
    String name, address;
    int copiesToBuy;

    public customer(String name, String address, int copiesToBuy) {
        this.name = name;
        this.address = address;
        this.copiesToBuy = copiesToBuy;
    }

    public void buy(Book b) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(name," is buying a book " + b.name);
        System.out.print("Enter the number of copies to buy: ");
        copiesToBuy = scanner.nextInt();
        b.sell(copiesToBuy);
    }
}




