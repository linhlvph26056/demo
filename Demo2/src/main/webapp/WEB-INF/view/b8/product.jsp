<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1>Danh sach san pham</h1>
<form>
    Enter something : <input name="tenSanPham" value="${param.tenSanPham}">
    <input type="submit" value="Search">
</form>
<c:if test="${ page.isEmpty()}">
    <h2> Not found any records</h2>
</c:if>
<c:if test="${not page.isEmpty()}">
    <p> found ${page.getTotalElements()} records</p>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Product id</th>
            <th scope="col">Product name</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${page.getContent()}" var="sp">
            <tr>
                <td>${sp.maSanPham}</td>
                <td>${sp.tenSanPham}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div>
        <c:if test="${page.getNumber() + 1 > 1}">
            <a href="?page=${page.getNumber()}&tenSanPham=${param.tenSanPham}">
                Previous
            </a>
        </c:if>
        <span> ${page.getNumber() + 1} / ${page.getTotalPages()} </span>
        <c:if test="${page.getNumber() + 1 lt page.getTotalPages()}">
            <a href="?page=${page.getNumber() + 2}&tenSanPham=${param.tenSanPham}">
                Next
            </a>
        </c:if>
    </div>
</c:if>


