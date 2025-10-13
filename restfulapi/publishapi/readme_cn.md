# 基于Publishing API操作应用

## 简介

本示例展示了如何通过代码调用Publishing API查询HarmonyOS应用/元服务的详细信息。


## 配置与使用

1. 下载代码，将PublishApiDemo示例中clientId、clientSecret和appId的值替换成应用实际的数值，获取方式可参见[查看应用信息](https://developer.huawei.com/consumer/cn/doc/app/agc-help-view-app-info-0000002282674569)。 
2. 运行PublishApiDemo代码工程。


## 工程目录

```
├──publishapi_demo/src/test       // 代码区       
│  ├──GetAppInfo.java             // 查询应用信息接口代码文件
│  ├──GetToken.java               // 获取Token代码文件
│  └──PublishApiDemo.java         // 主程序代码文件
```


## 相关权限

不涉及。

## 约束与限制

服务器必须支持Java 8或更高版本。 