package za.ac.cput.domain;

public class Branch {

    private int branchID;
    private String branchName;
    private String address;
    private String city;
    private String managerName;

    private Branch(Builder builder) {
        this.branchID = builder.branchID;
        this.branchName = builder.branchName;
        this.address = builder.address;
        this.city = builder.city;
        this.managerName = builder.managerName;
    }

    public int getBranchID() { return branchID; }
    public String getBranchName() { return branchName; }
    public String getAddress() { return address; }
    public String getCity() { return city; }
    public String getManagerName() { return managerName; }

    public void listAvailableCarsAtBranch() {
        System.out.println("Listing available cars at " + branchName);
    }

    @Override
    public String toString() {
        return "Branch{" +
                "branchID=" + branchID +
                ", branchName='" + branchName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", managerName='" + managerName + '\'' +
                '}';
    }

    public static class Builder {
        private int branchID;
        private String branchName;
        private String address;
        private String city;
        private String managerName;

        public Builder setBranchID(int branchID) {
            this.branchID = branchID;
            return this;
        }

        public Builder setBranchName(String branchName) {
            this.branchName = branchName;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setManagerName(String managerName) {
            this.managerName = managerName;
            return this;
        }

        public Branch build() {
            return new Branch(this);
        }
    }
}