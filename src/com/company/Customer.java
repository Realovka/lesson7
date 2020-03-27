package com.company;

import java.util.Objects;

public class Customer {
        String name, secondName, address, telephone;

        public Customer(String name, String secondName, String address, String telephone) {
            this.name = name;
            this.secondName = secondName;
            this.address = address;
            this.telephone = telephone;

        }

        @Override
        public String toString() {
            return "com.company.Customer{" +
                    "name='" + name + '\'' +
                    ", secondName='" + secondName + '\'' +
                    ", address='" + address + '\'' +
                    ", telephone='" + telephone + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Customer customer = (Customer) o;
            return name.equals(customer.name) &&
                    secondName.equals(customer.secondName) &&
                    address.equals(customer.address) &&
                    telephone.equals(customer.telephone);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, secondName, address, telephone);
        }

    }

