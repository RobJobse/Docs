<#macro layout title>
<!doctype html>
<html lang="en">
<head>
	<title>${title}</title>
	<!-- Bootstrap CSS -->
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <!-- meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"-->	
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
  <script src="../javascripts/stupidtable.js?dev"></script>
  <script>
    $(function(){
        $("table").stupidtable();
    });
  </script>	
</head>

<body>
<nav class="nav">
  <a class="nav-link" href="/type">Types</a>   
  <a class="nav-link" href="/machine">Machines</a>
  <a class="nav-link" href="/document">Documenten</a>   
  <a class="nav-link" href="/typemap">TypeMap</a>   
  <a class="nav-link" href="/topics">Topics html file</a>     
</nav>


<div class="container">
	<h1>${title}</h1>
	<#nested>
</div>


</body>
</html>
</#macro>				