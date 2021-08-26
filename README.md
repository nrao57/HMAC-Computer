# HMAC Calculator

This repo creates a Jar which can calculate the HMAC Signature for a json file with a secret

## Build jar from Maven Project
```
mvn package
```

## To Calculate HMAC in Hex and Base64

```
java -jar ./target/HmacComputer-1.0-SNAPSHOT.jar com.nikhilrrao.Main SECRET_STRING path/to/json
```

### Example
```
java -cp ./target/HmacComputer-1.0-SNAPSHOT.jar com.nikhilrrao.Main shpss_b70a520oeuoeuoneuthecu4930 ~/path/mock.json
```

## Output

The Java program should output both the Hex and Base64

### Example
```
Hex: 704a842eb5b0c96f8aede3cb203555081023206279525b2fb9a4088b3e0eb0b
Base64: BwSoQutbDJb4rt48sgNVUIECMgYnlSWy+5pAiLPg6ws=
```