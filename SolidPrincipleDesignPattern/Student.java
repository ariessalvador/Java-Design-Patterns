package SolidPrincipleDesignPattern;

import java.util.ArrayList;
import java.util.List;
public class Student {
    private List<ResourceBorrowable> borrowedResources;

    public Student() {
        this.borrowedResources = new ArrayList<>();
    }

    public void borrowResource(ResourceBorrowable resource) {
        resource.borrow();
        borrowedResources.add(resource);
    }

    public List<ResourceBorrowable> getBorrowedResources() {
        return borrowedResources;
    }
}

