<@layout title="Documenten">
	<table class="table table-sm table-hover">
	  <thead>
		 <tr>
			<th scope="col" data-sort="string">NR</th>
			<th scope="col" data-sort="string">SOORT</th>
			<th scope="col" data-sort="string">OMSCHRIJVING</th>
			<th scope="col" data-sort="string">PARAAF</th>			
			<th scope="col" data-sort="string">DATUM</th>				
			<th scope="col" data-sort="string">LOCATIE</th>	
			<th scope="col" data-sort="string">AFGELEID</th>		
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