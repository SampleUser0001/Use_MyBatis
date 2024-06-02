# Use_MyBatis

MyBatisを使う

## ファイルリスト

``` txt
Use_MyBatis/app/src/main

$ tree
.
├── java
│   └── ittimfn
│       └── usemybatis
│           ├── App.java
│           ├── enums
│           │   └── PropertiesEnum.java
│           ├── mapper
│           │   └── SampleMapper.java
│           ├── model
│           │   └── SampleModel.java
│           ├── service
│           │   └── SampleService.java
│           └── util
│               └── MyBatisUtil.java
└── resources
    ├── application.properties
    ├── database
    │   ├── datas
    │   │   └── sample_table.csv
    │   ├── ddl
    │   │   └── sample_table.ddl
    │   ├── mapper
    │   │   └── SampleMapper.xml
    │   └── sample.db
    ├── log4j2.xml
    └── mybatis-config.xml

13 directories, 13 files
```

## 実行結果

``` txt

> Task :app:run
2024/06/02 14:25:01.675 [main] INFO   ittimfn.usemybatis.App line:41 Use MyBatis Start.
2024/06/02 14:25:01.834 [main] DEBUG  ittimfn.usemybatis.mapper.SampleMapper.selectById line:135 ==>  Preparing: SELECT id, value FROM sample_table WHERE id = ?
2024/06/02 14:25:01.844 [main] DEBUG  ittimfn.usemybatis.mapper.SampleMapper.selectById line:135 ==> Parameters: 1(Integer)
2024/06/02 14:25:01.853 [main] TRACE  ittimfn.usemybatis.mapper.SampleMapper.selectById line:141 <==    Columns: id, value
2024/06/02 14:25:01.854 [main] TRACE  ittimfn.usemybatis.mapper.SampleMapper.selectById line:141 <==        Row: 1, hoge
2024/06/02 14:25:01.855 [main] DEBUG  ittimfn.usemybatis.mapper.SampleMapper.selectById line:135 <==      Total: 1
2024/06/02 14:25:01.858 [main] DEBUG  ittimfn.usemybatis.mapper.SampleMapper.selectAll line:135 ==>  Preparing: SELECT id, value FROM sample_table
2024/06/02 14:25:01.858 [main] DEBUG  ittimfn.usemybatis.mapper.SampleMapper.selectAll line:135 ==> Parameters: 
2024/06/02 14:25:01.859 [main] TRACE  ittimfn.usemybatis.mapper.SampleMapper.selectAll line:141 <==    Columns: id, value
2024/06/02 14:25:01.859 [main] TRACE  ittimfn.usemybatis.mapper.SampleMapper.selectAll line:141 <==        Row: 1, hoge
2024/06/02 14:25:01.859 [main] TRACE  ittimfn.usemybatis.mapper.SampleMapper.selectAll line:141 <==        Row: 2, piyo
2024/06/02 14:25:01.859 [main] TRACE  ittimfn.usemybatis.mapper.SampleMapper.selectAll line:141 <==        Row: 3, fuga
2024/06/02 14:25:01.859 [main] DEBUG  ittimfn.usemybatis.mapper.SampleMapper.selectAll line:135 <==      Total: 3
2024/06/02 14:25:01.867 [main] DEBUG  ittimfn.usemybatis.mapper.SampleMapper.selectInId line:135 ==>  Preparing: SELECT id, value FROM sample_table WHERE id IN ( ? , ? )
2024/06/02 14:25:01.867 [main] DEBUG  ittimfn.usemybatis.mapper.SampleMapper.selectInId line:135 ==> Parameters: 1(Integer), 3(Integer)
2024/06/02 14:25:01.867 [main] TRACE  ittimfn.usemybatis.mapper.SampleMapper.selectInId line:141 <==    Columns: id, value
2024/06/02 14:25:01.868 [main] TRACE  ittimfn.usemybatis.mapper.SampleMapper.selectInId line:141 <==        Row: 1, hoge
2024/06/02 14:25:01.868 [main] TRACE  ittimfn.usemybatis.mapper.SampleMapper.selectInId line:141 <==        Row: 3, fuga
2024/06/02 14:25:01.868 [main] DEBUG  ittimfn.usemybatis.mapper.SampleMapper.selectInId line:135 <==      Total: 2
2024/06/02 14:25:01.868 [main] INFO   ittimfn.usemybatis.App line:49 Use MyBatis Finish.

BUILD SUCCESSFUL in 759ms
3 actionable tasks: 1 executed, 2 up-to-date
```

## 参考

- [MyBatis : Getting Started](https://mybatis.org/mybatis-3/getting-started.html)