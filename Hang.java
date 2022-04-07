package HoaDon_KhachHang_SVThucHanh;
public class Hang {
    private String tenHang;
    private double soLuong;
    private double donGia;
    /**
     * nhập thuộc tính tên hàng, số lượng, đơn giá
     */
    public void nhap(){
        
    }
    /**
     * 
     * @return số lượng* đơn giá
     */
    public double tinhTongTien(){
        return soLuong*donGia;
    }
    /**
     * bổ sung xâu định dạng tương ứng với các 4 dữ liệu
     * @biểu diễn các tiêu đề cho cột hàng trong hóa đơn
     */
    static void inTieuDe(){
        System.out.printf("",
                "ten hang", "so luong","don gia",
                "thanh tien");
    }
   /**
    * bổ sung xâu định dạng in dữ liệu thẳng hàng với tiêu đề
    */
    public void inDL(){
        System.out.printf("",
                tenHang,soLuong,donGia,tinhTongTien());
    }       
    
}
