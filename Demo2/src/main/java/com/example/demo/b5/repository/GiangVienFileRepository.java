package com.example.demo.b5.repository;

import com.example.demo.b5.model.GiangVien;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository("GiangVienFileRepository") //  <=> @Component("GiangVienFileRepository")
public class GiangVienFileRepository implements IGiangVienRepository {
    private static final ArrayList<GiangVien> Danh_SACH_GIANG_VIEN = new ArrayList<>();

    static {
        Danh_SACH_GIANG_VIEN.add(new GiangVien("gv8", "ten5", 2004));
        Danh_SACH_GIANG_VIEN.add(new GiangVien("gv5", "ten6", 1985));
        Danh_SACH_GIANG_VIEN.add(new GiangVien("gv6", "ten7", 1975));
        Danh_SACH_GIANG_VIEN.add(new GiangVien("gv7", "ten8", 2001));
    }

    @Override
    public ArrayList<GiangVien> getAll() {
        return Danh_SACH_GIANG_VIEN;
    }
}
