# UTC-Converter

## Build jar from Maven Project
```
mvn package
```

## To Calculate HMAC in Hex and Base64

```
java -jar ./target/HmacComputer-1.0-SNAPSHOT.jar com.nikhilrrao.Main SECRET_STRING path/to/json
```

```
java -cp ./target/HmacComputer-1.0-SNAPSHOT.jar com.nikhilrrao.Main shpss_b70a520oeuoeuoneuthecu4930 ~/path/mock.json
```
