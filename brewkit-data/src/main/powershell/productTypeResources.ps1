$json = @{'id'='1';'code'='LIQUID'; 'name'='Liquid'} | ConvertTo-Json
$headers = @{ 'content-type'='application/json' }
Invoke-WebRequest -Uri "http://localhost:8080/brewkit-data-1.0-SNAPSHOT/api/product-type/add" -Method Post -Body $json -Headers $headers