package com.foxinmy.weixin4j.model;

import java.nio.charset.Charset;

/**
 * 常量类
 * 
 * @className Consts
 * @author jy
 * @date 2014年12月3日
 * @since JDK 1.7
 * @see
 */
public final class Consts {
	public static final Charset UTF_8 = Charset.forName("UTF-8");
	public static final Charset GBK = Charset.forName("GBK");
	public static final String SUCCESS = "SUCCESS";
	public static final String FAIL = "FAIL";
	public static final String SunX509 = "SunX509";
	public static final String JKS = "JKS";
	public static final String PKCS12 = "PKCS12";
	public static final String TLS = "TLS";
	public static final String X509 = "X.509";
	public static final String AES = "AES";
	public static final String MD5 = "MD5";
	public static final String SHA = "SHA";
	public static final String SHA1 = "SHA-1";
	public static final String PROTOCOL_FILE = "file";
	public static final String PROTOCOL_JAR = "jar";

	/**
	 * 公众平台获取token的url
	 */
	public static final String MP_ASSESS_TOKEN_URL = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=%s&secret=%s";
	/**
	 * 企业号获取token的url
	 */
	public static final String QY_ASSESS_TOKEN_URL = "https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=%s&corpsecret=%s";
	/**
	 * 企业号提供商获取token的url
	 */
	public static final String QY_PROVIDER_TOKEN_URL = "https://qyapi.weixin.qq.com/cgi-bin/service/get_provider_token";
	/**
	 * 公众平台jssdk获取token的url
	 */
	public static final String MP_JS_TICKET_URL = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=%s&type=jsapi";
	/**
	 * 企业号jssdk获取token的url
	 */
	public static final String QY_JS_TICKET_URL = "https://qyapi.weixin.qq.com/cgi-bin/get_jsapi_ticket?access_token=%s";
	/**
	 * 商户平台下统一订单生成的url
	 */
	public static final String UNIFIEDORDER = "https://api.mch.weixin.qq.com/pay/unifiedorder";
	/**
	 * 商户平台下刷卡支付的url
	 */
	public static final String MICROPAYURL = "https://api.mch.weixin.qq.com/pay/micropay";
	/**
	 * V2支付下natvie支付的url
	 */
	public static final String NATIVEURLV2 = "weixin://wxpay/bizpayurl?sign=%s&appid=%s&productid=%s&timestamp=%s&noncestr=%s";
	/**
	 * 商户平台(V3)下native支付的url
	 */
	public static final String NATIVEURLV3 = "weixin://wxpay/bizpayurl?sign=%s&appid=%s&mch_id=%s&product_id=%s&time_stamp=%s&nonce_str=%s";
}
