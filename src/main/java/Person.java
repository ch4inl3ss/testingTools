public class Person {

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    private String fullName;


    public String getPreName(){
        return fullName.split(" ")[0];
    }
}
