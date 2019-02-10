<@layout title="Type">
	<table class="table table-sm table-hover">
	  <thead>
		 <tr>
			<th scope="col">NR</th>
			<th scope="col">NAAM</th>
			<th scope="col">KLANT</th>
			<th scope="col">ORDER</th>			
			<th scope="col">ARCHIEF</th>				
			<th scope="col">BACKUP</th>		
		 </tr>
	  </thead>
	  <tbody>
    <#list items as type>
        <tr>
            <td>${type.nr}</td>
            <td>${type.naam!""}</td>
            <td>${type.klant!""}</td>
            <td>${type.order!""}</td>
            <td>${type.archief!""}</td>
            <td>${type.backup!""}</td>
        </tr>
    </#list>
	  </tbody>
</@layout>