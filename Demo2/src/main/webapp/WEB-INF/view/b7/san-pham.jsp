<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1>Danh sach san pham</h1>
<table class="table">
    <thead>
    <tr>
        <th scope="col">Product id</th>
        <th scope="col">Product name</th>
        <th scope="col">Quantity</th>
        <th scope="col">Current price</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${dsSP}" var="sp">
        <tr>
            <td>${sp.productId}</td>
            <td>${sp.productName}</td>
            <td>${sp.price}</td>
            <td>${sp.quantity}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
