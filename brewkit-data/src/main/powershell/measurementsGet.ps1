$json = @{'code'='SPICY'; 'name'='Spicy'} | ConvertTo-Json
$headers = @{ 'content-type'='application/json' }
Invoke-WebRequest -Uri "http://localhost:8080/brewkit-data-1.0-SNAPSHOT/api/measurements" -Method Get