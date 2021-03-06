* 2014-10-27

  + 用netty构建http服务器&消息分发

* 2014-10-28
   
  + 调整`ActionMapping`抽象化
   
* 2014-10-31

  + `weixin.properties`切分为API调用地址和公众号appid等信息两部分
   
* 2014-11-03

  + 分离为`weixin-mp-api`和`weixin-mp-server`两个工程
   
  + 新增`支付模块`

* 2014-11-06
 
  + 新增V3版本`退款申请`接口
  
* 2014-11-08
 
  + 新增V2版本`退款申请`、`退款查询`、`对账单下载`三个接口
  
  + 新增一个简单的`语义理解`接口

* 2014-11-11

  + 自定义`assembly`将`weixin4j-base`工程也一起打包(`weixin4j-mp-api-full.jar`)
 
* 2014-11-15

  + 新增获取`微信服务器IP地址接口`
  
* 2014-11-16

  + 新增`多客服`接口
 
* 2014-11-17

  + 新增`冲正`和`被扫支付`接口
  
* 2014-12-12

  + 新增设置`模板消息所处行业`、`获取模板消息ID`接口
  
* 2014-12-16

  + 调整方法上@see注解的文档说明接口url
  
  + 新增群发消息预览、状态查询接口
  
  + 新增多客服添加账号、更新账号、上传头像、删除账号接口
  
* 2015-01-04

  + 支付模块拆分为V2跟V3,新增WeixinPayProxy类
  
  + 退款相关类拆分为V2跟V3
  
  + 新增接口上报接口
  
* 2015-01-31
  
  + 新增数据分析接口
  
* 2015-03-06
  
  + 新增oauth授权接口
  
* 2015-03-21

  + 新增群发消息给所有人接口
  
  + 新增素材管理多个接口
  
  + 新增多客服会话管理多个接口
  
* 2015-03-25

  + 根据《微信商户平台文档》修缮[Pay3Api](./src/main/java/com/foxinmy/weixin4j/mp/api/Pay3Api.java)类
  
* 2015-03-29

  + 单行注释调整为多行文档注释
  
  + 新增[CouponApi](./src/main/java/com/foxinmy/weixin4j/mp/api/CouponApi.java)代金券接口
  
* 2015-04-01

  + 新增[CashApi](./src/main/java/com/foxinmy/weixin4j/mp/api/CashApi.java)发红包、企业付款接口
  
* 2015-04-13

  + 新增WeixinTokenCreator与WeixinJSTicketCreator类
  
  + 新增用户分组批量移动、删除组别接口
  
* 2015-04-16

  + **weixin4j-mp-api**: <font color="red">调整[二维码参数](./src/main/java/com/foxinmy/weixin4j/mp/model/QRParameter.java)类</font>
  
  + **weixin4j-mp-api**: 新增获取[自定义菜单配置、自动回复配置](./src/main/java/com/foxinmy/weixin4j/mp/api/HelperApi.java)接口
  
* 2015-04-18

  + <font color="red">调整[客服接口](./src/main/java/com/foxinmy/weixin4j/mp/api/CustomApi.java)类的方法名</font>
  
  + <font color="red">在[二维码接口](./src/main/java/com/foxinmy/weixin4j/mp/api/QRApi.java)类新增获取二维码url方法</font>
   
* 2015-06-04

  + 新增查询红包接口