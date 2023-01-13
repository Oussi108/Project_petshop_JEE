<%@page import="petShopProject.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
<title>Pet Shop</title>
<link rel="stylesheet" type="text/css" href="style.css" />

</head>
<body>
<div id="wrap">

      <jsp:include page="header.jsp" />  
       
       
       <div class="center_content">
       	<div class="left_content">
        	<div class="crumb_nav">
            <a href="index.jsp">home</a> &gt;&gt; category name
            </div>
            <div class="title"><span class="title_icon"><img src="images/bullet1.gif" alt="" title="" /></span>Category books</div>
           <%
           ProductsBean ProdB = (ProductsBean) request.getAttribute("ProductsBean");
			%>
           <div class="new_products">
           
                    
                    
                   <%
			   for (Product pro : ProdB.getAllProducts()) {
			   %>
			   <div class="new_prod_box">
                        <a href="details.jsp"><%=pro.getName() %>></a>
                        <div class="new_prod_bg">
                        <a href="details.jsp?id=<%=pro.getIdproduct() %>"><img src="images/<%=pro.getImage() %>" alt="" title="" class="thumb" border="0" /></a>
                        </div>           
                    </div>
			  
					    <%
		   }
		   %>
			   
			   

            <div class="pagination">
            <span class="disabled"><<</span><span class="current">1</span><a href="#?page=2">2</a><a href="#?page=3">3</a>...<a href="#?page=199">10</a><a href="#?page=200">11</a><a href="#?page=2">>></a>
            </div>  
            
            </div> 
          
            
        <div class="clear"></div>
        </div><!--end of left content-->
        
      <jsp:include page="right_side.jsp" />
        
        </div><!--end of right content-->
        
        
       
       
       <div class="clear"></div>
       </div><!--end of center content-->
       
              
     <jsp:include page="footer.jsp" />
    

</div>

</body>
</html>