<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1>Product in cart</h1>
<a href="/b4/san-pham">Bach to list</a>
<table class="table">
    <thead>
    <tr>
        <th scope="col">Product id</th>
        <th scope="col">Quantity</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${sanPhamTrongGio}" var="sp">
        <tr>
            <td>${sp.key}</td>
            <td>${sp.value}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
