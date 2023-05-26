package com.example.demo.b4;

import java.util.HashMap;
import java.util.Map;

public class GioHang {
    // Long <-> ma san pham
    // Integer <-> So luowng sanr phamr
    private Map<Long, Integer> danhSachSanPham = new HashMap<>();


    public Map<Long, Integer> getDanhSachSanPham() {
        return danhSachSanPham;
    }

    public void setDanhSachSanPham(Map<Long, Integer> danhSachSanPham) {
        this.danhSachSanPham = danhSachSanPham;
    }
}
