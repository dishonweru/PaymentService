package com.concretepage.integration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.concretepage.entity.ApplicationConfig;
import com.concretepage.util.JSONUtil;
import com.concretepage.util.MyApplicationConfig;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

import okhttp3.*;

public class MobileBankingGateway {
	
	public ApplicationConfig appConfig;

	public static void main(String[] args)
			throws IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException, InvalidKeyException,
			NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException {
		// TODO Auto-generated method stub
		MobileBankingGateway gateway = new MobileBankingGateway();
		JSONUtil json_util = new JSONUtil();
		System.out.println("Response: " + json_util.parseAuthenticationResult(gateway.callMeBankGateway("AUTHENTICATION", "254728922238",
				"1234", gateway.appConfig,"","",""))[0]);

		/*byte[] cipher = encrypt(rightPadding("1234", 16), appConfig.getEncyptKey(), appConfig.getEncyptIv());
		System.out.println(DatatypeConverter.printHexBinary(cipher));
		System.out.println("---");

		byte[] encrypted_data_bytes = DatatypeConverter.parseHexBinary(DatatypeConverter.printHexBinary(cipher));

		byte[] decrypted = decrypt(encrypted_data_bytes, appConfig.getEncyptKey(), appConfig.getEncyptIv());
		System.out.println(DatatypeConverter.printHexBinary(decrypted));
		try {
			System.out.println(new String(decrypted, "UTF-8"));
		} catch (UnsupportedEncodingException e) { // TODO Auto-generated catch
													// block
			e.printStackTrace();
		}*/

	}
	public MobileBankingGateway(){
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(MyApplicationConfig.class);
		appConfig = (ApplicationConfig) context.getBean("appConfig");
	}

	public static String rightPadZeros(String str, int num) {
		return String.format("%1$-" + num + "s", str).replace(' ', '0');
	}

	public static String rightPadding(String str, int num) {
		return String.format("%1$-" + num + "s", str);
	}

	public String callMeBankGateway(String svc_code, String msisdn, String pin, ApplicationConfig appConfig, String fromAcc, String toAcc, String amount) {
		String json_resp = "";
		RequestBody formBody;
		try {
			OkHttpClient client = new OkHttpClient();
/*			RequestBody formBody = new FormBody.Builder().add("app_id", appConfig.getAppId())
					.add("app_password", appConfig.getAppPassword())
					.add("svc_code", svc_code)
					.add("pin",
							DatatypeConverter
									.printHexBinary(encrypt(pin, appConfig.getEncyptKey(), appConfig.getEncyptIv())))
					.add("msisdn",
							DatatypeConverter
									.printHexBinary(encrypt(msisdn, appConfig.getEncyptKey(), appConfig.getEncyptIv())))*/
			if(svc_code.contentEquals("AUTHENTICATION")){
				formBody = new FormBody.Builder().add("app_id", appConfig.getAppId())
						.add("app_pass", appConfig.getAppPassword())
						.add("svc_code", svc_code)
						.add("pin",pin)
						.add("msisdn",msisdn)
						.build();
			}else if(svc_code.contentEquals("FUNDS_TRANSFER")){
				formBody = new FormBody.Builder().add("app_id", appConfig.getAppId())
						.add("app_pass", appConfig.getAppPassword())
						.add("svc_code", svc_code)
						.add("pin",pin)
						.add("msisdn",msisdn)
						.add("userAcc", fromAcc)
						.add("toAcc", toAcc)
						.add("amount", amount)
						.build();
			}else{
				formBody = new FormBody.Builder().add("app_id", appConfig.getAppId())
						.add("app_pass", appConfig.getAppPassword())
						.add("svc_code", svc_code)
						.add("pin",pin)
						.add("msisdn",msisdn)
						.add("userAcc", fromAcc)						
						.build();
			}
			
			Request request = new Request.Builder().url(appConfig.getMeBankUrl()).post(formBody).build();
			Response response = client.newCall(request).execute();

			json_resp = response.body().string();
			System.out.println("Gateway Response: " + json_resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return json_resp;
	}

	public static byte[] encrypt(String plainText, String encryptionKey, String IV)
			throws IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
		byte[] i = DatatypeConverter.parseHexBinary(IV);
		byte[] a = DatatypeConverter.parseHexBinary(encryptionKey);

		Cipher cipher = null;
		try {
			System.out.println("Plain Text Value: " + plainText);
			cipher = Cipher.getInstance("AES/CBC/NoPadding", "SunJCE");
			SecretKeySpec key = new SecretKeySpec(a, "AES");
			cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec(i));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchProviderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidAlgorithmParameterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return cipher.doFinal(plainText.getBytes("UTF-8"));
	}

	public static byte[] decrypt(byte[] cipherText, String encryptionKey, String IV)
			throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException,
			InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		byte[] i = DatatypeConverter.parseHexBinary(IV);
		byte[] a = DatatypeConverter.parseHexBinary(encryptionKey);

		Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
		SecretKeySpec key = new SecretKeySpec(a, "AES");
		cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(i));

		return cipher.doFinal(cipherText);
	}
}
