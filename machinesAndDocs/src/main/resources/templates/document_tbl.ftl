<@layout title="Documenten">
	<table class="table table-sm table-hover">
	  <thead>
		 <tr>
			<th scope="col">NR</th>
			<th scope="col">SOORT</th>
			<th scope="col">OMSCHRIJVING</th>
			<th scope="col">PARAAF</th>			
			<th scope="col">DATUM</th>				
			<th scope="col">LOCATIE</th>	
			<th scope="col">AFGELEID</th>		
		 </tr>
	  </thead>
	  <tbody>
    <#list items as document>
        <tr>
            <td>${document.nr}</td>
            <td>${document.soort!""}</td>
            <td>${document.omschrijving!""}</td>
            <td>${document.paraaf!""}</td>
            <td>${document.datum!""}</td>
            <td>${document.locatie!""}</td>
            <td>${document.afgeleid!""}</td>
        </tr>
    </#list>
	  </tbody>
</@layout>