package cn.acl.web;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by 刘万刚 on 2017/3/8.
 * 微信公众号平台接口
 */
@Controller
@RequestMapping("/validate")
public class ValidateController {

    @RequestMapping(method = RequestMethod.GET,produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String validate(String token,String signature,String nonce,String timestamp,String echostr){
        System.out.println("token:"+token+",signature:"+signature+",nonce:"+nonce+",timestamp:"+timestamp+",echostr:"+echostr);
        //是否验证微信服务器
        return echostr;
    }

    @RequestMapping(method = RequestMethod.POST,produces = "text/plain;charset=utf-8")
    public void message(HttpServletRequest request) throws IOException,DocumentException {
        ServletInputStream inputStream = request.getInputStream();
        SAXReader saxReader=new SAXReader();
        Document document = saxReader.read(inputStream);
        System.out.println(document.getDocument().asXML());
    }
}
