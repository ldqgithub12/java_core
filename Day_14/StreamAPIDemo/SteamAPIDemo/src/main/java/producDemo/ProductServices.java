package producDemo;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ProductServices {
    //    In ra thông tin các sản phẩm trong giỏ hàng theo cấu trúc sau
    public void print(List<Product> list) {
        list
                .stream()
                .forEach(Product::printInfo);
    }

    //    ID - Tên - Giá - Thương Hiệu - Số lượng
//    Ví dụ : 1- OPPO Find X3 Pro - 19500000 - OPPO - 3
//
//    Tính tổng tiền tất cả sản phẩm trong giỏ hàng
    public int getTotalMoney(List<Product> list) {
        return list
                .stream()
                .map(product -> product.getPrice() * product.getCount())
                .reduce(0, (p1, p2) -> p1 + p2);
    }

    //    Tổng tiền mỗi sản phẩm = price * count
//
//    Tìm các sản phẩm của thuơng hiệu “Apple”
//
    public List<Product> getProductByBranch(List<Product> list, String name) {
        return list
                .stream()
                .filter(p -> p.getBrand().equals(name))
                .collect(Collectors.toList());
    }

    //    Tìm các sản phẩm có giá > 20000000
//
    public List<Product> getProductByPrice(List<Product> list, int price) {
        return list
                .stream()
                .filter(p -> p.getPrice() == price)
                .collect(Collectors.toList());
    }
//    Tìm các sản phẩm có chữ “pro” trong tên (Không phân biệt hoa thường)

    public List<Product> getListProductIncludePro(List<Product> list){
        return list
                .stream()
                .filter(p->p.getName().toLowerCase().contains("pro"))
                .collect(Collectors.toList());
    }
//
//    Thêm 1 sản phẩm bất kỳ vào trong mảng product
//
    public void addNewProduct(List<Product> list, Product product){
        list.add(product);
    }
//    Xóa tất cả sản phẩm của thương hiệu “Samsung” trong giỏ hàng
    public void deleteProductSamSung(List<Product> list){
        String inputString = "SamSung";
        list.removeIf(product -> product.getBrand().toLowerCase().equals(inputString.toLowerCase()));
        System.out.println("Delete Successfully");
    }
//
//    Sắp xếp giỏ hàng theo price tăng dần
    public List<Product> sortIncresing(List<Product> list){
        return (List<Product>) list
                .stream()
                .sorted();
    }
//
//    Sắp xếp giỏ hàng theo count giảm dần
//
//    Lấy ra 2 sản phẩm bất kỳ trong giỏ hàng
}
