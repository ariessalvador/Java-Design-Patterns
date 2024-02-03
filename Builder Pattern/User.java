package BuilderPattern_Lab1;

public class User{
    protected final String firstName;
    protected final String lastName;
    protected final String email;
    protected final String address;
    protected final String phone;
    protected final int age;
    private User (User.UserBuilder userBuilder){
        this.firstName= userBuilder.firstName;
        this.lastName= userBuilder.lastName;
        this.email= userBuilder.email;
        this.address= userBuilder.address;
        this.phone= userBuilder.phone;
        this.age= userBuilder.age;
    }

    protected static class UserBuilder{
        private String firstName;
        private String lastName;
        private String email;
        private String address;
        private String phone;
        private int age;

        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }
        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }
        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }
        public UserBuilder Age(int age) {
            this.age = age;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }

}
