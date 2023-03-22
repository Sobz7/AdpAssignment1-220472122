package za.ac.cput.domain;

public class Customer {

    private String name;
    private String surname;
    private String email;


    private Customer(){}

    public Customer(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class Builder {

        private String name;
        private String surname;
        private String email;


        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder copy (Customer customer){
            this.name = customer.name;
            this.surname = customer.surname;
            this.email = customer.email;
            return this;
        }

        public Customer build(){
            return new Customer(this);
        }
    }



}
