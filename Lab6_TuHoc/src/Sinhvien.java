import java.util.*;

class SinhVien {
    String ten;
    double diem;

    public SinhVien(String ten, double diem) {
        this.ten = ten;
        this.diem = diem;
    }

    public void hienThi() {
        System.out.println("Tên: " + ten + " | Điểm: " + diem);
    }
}

