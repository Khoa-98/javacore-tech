public enum Gender {
    MALE ("nam"),
    FEMALE ("nữ");

    String value;

    Gender(String value){
        this.value= value;
    }

    public String getValue(){
        return value;
    }
}
