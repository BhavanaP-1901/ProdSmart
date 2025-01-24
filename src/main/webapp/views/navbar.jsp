<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/navbar.css">
<title>Navbar</title>
</head>
<body>
<div class="navbar">
    <h1>Product Management Portal</h1>
    <ul>
      <li><a href="add-product">Add Product</a></li>
      <li><a href="display-product">Display Product</a></li>
      <li class="dropdown">
        <a href="#">Dropdown</a>
        <div class="dropdown-content">
          <a href="#edit-product">Edit Product</a>
          <a href="#delete-product">Delete Product</a>
          <a href="#analytics">Analytics</a>
        </div>
      </li>
    </ul>
  </div>

</body>
</html>