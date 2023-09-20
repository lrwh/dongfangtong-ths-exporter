
## 东方通 THS（TongHttpServer）

启动时指定 api 地址，变量为

```shell

java -jar dongfangtong-ths-exporter.jar --ths.url=http://localhost:8080/api/http/monitor/format/json

```


## 指标

| 指标 | 描述 |
| -- | -- |
| `ths_info_up` | 启动信息 |
| `ths_server_zone_response` | zone response |
| `ths_server_zone_request` | zone request |
| `ths_server_zone_traffic` | zone traffic |
| `ths_shared_zone_size` | zone size |
| `ths_server_zone_over_count` | zone over count|
| `ths_connections` | `ths` connects |