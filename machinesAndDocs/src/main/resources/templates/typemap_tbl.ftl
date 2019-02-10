<@layout title="TypeMap">
  <table class="table table-sm table-hover" >
    <thead>
      <tr>
        <th scope="col" data-sort="string">NR</th>
        <th scope="col" data-sort="string">NAAM</th>	
      </tr>
    </thead>
	<tbody>
       <#list items as typemap>
        <tr>
          <td>${typemap.nr}</td>
          <td>${typemap.naam!""}</td>
        </tr>
      </#list>
	</tbody>
</@layout>