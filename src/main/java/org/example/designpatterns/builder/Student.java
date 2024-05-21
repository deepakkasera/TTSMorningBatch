package org.example.designpatterns.builder;

public class Student {
    String name;
    int age;
    String batch;
    String universityName;
    double psp;
    int gradYear;
    String phoneNumber;

    private Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.batch = builder.batch;
        this.gradYear = builder.gradYear;
        this.psp = builder.psp;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        String name;
        int age;
        String batch;
        String universityName;
        double psp;
        int gradYear;
        String phoneNumber;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;

        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Student build() {
            //Validations
            if (this.getGradYear() <= 2020) {
                throw new RuntimeException("Grad year should me after 2020");
            }
            if (this.getPsp() < 80) {
                throw new RuntimeException("Psp should be more than 80");
            }

            //Use this method to actually build the Student object.
            return new Student(this);
        }
    }
}
