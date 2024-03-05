<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>user1::list</title>
</head>
<body>
    <h3>user1 목록</h3>

    <a href="/ch04">메인</a>
    <a href="/ch04/user1/register">등록</a>

    <table border="1">
        <tr>
            <th>아이디</th>
            <th>이름</th>
            <th>생년월일</th>
            <th>휴대폰</th>
            <th>나이</th>
            <th>관리</th>
        </tr>
        <tr>
            <td>a101</td>
            <td>홍길동</td>
            <td>2024-03-05</td>
            <td>010-1234-1001</td>
            <td>22</td>
            <td>
                <a href="#">수정</a>
                <a href="#">삭제</a>
            </td>
        </tr>
    </table>
</body>
</html>

