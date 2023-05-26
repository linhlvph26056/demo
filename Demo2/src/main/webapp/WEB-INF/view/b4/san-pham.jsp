<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1>Danh sach san pham</h1>
<table class="table">
    <thead>
    <tr>
        <th scope="col">Ten san pham</th>
        <th scope="col">So luong ton</th>
        <th scope="col">Don gia</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${danhSachSanPham}" var="sp">
        <tr>
            <td>${sp.tenSanPham}</td>
            <td>${sp.soLuongTon}</td>
            <td>${sp.giaHienTai}</td>
                <td>
                    <a href="/b4/cart/add/${sp.sanPhamId}">Add to cart</a>
                </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
