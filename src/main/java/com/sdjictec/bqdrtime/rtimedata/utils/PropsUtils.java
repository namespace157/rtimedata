package com.sdjictec.bqdrtime.rtimedata.utils;

import com.sdjictec.utils.OracleDruidPool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
/**
 * @author 牛国凯
 * @date 2019/6/11
 * Description:
 */
public class PropsUtils {
    private static final Logger logger = LoggerFactory.getLogger(OracleDruidPool.class);


    public static void writeProps(String key,String value){
        String profilepath = PropsUtils.class.getResource("/crontabShell.sh").getPath();//我的配置文件在src根目录下
        System.out.println(profilepath);
        try{
            Properties props=new Properties();
            props.load(new FileInputStream(profilepath));
            OutputStream fos = new FileOutputStream(profilepath);

            props.setProperty(key, value);
            props.store(fos, "Update value");
            fos.close();
        } catch( Exception e) {
            e.printStackTrace();
            System.err.println("配置文件文件更新错误！");
        }
    }
    public static String readProps(String key){
        InputStream inputStream = null;
        Properties p = null;
        try {
            inputStream =Object.class.getResourceAsStream("/crontabShell.sh");
            p = new Properties();
            p.load(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != inputStream) {
                    inputStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                logger.error("读取配置文件失败！");
            }
        }
        String value = p.getProperty(key);
        return value;
    }
//    public static void main(String[] args){
//
//        writeProps("infopassword","1234");
//        String str = readProps("infopassword");
//        System.out.println(str);
//    }

}
