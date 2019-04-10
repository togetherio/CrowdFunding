package com.fengbo.unit;

import java.net.URLEncoder;

import org.json.JSONObject;

import com.fengbo.bean.User;

/*
 * 获取身份证上的文字信息 
 */
public class IdCardUtil {
	
	public static void main(String[] args) {
		getIdCardMessage("F:\\CrowdFunding\\images\\IdCardImg\\9634991135.jpg");
	}

	public static User getIdCardMessage(String imgUrl){
        String idcardIdentificate = "https://aip.baidubce.com/rest/2.0/ocr/v1/idcard";
        String access_token = "24.bae522baa20eadb0bcf37fff6671e926.2592000.1557501340.282335-15910201";
        
        User user = new User();
        
        try {
			byte[] imgData = FileUtil.readFileByBytes(imgUrl);
			String imgStr = Base64Util.encode(imgData);
			String params = "id_card_side=front&" + URLEncoder.encode("image", "UTF-8") + "="
	                + URLEncoder.encode(imgStr, "UTF-8");
			String message = HttpUtil.post(idcardIdentificate, access_token, params);
			JSONObject jsonobject = new JSONObject(message);
			JSONObject words_result = jsonobject.getJSONObject("words_result");
			String name = words_result.getJSONObject("姓名").getString("words");
			String sex = words_result.getJSONObject("性别").getString("words");
			String etnic = words_result.getJSONObject("民族").getString("words");
			String bir = words_result.getJSONObject("出生").getString("words");
			String birth = bir.substring(0, 4)+"-"+bir.substring(4, 6)+"-"+bir.substring(6, 8);
			String address = words_result.getJSONObject("住址").getString("words");
			String idNum = words_result.getJSONObject("公民身份号码").getString("words");
			System.out.println(name+sex+etnic+birth+address+idNum);
			
			user.setUsRealname(name);
			user.setUsSex(sex);
			user.setUsEntic(etnic);
			user.setUsBirthday(birth);
			user.setUsAddress(address);
			user.setUsIdcard(idNum);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
}
