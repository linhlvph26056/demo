package com.example.demo.b5.repository;

import com.example.demo.b5.model.GiangVien;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component("GiangVienSqlRepository")
public class GiangVienSqlRepository implements IGiangVienRepository {
    private static final ArrayList<GiangVien> Danh_SACH_GIANG_VIEN = new ArrayList<>();

    static {
        Danh_SACH_GIANG_VIEN.add(new GiangVien("gv1", "ten1", 2000));
        Danh_SACH_GIANG_VIEN.add(new GiangVien("gv2", "ten2", 1999));
        Danh_SACH_GIANG_VIEN.add(new GiangVien("gv3", "ten3", 1995));
        Danh_SACH_GIANG_VIEN.add(new GiangVien("gv4", "ten4", 2001));
    }

    @Override
    public ArrayList<GiangVien> getAll() {
        return Danh_SACH_GIANG_VIEN;
    }
}
