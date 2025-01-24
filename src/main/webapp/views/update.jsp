<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/addpage.css">
<meta charset="UTF-8">
<title>Update Page</title>
</head>
<body>
<jsp:include page="navbar.jsp"></jsp:include>
<div class="container register">
                <div class="row">
                    <div class="col-md-3 register-left">
                        <img src="https://image.ibb.co/n7oTvU/logo_white.png" alt=""/>
                        <h3>Welcome</h3>
                        <p>You are 30 seconds away from earning your own money!</p>
                    </div>
                    <div class="col-md-9 register-right">
                        
                        <div class="tab-content" id="myTabContent">
                            <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                                <h3 class="register-heading">Update Product Details</h3>
                                <form action="update-product" method="POST">
                                <div class="row register-form">
                                    <div class="col-md-6 offset-md-3">
                                        <div class="form-group">
                                            <input type="number" class="form-control"name="pid" placeholder="Product Id *" value="${p.pid}" />
                                        </div>
                                        <div class="form-group">
                                            <input type="text" class="form-control" name="name" placeholder="Product Name *" value="${p.name}" />
                                        </div>
                                        <div class="form-group">
                                            <input type="number" class="form-control"name="price" placeholder="Price *" value="${p.price}" />
                                        </div>
                                        <div class="form-group">
                                            <input type="number" class="form-control" name="qty" placeholder="Quantity *" value="${p.qty}" />
                                        </div>
                                        <div class="form-group">
                                            <input type="text" class="form-control"  name="category" placeholder="Category *" value="${p.category}" />
                                        </div>
                                        <button type="submit" class="btn btn-success">Update Product</button>
                                  
                                        
                                    </div>
                                 
                                </div>
                              </form>
                            </div>
                         
                        </div>
                    </div>
                </div>

            </div>

</body>
</html>