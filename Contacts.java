public class Contacts {
    private String country;
    private String region;
    private String city;
    private String street;
    private String apartmentNumber;
    private String postalCode;
    private String phoneNumber;
    private String email;
    private Contacts(Builder builder) {
        this.country = builder.country;
        this.region = builder.region;
        this.city = builder.city;
        this.street = builder.street;
        this.apartmentNumber = builder.apartmentNumber;
        this.postalCode = builder.postalCode;
        this.phoneNumber = builder.phoneNumber;
        this.email = builder.email;
    }
    public static class Builder {
        private String country;
        private String region;
        private String city;
        private String street;
        private String apartmentNumber;
        private String postalCode;
        private String phoneNumber;
        private String email;
        public Builder() {
        }

        public Builder country(String country) {
            this.country = country;
            return this;
        }

        public Builder region(String region) {
            this.region = region;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder street(String street) {
            this.street = street;
            return this;
        }

        public Builder apartmentNumber(String apartmentNumber) {
            this.apartmentNumber = apartmentNumber;
            return this;
        }

        public Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Contacts build() {
            return new Contacts(this);
        }
    }
}