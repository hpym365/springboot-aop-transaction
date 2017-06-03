# springboot-aop-transaction
# 在网上找了好多spring boot aop的例子 发现都是使用@Transcation注解来实现的，以前我们都使用aop直接切 这样不需要每个方法都写，这个工程就是干这个事儿的

# 建表语句在resource/table.sql下
# 数据源修改在resource/application.properties
# 测试在src/test/java/com.senyint/SpringbootAopTransactionApplicationTests 
# right是正确的直接提交  wrong是错误的事物回滚
