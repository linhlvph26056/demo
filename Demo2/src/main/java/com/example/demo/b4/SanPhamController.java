package com.example.demo.b4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/b4/san-pham")
public class SanPhamController {
    private static final List<SanPham>danhSachSanPham = new ArrayList<>();
    static {
        danhSachSanPham.add(new SanPham(1L,"Coc su",999, BigDecimal.valueOf(10000000)));
        danhSachSanPham.add(new SanPham(2L,"Dien thoai",999, BigDecimal.valueOf(5000000)));
        danhSachSanPham.add(new SanPham(3L,"laptop",2323, BigDecimal.valueOf(565656)));
        danhSachSanPham.add(new SanPham(4L,"Coc su",335, BigDecimal.valueOf(26666)));
        danhSachSanPham.add(new SanPham(5L,"Chuot",55, BigDecimal.valueOf(23333333)));
    }
    @GetMapping
    public String xemDanhSachSanPham(Model model){
        model.addAttribute("danhSachSanPham",danhSachSanPham);
        return "/b4/san-pham";
    }
}
