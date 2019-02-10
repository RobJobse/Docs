<@layout title="Soort">
	<table class="table table-sm table-hover">
	  <thead>
		 <tr>
			<th scope="col"></th>
			<th scope="col"></th>
			<th scope="col"></th>
			<th scope="col"></th>			
			<th scope="col"></th>				
			<th scope="col"></th>	
			<th scope="col"></th>		
		 </tr>
	  </thead>
	  <tbody>
    <#list items as machine>
        <tr>
            <td>${items.}</td>
            <td>${items.!""}</td>
            <td>${items.!""}</td>
            <td>${items.!""}</td>
            <td>${items.!""}</td>
            <td>${items.!""}</td>
            <td>${items.!""}</td>
            <td>${items.!""}</td>
            <td>${items.!""}</td>
            <td>${items.!""}</td>
            <td>${items.!""}</td>
            <td>${items.!""}</td>

        </tr>
    </#list>
	  </tbody>
</@layout>