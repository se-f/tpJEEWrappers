<html>
<head>
    <title>ServletResponse Wrapper Demo</title>
</head>
<body>
<b> Please enter your name : ? </b>
<br />
<br />
<br />
<form action="MyServ">
    Name : <input type="text" name="username" /> City : <input type="text" name="cityname" />
    <input type="submit" name="submit" />
</form>

<%--   Form action = MyServ  -> Lorsque le bouton de submit est cliqué, une requête
 de type "post" ayant comme champs username et cityname sera envoyée au servlet MyServ --%>

</body>
</html>