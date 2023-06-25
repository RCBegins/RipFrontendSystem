<%-- 
    Document   : RateStory
    Created on : Jun 25, 2023, 12:18:53 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://kit.fontawesome.com/4eb5aff70c.js" crossorigin="anonymous"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
                                                                                                   <div id="radioStar">
  <form action="StoryServlet" method="post" >                                                                   
  <input type="radio" id="1star" name="rating" value="1">
  <label for="1star"><i class="fa-sharp fa-solid fa-star" style="color: #fff93d;"></i>1</label><br>
  <input type="radio" id="2star" name="rating" value="2">
  <label for="2star"><i class="fa-sharp fa-solid fa-star" style="color: #fff93d;"></i>2</label><br>
  <input type="radio" id="3star" name="rating" value="3">
  <label for="3star"><i class="fa-sharp fa-solid fa-star" style="color: #fff93d;"></i>3</label><br>
  <input type="radio" id="4star" name="rating" value="4">
  <label for="4star"><i class="fa-sharp fa-solid fa-star" style="color: #fff93d;"></i>4</label><br>
  <input type="radio" id="5star" name="rating" value="5">
  <label for="5star"><i class="fa-sharp fa-solid fa-star" style="color: #fff93d;"></i>5</label><br>
  <input type="hidden" name="storyId" value="<%=request.getAttribute("storyId")%>">
  
  <input type="submit" id="rateSubmit" name="submit" value="rateStory">
</form>
  </div>
    </body>
</html>
