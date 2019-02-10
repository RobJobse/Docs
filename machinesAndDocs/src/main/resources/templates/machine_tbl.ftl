<@layout title="Machines">
	<table class="table table-sm table-hover">
	  <thead>
		 <tr>
			<th scope="col">NR</th>
			<th scope="col">DOL</th>
			<th scope="col">TYPE</th>
			<th scope="col">NAAM</th>			
			<th scope="col">ORDER</th>				
			<th scope="col">KLANT</th>	
			<th scope="col">OPMERKING</th>		
		 </tr>
	  </thead>
	  <tbody>
    <#list items as machine>
        <tr>
            <td>${machine.nr}</td>
            <td>${machine.dol!""}</td>
            <td>${machine.type!""}</td>
            <td>${machine.naam!""}</td>
            <td>${machine.order!""}</td>
            <td>${machine.klant!""}</td>
            <td>${machine.opmerking!""}</td>
        </tr>
    </#list>
	  </tbody>
</@layout>