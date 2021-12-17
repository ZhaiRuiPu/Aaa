package top.diruipu.common.core.constant;

/**
 * @author diruipu
 * @create 2021-12-17 9:21 AM
 * @ClassName SystemConstant
 * 系统常量
 */
public interface SystemConstant {
    /**
     * 排序规则：降序
     */
    String ORDER_DESC = "descending";
    /**
     * 排序规则：升序
     */
    String ORDER_ASC = "ascending";

    /**
     * Gateway请求头TOKEN名称（不要有空格）
     */
    String GATEWAY_TOKEN_HEADER = "GatewayToken";
    /**
     * Gateway请求头TOKEN值
     */
    String GATEWAY_TOKEN_VALUE = "febs:gateway:123456";

    /**
     * 允许下载的文件类型，根据需求自己添加（小写）
     */
    String[] VALID_FILE_TYPE = {"xlsx", "zip"};

    /**
     * 验证码 key前缀
     */
    String CODE_PREFIX = "febs.captcha.";

    /**
     * 异步线程池名称
     */
    String ASYNC_POOL = "febsAsyncThreadPool";

    /**
     * OAUTH2 令牌类型 https://oauth.net/2/bearer-tokens/
     */
    String OAUTH2_TOKEN_TYPE = "bearer";
    /**
     * Java默认临时目录
     */
    String JAVA_TEMP_DIR = "java.io.tmpdir";
    /**
     * utf-8
     */
    String UTF8 = "utf-8";
    /**
     * 注册用户角色ID
     */
    Long REGISTER_ROLE_ID = 2L;

    String LOCALHOST = "localhost";

    String LOCALHOST_IP = "127.0.0.1";

    String PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCF3qL5BRBi94J+6tJoB4zsN3RmhIvafgkqgZQJ6oPFAuSgnpEs050nTpk/8l9fhJqQfdLD2woom6d2yORjwV1vM03ciUdnCVcoVZPllRb/QOKbMlZl+UiUwwSK6mXaX3hhJ3aoePDPPnzArzEXbkfIUMcSryGB2a93Ivd+5UMlDVWFUme7ThL7q9OavzEbPCIehOvpdNazqbAdnhZlH0bMvTf3JAc2mVQN6gwb/mYKkjD/LJO3ZHhEDw/Pva5EnTI1Gbws4sMkXHw68Rb1meuA4QFkpAGGRlh9M7IQ7WvRY4A/SomAfE/+h2s6Tg53Wrx1nAsPnGVU+VIOeFw7kWRdAgMBAAECggEAPC9T5dC5BUVxjc3UuqBqYuirlEuS9LAlPs7y12Jvy2r5jpy7eAPLa5iSnYVCC5d6RevLjfI0Jv2T1HuM8qxEbXILV1MAnvo8DQ4sZ9MXe7qYJl4DKeVhFEB5Els/X2X8oPE1D5kP6pyVSat5zqbt7skiNuw1jENp943o50v7W/RzhH4Y6ys5IwalIMWTxILEtFTi24HW0iv+6OuaCXZjbcA3/GnJ4nyJAKVCqupu7VjCEaMlNc84ME/z3i8phDZxANNTPorXuLMSd4/XJ1OJFAsu+7j99Ipz9Pkk8nqhsODbyiHPdYVGdolZPkhwQzQQabhcYx7KWQRKWvI4XOW7oQKBgQDLZNbRyaVbEUp4nS1h2EgU8438TYIZ2JOd7MIGLOAA96t1gIfmGm6NtP9G11DhWxFsWJBdRk+XGm9QOT2NwIf3b9RFiVbsNqdn2N1CcJV/hynIbeiQ8/2zoMmPoQxE0iEYyBP2tQms135gBnOD2C219C81FhHjCqxLPxF5mqRkMwKBgQCofnG87WIPcSjGLYHIgEXIboNZrQGpbZX1F/QoOcXMgQB4vndfxQRgMbq2HScSn7ov84LIVPYslVxtg7T0xAf6ReThdQ/IKXXea+14++xMfeJKoOOrrNUdz5SoNaKO849PQC7p5Q4psBuavaytsSQYzjmxqTsm9Sosa8GietoFLwKBgFVDK258Om4nnHFdalXXBbiKtN2sXDqbeJ4+TsOp8ilVqbGzNMT4FZof4td+kXA27eHean4/aEPul/UoWa5fpF/MqE6SGTciXiEBXxdn/LOeJJzZviFtts+jOnuURoFfGPK7hOrpz2l+WILGkYwWhmr9NwDpBIyJv9o3UQsKEZnTAoGBAKh141m1LTmrNc0OapgAR8ThWUorg2HWQvvNeztMp8qTn9kY9Vk3LezPS5IRC6O/NvQCT1vkNkzU+Jg1+pJN/HvprbEMzT6e1U4QMlmn5tWDduCOg5J9NoabqFGVbnXmZf4iecU4UjSz8qV/xknStfhnF5/dR1rn+8Z15h+BHMHZAoGBAJ8ZjOGDW9rj5xsdLT0OK0zSri8KrY9FXqc4MCVu/tFdohZ5SvJC4dA7rG70rLzqqoVD9nqw2f0YY6B/JCmSstelR6ODmZG35rofTJmIDkLZhUCNxxICF8Cv/iQWBZyPJpUY/W6fVFQj2RVAPaOIzQBVRRMfSejoiRiGIuq5tuzY";

    String PAGE_NUM="page";

    String PAGE_SIZE="rows";
}