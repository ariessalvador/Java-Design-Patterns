package SolidPrincipleDesignPattern;

public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student();

        ResourceBorrowable book1 = new Book("Java Programming Basics");
        ResourceBorrowable book2 = new Book("Effective Java");
        ResourceBorrowable journal1 = new Journal("Advanced Computing Journal");
        ResourceBorrowable journal2 = new Journal("International Journal of Software Engineering");

        student.borrowResource(book1);
        student.borrowResource(book2);
        student.borrowResource(journal1);
        student.borrowResource(journal2);

        // Print borrowed resources
        System.out.println("Borrowed Resources:");
        for (ResourceBorrowable resource : student.getBorrowedResources()) {
            System.out.println(resource.getTitle());
        }
    }
}



