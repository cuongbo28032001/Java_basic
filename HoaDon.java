package HoaDon_KhachHang_SVThucHanh;
import java.text.DecimalFormat;
import java.util.Comparator;
public class HoaDon {
    private String soHD;
    private int soMatHang;
    private KhachHang kh=new KhachHang();
    private Hang dsHang[];
    NgayThang ngayHD=new NgayThang(1,1,2020);
    /**
     * Nhập số HĐ,
     * nhập số mặt hàng n;
     * nhập khách
     *  xin cấp phát mảng; nhập mảng hàng.
     * nhập ngày 
     */
    public void nhap(){   
        
    }// end of nhap()
    public double tinhTongTien(){
        //sv tự làm tính tổng số lượng*đơn giá
        return 0;
    }
    public void inHD()   { 
        DecimalFormat df=new DecimalFormat("###,###.0#");        
        
    } 
    /**
     * Sắp xếp danh sách hàng hóa theo 1 tiêu chí bất kỳ
     * public int compare trả lại
     * 0 nếu đưa tiêu chi so sánh t =t1
     * >0 nếu t>t1
     * <0 nếu t<t1
     */
    public  void sapXep(){   
        Comparator<Hang> c1;
    }
    public  Hang timMin(){
         Comparator<Hang> c;
         return null;
        };                  
}//end of class
    

