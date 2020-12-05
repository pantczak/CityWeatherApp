import json
import requests

with open("../../Data/weather_16.json")as f:
    data = json_data = [json.loads(line) for line in f]
    count = 1
    for i in data:
        i["id"] = count
        count += 1
        r = requests.post("http://localhost:8080/api/weather", json=i)
        print(r.status_code, r.reason)
