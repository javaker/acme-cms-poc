<h2>${title}</h2>
<body>
<br>
<#if person.properties.firstName??>
  User name: ${person.properties.firstName}
</#if>
<br>
<#if person.properties.lastName??>
   User lastname: ${person.properties.lastName}
</#if>
</body>