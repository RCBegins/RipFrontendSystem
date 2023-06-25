<%-- 
    Document   : HomePage.jsp
    Created on : Jun 12, 2023, 8:54:01 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@page import="java.util.List"%>
    <%@page import="Models.StoryElements.Story"%>
    <%@page import="Models.UserTypes.Writer"%>
    <%@page import="Models.StoryElements.Comment"%>
     <%@page import="Models.UserTypes.User"%>
<!DOCTYPE html>
<html>
     
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/horizontal_scrollBar.css">
<link rel="stylesheet" href="css/centerhorizontalbar.css">
    </head>
    <body>
        	 
                    <div class="row" style="margin-left: 200px;">
                        
                                                                 
				 
                        <form action="StoryServlet">
                                                                      <label for="commentArea" style="margin-right: 100px">Type your comment</label>
                                                                   <textarea type="text" id="commentArea" name="commentArea" rows="4" cols="50" maxlength="500"></textarea>><br>
                                                                   <input type="submit" name="submit"  value="comment">
                                                               </form>
                                                                 </div>   
                                                      
	 
    </body>
</html>
