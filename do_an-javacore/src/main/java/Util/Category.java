package Util;

public enum Category {
    PHONE ("Điện thoại"),
    LAPTOP ("Máy Tính"),
    TABLET ("Máy tính bảng"),
    SMARTWATCH ("Đồng Hồ Thông Minh"),
    ACCESSORY ("Phụ Kiện");

    private String value;
    Category(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

}
