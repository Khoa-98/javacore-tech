import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService();
        ArrayList<Product> products = service.getallProduct();
        service.show(products);

        System.out.println("Sản phẩn cần tìm là: ");
        service.searchByName(products, "bánh");

        Product updateProduct = service.searchById(products, 1);
        service.updateProduct(updateProduct, "Quạt điện cơ");
        service.updateProduct(updateProduct, 200000);

        System.out.println("Sản phẩm sau khi sửa tên và giá: ");
        System.out.println(updateProduct);

        service.deleteProduct(products, updateProduct );
        System.out.println("Danh sách sản phẩm sau khi xoá là: ");
        service.show(products);

        System.out.println("Thêm sản phẩm mới: ");
        Product newProduct = service.createNewProduct();
        service.addNewProduct(newProduct, products);

        System.out.println("Danh sách sản phẩm sau khi thêm: ");
        service.show(products);
    }
}
