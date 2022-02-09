public enum Catogery {
    PHONE ("Điện thoại"),
    LAPTOP ("Máy Tính"),
    TABLET ("Máy tính bảng"),
    SMARTWATCH ("Đồng Hồ Thông Minh"),
    ACCESSORY ("Phụ Kiện");

    private String value;
    Catogery(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

}
