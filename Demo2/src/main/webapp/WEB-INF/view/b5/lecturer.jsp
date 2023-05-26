<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1>Danh sach san pham</h1>
<table class="table">
    <thead>
    <tr>
        <th scope="col">Lecturer</th>
        <th scope="col">Age</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${dsGiangVien}" var="gv">
        <tr>
            <td>${gv.maGiangVien}</td>
            <td>${2023 - gv.namSinh}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
