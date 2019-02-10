<@layout title="TypeMap">
  <table class="table table-sm table-hover" >
    <thead>
      <tr>
        <th scope="col">NR</th>
        <th scope="col">NAAM</th>	
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