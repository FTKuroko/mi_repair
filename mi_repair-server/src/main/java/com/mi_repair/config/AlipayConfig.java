package com.mi_repair.config;

/**
 *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 */
public class AlipayConfig {
    //APPID
    public static String appId = "9021000137604757";
    //应用私钥
    public static String appPrivateKey = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCCNYwkWPDf2RQndPBoeMUcIofwrQSZMUtNvchZmuG6MVqAxhUzilct00VI19bLxLvXasR8l6e/qktCq5y8mXg9Y13x9LAG5s6qE+rJw9dvFuurH0RD6rmTW7Vx+28iIpQ/Uy8qrPx4YbSEfVHMitG7j9isvw52qT5u1AVP+u7L+fZ6fpAfb6QnU7uONo2Z/L4GOsdEVaaqBC/vKBDDbG7lm+Q2HVJcPzRpQ6V0ErmLSCPnQ91OJcJFXQSWM8fwNhhufdyK8V2bruyN0Mz7xt6EqJxMfXk9lRIkYsUxjQ1THscHGftMhyc2ZcV/qyQRrm4567/nM/HC3LYIAUZfXe+xAgMBAAECggEAWVQlJdaCwf9qTTtzpyibiZbDDkGUswhXcikuJxMToyoyvb+nUempr32Ovc+dw8PfXoUX8aYVZm+NHFsht13OWMcv70t/6+wyggoR/IPH66Wc3pQfwDxrPgYfr+fgMVnpvJvz8uIkfu4A6xgSozHlezjPXIvif1PSyjPYxSsQ4oxH/bazP5EMkj9jJ2C2/YBe7tFX8+lciyiOVkk+0DDi0yiz8FFqpgjhrQfRTfSDjjAExQcytHqRVsQt6bkFTN7brZL8zHT1I1RIuk6Qe8kPrORxACXOIGvEnFMiMJso2U6ILgs7L7ctuY2wAkrKCemKnRXTTLs4zwVIOKQXomO+pQKBgQDTGXKGdKY29jdMqDF11IY6zE88qMdfLxrW2JfzKhWwaBzcqOkLzE31zSTqGT23QP15n0wXJ7Gr1cBfYR4Z73Mg4owlrc+0qrzTaa7avl3kxyvBSIktbrYn6tzDAUwHbPWuNynJt/iEG3iVwJKtYwYLtyk9GFD9Lv17KigY4foQFwKBgQCd543ROnrrV65nSYahhVHpBPReQFVPVyARilrcWGQf3xXY0QnUEAcQoITAewUxX8bhwXrdTCUgcZ5t6NVYVZZXY2lp10YgH2enDmuerOLmhKJcgbh2v+b9FQWWTawHuWBeqp/Rf1Ev10gS5V7fHUedgyZyX2MaatppXlVY1v9TdwKBgBDIIxyhRV11MWw8qsHtRUaDW4E9AayFeCLAUUQZgmPlwvWfz/cKJOB3kImzu/5Hgl8a1Ne6Zht9ALAUbmotaP+iQvXz3WFFeYFtE2N8YsZ/NvFErPMZrA18VFSEU+D7PoS9CetpXq5R6MIu7vottxtTUknzFu0pwSj7bvibbl+9AoGAbOAwBMgR4RvAAS/NSKmoZMcpx6MML3yfe/it1aiMwP0ND0ZzRGkYtfo4Do/EcNrdQuQpV1UddFVjK92S3SmGVBMTqArrK1L8IU/sHKiQeumRGb/H9Pk0x+QqygwcRecn754uPEFRNW93HrBQzf5eVtkLNWlX5+stVeHZbzwvKNkCgYANcuksa/DPsqW9AFRB8OrLlzs8oU1er+MGrnsG8XSR7gElLKuOL/9IyY/6agoOY2A2nfZiGAI0blI9ZeE1UqZ7oQLOtO0/T05oxVjCFFtrcdSF3QZ58Sev8f0o6J0ynHvKtmpHSg+KF8g5pv7jMYEG3mK7plVPM8o9YngBiUD46w==";
    //支付宝公钥
    public static String aliPayPublicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgJBE6nFzs4d96rr1CrkCpffrLXLfi12IE51sBvngCzDmX6/GndPi9EcuEHpHUm+YSODQkPHLbhUlj5ZLDfxACFRIB1P8N80LJ9SPnQ016Ri6j0hlWd0eipsCArSts9mpjeydZhZYeI7q/inUBXx9FV+o9wxS1LAbcwU+hq6lsrMqUc6e6Wp9WuwnwaxhfFF8lhRxcwdkpmepJMhJC/rTNPWTuI5E6t+DXzsQPNdpaV5yXpry6qKBM+Cj0s0SIpCJvekbk9xjFB4GaXgoY0GweCk0531MqDQCRghkbdfNFMv9TiJrY/V0Ao9V4ifCHC3Ih6XyeLQUbgr1awp+npJDbQIDAQAB";
    //支付完成回调地址
    public static String notifyUrl;
    //支付完成跳转页面
    public static String returnUrl;
    //支付宝网关
    public static String gatewayUrl = "https://openapi-sandbox.dl.alipaydev.com/gateway.do";
}

