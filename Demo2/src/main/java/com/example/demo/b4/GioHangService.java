package com.example.demo.b4;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Map;

@Service
@SessionScope
//{IOC,DI} -> Beans -> scope ->Application : tat chuong trinh
//{IOC,DI} -> Beans -> scope ->session : tat trinh duyet
//{IOC,DI} -> Beans -> Request ->Request : thuc hien 1 repuest
public class GioHangService {
    private final GioHang gioHang = new GioHang();

    public void themSanPham(Long spID, Integer soLuong) {
        Map<Long, Integer> dsSanPham = gioHang.getDanhSachSanPham();
        //Neu trong gio da co hang
        if (dsSanPham.containsKey(spID)) {
            //thi tangw so luowng
            // B1: lay so luowng hien tai
            Integer soLuongHienTai = dsSanPham.get(spID);
            //b2: Cong don
            Integer soLuongMoi = soLuongHienTai + soLuong;
            //B3 Cap nhat lai danh sach
            dsSanPham.put(spID, soLuongMoi);
        } else {
            // neu chua ton tai thi them moi
            dsSanPham.put(spID, soLuong);
        }
    }

    public Map<Long, Integer> xemSanPham() {
        return gioHang.getDanhSachSanPham();
    }
}
