package cn.xiayf.code.service;

import lombok.Data;

@Data
public class ConfigService {

    private String dataPath;
    private String handlers;

    private Integer concurrency = 50;

    private String rocksDBDirPath = "./rocksdb-data";
}
