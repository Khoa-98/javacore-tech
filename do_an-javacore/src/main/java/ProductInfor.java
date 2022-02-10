import java.util.ArrayList;

public class ProductInfor {
    public ArrayList<Product> listProduct;

    public ProductInfor(){
        listProduct = new ArrayList<>();
        listProduct.add(new Product(1, "Iphone 13 Pro Max 128G", 30999000, "A15 Bionic 6.7' 6 GB 128 GB", 20, 12, "Apple", Category.PHONE));
        listProduct.add(new Product(2, "Iphone 12 64G", 18499000, "A14 Bionic6.1\"4 GB64 GB", 21, 10, "Apple", Category.PHONE));
        listProduct.add(new Product(3, "Samsung Galaxy Z Fold3 5G 256G", 41999000, "Snapdragon 888Màn hình chính: 6.7”, Màn hình phụ: 1.9”8 GB128 GB", 16  , 9, "Samsung", Category.PHONE));
        listProduct.add(new Product(4, "Xiaomi Redmi Note 11 4G-64G", 4999000, "6.43\"4 GB64 GB", 25, 11, "Xiaomi", Category.PHONE));
        listProduct.add(new Product(5, "Oppo Find X3 Pro 5G", 19999000, "Snapdragon 8886.7\"12 GB256 GB", 26, 10, "Oppo", Category.PHONE));
        listProduct.add(new Product(6, "Asus Vivobook A515EA-BN1688T/i3-1115G4", 15600000, "15.6\"Core i38 GBSSD 256 GBIntel UHD Graphics1.8", 19, 10, "Asus", Category.LAPTOP));
        listProduct.add(new Product(7, "MacBook Pro 13\" 2020 Touch Bar 2.0GHz Core i5", 53999000, "15.6\"Core i38 GBSSD 256 GBIntel UHD Graphics1.8", 19, 10, "Apple", Category.LAPTOP));
        listProduct.add(new Product(8, "HP 240 G8 i5 1135G7/3D0F9PA", 16199000, "15.6\"Core i38 GBSSD 256 GBIntel UHD Graphics1.8", 19, 10, "HP", Category.LAPTOP));
        listProduct.add(new Product(9, "MSI Gaming Katana GF66 11UC 641VN i7 11800H", 26999000, "15.6\"Core i38 GBSSD 256 GBIntel UHD Graphics1.8", 19, 10, "MSI", Category.LAPTOP));
        listProduct.add(new Product(10, "Dell Inspiron N3505 R5 3450U", 17199000, "15.6\"Core i38 GBSSD 256 GBIntel UHD Graphics1.8", 19, 10, "DELL", Category.LAPTOP));
        listProduct.add(new Product(11, "Samsung Galaxy Tab S6 Lite", 9999000, "Exynos 961110.4\"4 GB64 GB7040 mAh", 31, 15, "SAMSUNG", Category.TABLET));
        listProduct.add(new Product(12, "iPad Pro 11 2021 M1 Wi-Fi 128GB", 19999000, "Exynos 961110.4\"4 GB64 GB7040 mAh", 31, 15, "Apple", Category.TABLET));
        listProduct.add(new Product(13, "Xiaomi Pab5 256G", 10390000, "Exynos 961110.4\"4 GB64 GB7040 mAh", 31, 15, "XIAOMI", Category.TABLET));
        listProduct.add(new Product(14, "Lenovo Tab P11 Pro WI-FI 4G 128GB", 14590000, "Exynos 961110.4\"4 GB64 GB7040 mAh", 31, 15, "LENOVO", Category.TABLET));
        listProduct.add(new Product(15, "Samsung Galaxy Watch 4 44mm", 6490000, "1.2\"Exynos W92016 GBSilicone", 33, 27, "SAMSUNG", Category.SMARTWATCH));
        listProduct.add(new Product(16, "Apple Watch SE GPS 40mm viền nhôm dây cao su", 6999000, "1.2\"Exynos W92016 GBSilicone", 33, 21, "Apple", Category.SMARTWATCH));
        listProduct.add(new Product(17, "Oppo Watch 41mm Wifi (OW19W6)", 4010000, "1.2\"Exynos W92016 GBSilicone", 33, 23, "Oppo", Category.SMARTWATCH));
        listProduct.add(new Product(18, "Vòng đeo tay thông minh Mi Band 6", 999000, "1.2\"Exynos W92016 GBSilicone", 33, 8, "Xiaomi", Category.SMARTWATCH));
        listProduct.add(new Product(19, "Huawei Watch Fit", 3290000, "1.2\"Exynos W92016 GBSilicone", 33, 21, "Huawei", Category.SMARTWATCH));
        listProduct.add(new Product(20, "Tai nghe AirPods Pro 2021", 4999000, "Tai nghe không dây Bluetooth", 50, 12, "Apple", Category.ACCESSORY));
        listProduct.add(new Product(21, " Sạc nhanh 20W USB-C Power Adapter", 549000, "Adapter sạc", 50, 25, "Apple", Category.ACCESSORY));
        listProduct.add(new Product(22, "Sạc dự phòng 20000mAh Xiaomi Mi 3 Pro", 990000, "20000 mAh Lithium-Polimer", 50, 9, "Xiaomi", Category.ACCESSORY));
        listProduct.add(new Product(23, "Loa Bluetooth Sony SRS-XB13", 1161000, "Loa Bluetooth 5W", 50, 7, "sony", Category.ACCESSORY));
        listProduct.add(new Product(24, "Chuột không dây Logitech M221", 319000, "Chuột không dây", 50, 15, "Logitech", Category.ACCESSORY));


    }
}
